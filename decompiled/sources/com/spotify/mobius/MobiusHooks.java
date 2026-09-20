package com.spotify.mobius;

import p204p.bsa0;
import p204p.xra0;
import p204p.zfs;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MobiusHooks {

    /* JADX INFO: renamed from: a */
    public static final xra0 f5581a = bsa0.m30425b(MobiusHooks.class);

    /* JADX INFO: renamed from: b */
    public static ErrorHandler f5582b = new zfs(28);

    public interface ErrorHandler {
        /* JADX INFO: renamed from: a */
        void mo15599a(RuntimeException runtimeException);
    }
}
