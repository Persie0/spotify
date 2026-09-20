package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzamj implements Thread.UncaughtExceptionHandler {
    public zzamj(zzans zzansVar) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new zzabg(zzabe.zzc(th).zze("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
