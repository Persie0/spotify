package com.persie.spotifymuter;

import android.content.ComponentName;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SpotifySessionService extends NotificationListenerService {
    private static final String TAG = "SpotifyAdMuter";

    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final AdBreakTracker adBreakTracker = new AdBreakTracker();
    private final Map<MediaSession.Token, SessionRecord> spotifyControllers = new HashMap<>();

    private MediaSessionManager mediaSessionManager;
    private ComponentName listenerComponent;
    private boolean connected;
    private boolean sessionListenerRegistered;

    private final MediaSessionManager.OnActiveSessionsChangedListener sessionListener =
            this::attachControllers;

    private final Runnable recheckAdBreak = this::evaluateAdState;

    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
        if (connected) {
            return;
        }
        connected = true;
        listenerComponent = new ComponentName(this, SpotifySessionService.class);
        mediaSessionManager = getSystemService(MediaSessionManager.class);

        if (mediaSessionManager == null) {
            VolumeMuter.restore(this);
            return;
        }

        try {
            mediaSessionManager.addOnActiveSessionsChangedListener(
                    sessionListener, listenerComponent, mainHandler);
            sessionListenerRegistered = true;
            attachControllers(mediaSessionManager.getActiveSessions(listenerComponent));
        } catch (SecurityException e) {
            Log.e(TAG, "Notification access was not accepted by MediaSessionManager", e);
            VolumeMuter.restore(this);
        }
    }

    @Override
    public void onListenerDisconnected() {
        shutdown();
        super.onListenerDisconnected();
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        if (sbn != null && AdDetector.SPOTIFY_PACKAGE.equals(sbn.getPackageName())
                && spotifyControllers.isEmpty()) {
            refreshSessions();
        }
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        if (sbn != null && AdDetector.SPOTIFY_PACKAGE.equals(sbn.getPackageName())) {
            refreshSessions();
        }
    }

    @Override
    public void onDestroy() {
        shutdown();
        mainHandler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    private void shutdown() {
        connected = false;
        cancelRecheck();
        adBreakTracker.reset();
        if (mediaSessionManager != null && sessionListenerRegistered) {
            try {
                mediaSessionManager.removeOnActiveSessionsChangedListener(sessionListener);
            } catch (RuntimeException ignored) {
                // Android may have already detached this listener.
            }
            sessionListenerRegistered = false;
        }
        clearControllers();
        VolumeMuter.restore(this);
    }

    private void refreshSessions() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            mainHandler.post(this::refreshSessions);
            return;
        }
        if (!connected || mediaSessionManager == null || listenerComponent == null) {
            return;
        }
        try {
            attachControllers(mediaSessionManager.getActiveSessions(listenerComponent));
        } catch (SecurityException e) {
            Log.w(TAG, "Unable to refresh media sessions", e);
        }
    }

    // Reconcile by session token: notification updates must not unregister live callbacks.
    private void attachControllers(List<MediaController> controllers) {
        if (!connected) {
            return;
        }

        Set<MediaSession.Token> activeTokens = new HashSet<>();
        if (controllers != null) {
            for (MediaController controller : controllers) {
                if (AdDetector.SPOTIFY_PACKAGE.equals(controller.getPackageName())) {
                    activeTokens.add(controller.getSessionToken());
                }
            }
        }

        for (MediaSession.Token token : new HashSet<>(spotifyControllers.keySet())) {
            if (!activeTokens.contains(token)) {
                SessionRecord previous = spotifyControllers.remove(token);
                if (previous != null) {
                    previous.unregister();
                }
            }
        }

        if (controllers != null) {
            for (MediaController controller : controllers) {
                if (!AdDetector.SPOTIFY_PACKAGE.equals(controller.getPackageName())
                        || spotifyControllers.containsKey(controller.getSessionToken())) {
                    continue;
                }

                SessionRecord record = new SessionRecord(controller);
                spotifyControllers.put(controller.getSessionToken(), record);
                record.register();
            }
        }
        evaluateAdState();
    }

    private void clearControllers() {
        for (SessionRecord record : spotifyControllers.values()) {
            record.unregister();
        }
        spotifyControllers.clear();
    }

    private boolean hasActiveAd() {
        for (SessionRecord record : spotifyControllers.values()) {
            if (isActiveSpotify(record)
                    && AdDetector.isAd(record.metadata)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isActiveSpotify(SessionRecord record) {
        return AdDetector.isActiveSpotifyPlayback(
                record.controller.getPackageName(),
                record.playbackState == null
                        ? PlaybackState.STATE_NONE : record.playbackState.getState());
    }

    private boolean hasActiveSpotifyPlayback() {
        for (SessionRecord record : spotifyControllers.values()) {
            if (isActiveSpotify(record)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSpotifyTransitionState() {
        for (SessionRecord record : spotifyControllers.values()) {
            if (!AdDetector.SPOTIFY_PACKAGE.equals(record.controller.getPackageName())
                    || record.playbackState == null) {
                continue;
            }
            int state = record.playbackState.getState();
            if (state == PlaybackState.STATE_BUFFERING
                    || state == PlaybackState.STATE_CONNECTING
                    || state == PlaybackState.STATE_SKIPPING_TO_NEXT
                    || state == PlaybackState.STATE_SKIPPING_TO_PREVIOUS
                    || state == PlaybackState.STATE_SKIPPING_TO_QUEUE_ITEM) {
                return true;
            }
        }
        return false;
    }

    private String playingNormalContentIdentity() {
        for (SessionRecord record : spotifyControllers.values()) {
            if (isActiveSpotify(record)) {
                String id = AdDetector.normalContentIdentity(record.metadata);
                if (id != null) {
                    return id;
                }
            }
        }
        return null;
    }

    private void evaluateAdState() {
        if (!connected) {
            return;
        }

        boolean spotifyPlaying = hasActiveSpotifyPlayback();
        boolean muted = VolumeMuter.isMutedByApp(this);

        if (spotifyPlaying && hasActiveAd()) {
            cancelRecheck();
            adBreakTracker.reset();
            if (!muted) {
                Log.d(TAG, "Spotify ad detected; muting media stream");
            }
            VolumeMuter.mute(this);
            return;
        }

        if (!muted) {
            // Do not track prospective song identities when an ad has not been detected.
            cancelRecheck();
            adBreakTracker.reset();
            return;
        }

        long nowMs = android.os.SystemClock.elapsedRealtime();

        if (spotifyPlaying) {
            adBreakTracker.cancelInactivity();
            String contentId = playingNormalContentIdentity();
            if (contentId == null) {
                // A missing/cleared ad marker, artwork, title, or intermediate ad
                // is NOT proof of a new song. Keep the existing mute.
                adBreakTracker.cancelContentCandidate();
                cancelRecheck();
                return;
            }

            if (adBreakTracker.isContentConfirmed(contentId, nowMs)) {
                cancelRecheck();
                adBreakTracker.reset();
                Log.d(TAG, "Stable normal Spotify content confirmed; restoring music volume");
                VolumeMuter.restore(this);
            } else {
                // Same track identity must remain actively playing for the full window.
                // Repeated callbacks cannot extend the window.
                scheduleRecheck(adBreakTracker.contentCheckDelayMs(nowMs));
            }
            return;
        }

        adBreakTracker.cancelContentCandidate();
        if (hasSpotifyTransitionState()) {
            // Spotify can buffer or skip between ad 1/3, 2/3 and 3/3.
            // These transitions do not imply that the ad break has ended.
            adBreakTracker.cancelInactivity();
            cancelRecheck();
            return;
        }

        // Failsafe for a genuine stop, pause or lost Spotify session: do not
        // leave Android's GLOBAL media volume muted indefinitely.
        if (adBreakTracker.isInactiveLongEnough(nowMs)) {
            cancelRecheck();
            adBreakTracker.reset();
            Log.d(TAG, "Spotify remained inactive; restoring media volume (failsafe)");
            VolumeMuter.restore(this);
        } else {
            scheduleRecheck(adBreakTracker.inactivityCheckDelayMs(nowMs));
        }
    }

    private void scheduleRecheck(long delayMs) {
        mainHandler.removeCallbacks(recheckAdBreak);
        mainHandler.postDelayed(recheckAdBreak, delayMs);
    }

    private void cancelRecheck() {
        mainHandler.removeCallbacks(recheckAdBreak);
    }

    private final class SessionRecord {
        final MediaController controller;
        MediaMetadata metadata;
        PlaybackState playbackState;

        final MediaController.Callback callback = new MediaController.Callback() {
            @Override
            public void onMetadataChanged(MediaMetadata newMetadata) {
                if (spotifyControllers.get(controller.getSessionToken()) != SessionRecord.this) {
                    return;
                }
                metadata = newMetadata;
                evaluateAdState();
            }

            @Override
            public void onPlaybackStateChanged(PlaybackState state) {
                if (spotifyControllers.get(controller.getSessionToken()) != SessionRecord.this) {
                    return;
                }
                playbackState = state;
                if (metadata == null) {
                    metadata = controller.getMetadata();
                }
                // Paused, stopped, or buffering Spotify must not mute another app.
                // Recheck metadata as soon as Spotify resumes active playback.
                evaluateAdState();
            }

            @Override
            public void onSessionDestroyed() {
                refreshSessions();
            }
        };

        SessionRecord(MediaController controller) {
            this.controller = controller;
        }

        void register() {
            controller.registerCallback(callback, mainHandler);
            playbackState = controller.getPlaybackState();
            metadata = controller.getMetadata();
        }

        void unregister() {
            try {
                controller.unregisterCallback(callback);
            } catch (RuntimeException ignored) {
                // The session may disappear while detaching.
            }
        }
    }
}
