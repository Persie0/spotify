package com.spotify.mobius.internal_util;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Throwables {
    /* JADX INFO: renamed from: a */
    public static void m15650a(Exception exc) {
        if (!(exc instanceof RuntimeException)) {
            throw new RuntimeException(exc);
        }
        throw ((RuntimeException) exc);
    }
}
