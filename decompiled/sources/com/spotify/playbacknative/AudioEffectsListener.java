package com.spotify.playbacknative;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AudioEffectsListener implements AudioDriverListener {
    private final Context mContext;
    private ConcurrentHashMap<Integer, Boolean> mCurrentAudioEffectsSessionIds = new ConcurrentHashMap<>();

    public AudioEffectsListener(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void disableEqualizer(int i) {
        Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", this.mContext.getPackageName());
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        this.mContext.sendBroadcast(intent);
    }

    private void enableEqualizer(int i) {
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", this.mContext.getPackageName());
        intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        this.mContext.sendBroadcast(intent);
    }

    private void toggleEqualizer(boolean z, Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        boolean z2 = !z;
        Boolean boolReplace = this.mCurrentAudioEffectsSessionIds.replace(num, Boolean.valueOf(z2));
        if (boolReplace == null || boolReplace.equals(Boolean.valueOf(z2))) {
            return;
        }
        if (z) {
            disableEqualizer(num.intValue());
        } else {
            enableEqualizer(num.intValue());
        }
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public void onAudioTrackCreated(AudioTrackAdapter audioTrackAdapter) {
        int audioSessionId = audioTrackAdapter.getAudioSessionId();
        if (audioSessionId > 0) {
            this.mCurrentAudioEffectsSessionIds.put(Integer.valueOf(audioSessionId), Boolean.FALSE);
        }
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public void onAudioTrackDestroyed(AudioTrackAdapter audioTrackAdapter) {
        Boolean boolRemove = this.mCurrentAudioEffectsSessionIds.remove(Integer.valueOf(audioTrackAdapter.getAudioSessionId()));
        if (boolRemove == null || !boolRemove.equals(Boolean.TRUE)) {
            return;
        }
        disableEqualizer(audioTrackAdapter.getAudioSessionId());
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public void onFlushComplete(int i) {
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public void onFlushStart(int i) {
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public void onPaused(boolean z, int i) {
        toggleEqualizer(z, Integer.valueOf(i));
    }
}
