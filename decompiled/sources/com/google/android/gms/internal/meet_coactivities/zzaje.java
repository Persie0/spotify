package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
final class zzaje implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzakp zza;

    public zzaje(zzakp zzakpVar) {
        this.zza = zzakpVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzakp.zza.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", s571.m77251j("[", String.valueOf(this.zza.zzc()), "] Uncaught exception in the SynchronizationContext. Panic!"), th);
        this.zza.zzV(th);
    }
}
