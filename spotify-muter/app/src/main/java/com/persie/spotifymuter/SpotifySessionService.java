package com.persie.spotifymuter;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
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

    // Only used if Spotify briefly clears its metadata. Recognized music restores immediately.
    private static final long UNKNOWN_METADATA_GRACE_MS = 250L;

    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Map<MediaSession.Token, SessionRecord> spotifyControllers = new HashMap<>();

    private MediaSessionManager mediaSessionManager;
    private ComponentName listenerComponent;
    private SharedPreferences detectionSettings;
    private boolean connected;
    private boolean sessionListenerRegistered;
    private boolean unknownRestorePending;

    private final MediaSessionManager.OnActiveSessionsChangedListener sessionListener =
            this::attachControllers;

    private final SharedPreferences.OnSharedPreferenceChangeListener settingsListener =
            (preferences, key) -> {
                if (AdDetector.MUTE_SHORT_TRACKS_KEY.equals(key)) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        evaluateAdState();
                    } else {
                        mainHandler.post(this::evaluateAdState);
                    }
                }
            };

    private final Runnable restoreFromUnknownMetadata = () -> {
        unknownRestorePending = false;
        if (!hasActiveAd() && VolumeMuter.isMutedByApp(this)) {
            Log.d(TAG, "Spotify metadata still unavailable; restoring saved media volume");
            VolumeMuter.restore(this);
        }
    };

    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
        if (connected) {
            return;
        }
        connected = true;
        listenerComponent = new ComponentName(this, SpotifySessionService.class);
        detectionSettings = getSharedPreferences(AdDetector.SETTINGS_NAME, MODE_PRIVATE);
        detectionSettings.registerOnSharedPreferenceChangeListener(settingsListener);
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
        cancelUnknownRestore();
        if (mediaSessionManager != null && sessionListenerRegistered) {
            try {
                mediaSessionManager.removeOnActiveSessionsChangedListener(sessionListener);
            } catch (RuntimeException ignored) {
                // Android may have already detached this listener.
            }
            sessionListenerRegistered = false;
        }
        if (detectionSettings != null) {
            detectionSettings.unregisterOnSharedPreferenceChangeListener(settingsListener);
            detectionSettings = null;
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
        boolean shortTrackFallback = detectionSettings == null
                || detectionSettings.getBoolean(AdDetector.MUTE_SHORT_TRACKS_KEY,
                        AdDetector.DEFAULT_MUTE_SHORT_TRACKS);

        for (SessionRecord record : spotifyControllers.values()) {
            if (AdDetector.isAd(record.metadata, shortTrackFallback)) {
                return true;
            }
        }
        return false;
    }

    private void evaluateAdState() {
        if (!connected) {
            return;
        }

        if (hasActiveAd()) {
            cancelUnknownRestore();
            if (!VolumeMuter.isMutedByApp(this)) {
                Log.d(TAG, "Spotify ad or short track detected; muting media stream");
            }
            VolumeMuter.mute(this);
            return;
        }

        boolean unknownMetadata = false;
        for (SessionRecord record : spotifyControllers.values()) {
            if (!AdDetector.isKnownMedia(record.metadata)) {
                unknownMetadata = true;
                break;
            }
        }

        if (!unknownMetadata || spotifyControllers.isEmpty()) {
            cancelUnknownRestore();
            if (VolumeMuter.isMutedByApp(this)) {
                Log.d(TAG, "Normal Spotify track detected; restoring music volume immediately");
                VolumeMuter.restore(this);
            }
        } else if (VolumeMuter.isMutedByApp(this) && !unknownRestorePending) {
            unknownRestorePending = true;
            mainHandler.postDelayed(restoreFromUnknownMetadata, UNKNOWN_METADATA_GRACE_MS);
        }
    }

    private void cancelUnknownRestore() {
        mainHandler.removeCallbacks(restoreFromUnknownMetadata);
        unknownRestorePending = false;
    }

    private final class SessionRecord {
        final MediaController controller;
        MediaMetadata metadata;

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
            public void onPlaybackStateChanged(android.media.session.PlaybackState state) {
                // The detector depends on metadata, not position or playback-state updates.
                // Avoid restarting a restore timer for unrelated playback callbacks.
                if (metadata == null
                        && spotifyControllers.get(controller.getSessionToken()) == SessionRecord.this) {
                    metadata = controller.getMetadata();
                    evaluateAdState();
                }
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
