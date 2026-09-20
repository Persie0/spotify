package com.spotify.mobius.android.runners;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class MainThreadWorkRunner extends LooperWorkRunner {
    private MainThreadWorkRunner() {
        super(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static MainThreadWorkRunner m15627a() {
        return new MainThreadWorkRunner();
    }
}
