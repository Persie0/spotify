package com.persie.spotifymuter;

import android.content.ComponentName;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SpotifySessionService extends NotificationListenerService {
    private static final String TAG = "SpotifyAdMuter";
    private static final long UNMUTE_DEBOUNCE_MS = 900L;

    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Map<MediaSession.Token, MediaController.Callback> callbacks = new HashMap<>();
    private final List<MediaController> spotifyControllers = new ArrayList<>();

    private MediaSessionManager mediaSessionManager;
    private ComponentName listenerComponent;
    private boolean connected;

    private final MediaSessionManager.OnActiveSessionsChangedListener sessionListener =
            this::attachControllers;

    private final Runnable delayedUnmute = () -> {
        if (!hasActiveAd()) {
            Log.d(TAG, "No Spotify ad marker present; restoring music volume");
            VolumeMuter.restore(this);
        }
    };

    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
        connected = true;
        listenerComponent = new ComponentName(this, SpotifySessionService.class);
        mediaSessionManager = getSystemService(MediaSessionManager.class);

        if (mediaSessionManager == null) {
            return;
        }

        try {
            mediaSessionManager.addOnActiveSessionsChangedListener(
                    sessionListener,
                    listenerComponent
            );
            attachControllers(mediaSessionManager.getActiveSessions(listenerComponent));
        } catch (SecurityException e) {
            Log.e(TAG, "Notification access was not accepted by MediaSessionManager", e);
            VolumeMuter.restore(this);
        }
    }

    @Override
    public void onListenerDisconnected() {
        connected = false;
        mainHandler.removeCallbacks(delayedUnmute);
        clearControllers();
        VolumeMuter.restore(this);
        super.onListenerDisconnected();
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        if (sbn != null && AdDetector.SPOTIFY_PACKAGE.equals(sbn.getPackageName())) {
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
        mainHandler.removeCallbacksAndMessages(null);

        if (connected && mediaSessionManager != null) {
            try {
                mediaSessionManager.removeOnActiveSessionsChangedListener(sessionListener);
            } catch (RuntimeException ignored) {
                // The listener may already have been detached by the system.
            }
        }

        clearControllers();
        VolumeMuter.restore(this);
        super.onDestroy();
    }

    private void refreshSessions() {
        if (!connected || mediaSessionManager == null || listenerComponent == null) {
            return;
        }

        try {
            attachControllers(mediaSessionManager.getActiveSessions(listenerComponent));
        } catch (SecurityException e) {
            Log.w(TAG, "Unable to refresh media sessions", e);
        }
    }

    private void attachControllers(List<MediaController> controllers) {
        clearControllers();

        if (controllers != null) {
            for (MediaController controller : controllers) {
                if (!AdDetector.SPOTIFY_PACKAGE.equals(controller.getPackageName())) {
                    continue;
                }

                MediaController.Callback callback = new MediaController.Callback() {
                    @Override
                    public void onMetadataChanged(MediaMetadata metadata) {
                        evaluateAdState();
                    }

                    @Override
                    public void onPlaybackStateChanged(android.media.session.PlaybackState state) {
                        evaluateAdState();
                    }

                    @Override
                    public void onSessionDestroyed() {
                        refreshSessions();
                    }
                };

                spotifyControllers.add(controller);
                callbacks.put(controller.getSessionToken(), callback);
                controller.registerCallback(callback, mainHandler);
            }
        }

        evaluateAdState();
    }

    private void clearControllers() {
        for (MediaController controller : spotifyControllers) {
            MediaController.Callback callback = callbacks.get(controller.getSessionToken());
            if (callback != null) {
                try {
                    controller.unregisterCallback(callback);
                } catch (RuntimeException ignored) {
                    // Session can disappear while detaching.
                }
            }
        }
        spotifyControllers.clear();
        callbacks.clear();
    }

    private boolean hasActiveAd() {
        for (MediaController controller : spotifyControllers) {
            if (AdDetector.isAd(controller.getMetadata())) {
                return true;
            }
        }
        return false;
    }

    private void evaluateAdState() {
        boolean ad = hasActiveAd();
        mainHandler.removeCallbacks(delayedUnmute);

        if (ad) {
            Log.d(TAG, "Spotify ad marker detected; muting media stream");
            VolumeMuter.mute(this);
        } else {
            mainHandler.postDelayed(delayedUnmute, UNMUTE_DEBOUNCE_MS);
        }
    }
}
