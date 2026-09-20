package com.persie.spotifymuter;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;

final class VolumeMuter {
    private static final String PREFS = "mute_state";
    private static final String KEY_MUTED = "muted_by_app";
    private static final String KEY_VOLUME = "saved_music_volume";

    private VolumeMuter() {}

    static synchronized void mute(Context context) {
        Context app = context.getApplicationContext();
        SharedPreferences prefs = app.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        AudioManager audio = app.getSystemService(AudioManager.class);
        if (audio == null) {
            return;
        }

        if (prefs.getBoolean(KEY_MUTED, false)) {
            if (audio.getStreamVolume(AudioManager.STREAM_MUSIC) != 0) {
                audio.setStreamVolume(AudioManager.STREAM_MUSIC, 0, 0);
            }
            return;
        }

        int current = audio.getStreamVolume(AudioManager.STREAM_MUSIC);
        prefs.edit()
                .putInt(KEY_VOLUME, current)
                .putBoolean(KEY_MUTED, true)
                .apply();

        if (current != 0) {
            audio.setStreamVolume(AudioManager.STREAM_MUSIC, 0, 0);
        }
    }

    static synchronized void restore(Context context) {
        Context app = context.getApplicationContext();
        SharedPreferences prefs = app.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        if (!prefs.getBoolean(KEY_MUTED, false)) {
            return;
        }

        AudioManager audio = app.getSystemService(AudioManager.class);
        int saved = prefs.getInt(KEY_VOLUME, 5);

        if (audio != null && audio.getStreamVolume(AudioManager.STREAM_MUSIC) == 0) {
            int max = audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
            audio.setStreamVolume(AudioManager.STREAM_MUSIC, Math.max(0, Math.min(saved, max)), 0);
        }

        prefs.edit()
                .remove(KEY_VOLUME)
                .putBoolean(KEY_MUTED, false)
                .apply();
    }

    static boolean isMutedByApp(Context context) {
        return context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                .getBoolean(KEY_MUTED, false);
    }
}
