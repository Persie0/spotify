package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.kh71;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaix implements Runnable {
    private static final Logger zza = Logger.getLogger(zzaix.class.getName());
    private final Runnable zzb;

    public zzaix(Runnable runnable) {
        c95.m31848n(runnable, "task");
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(String.valueOf(this.zzb)), th);
            Object obj = kh71.f122542a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return s571.m77251j("LogExceptionRunnable(", String.valueOf(this.zzb), ")");
    }
}
