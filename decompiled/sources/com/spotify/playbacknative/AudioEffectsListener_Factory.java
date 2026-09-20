package com.spotify.playbacknative;

import android.content.Context;
import p204p.h4t0;

/* JADX INFO: loaded from: classes9.dex */
public final class AudioEffectsListener_Factory implements h4t0 {
    private final h4t0 contextProvider;

    private AudioEffectsListener_Factory(h4t0 h4t0Var) {
        this.contextProvider = h4t0Var;
    }

    public static AudioEffectsListener_Factory create(h4t0 h4t0Var) {
        return new AudioEffectsListener_Factory(h4t0Var);
    }

    public static AudioEffectsListener newInstance(Context context) {
        return new AudioEffectsListener(context);
    }

    @Override // p204p.i4t0
    public AudioEffectsListener get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
