package com.spotify.mobius.android;

import com.spotify.mobius.Init;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MobiusAndroid {
    /* JADX INFO: renamed from: a */
    public static MobiusLoop.Controller m15617a(MobiusLoop.Factory factory, Object obj) {
        return Mobius.m15581c(factory, obj, MainThreadWorkRunner.m15627a());
    }

    /* JADX INFO: renamed from: b */
    public static MobiusLoop.Controller m15618b(MobiusLoop.Factory factory, Object obj, Init init) {
        return Mobius.m15580b(factory, obj, init, MainThreadWorkRunner.m15627a());
    }
}
