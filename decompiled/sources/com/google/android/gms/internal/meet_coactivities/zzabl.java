package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledFuture;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabl {
    private final zzabj zza;
    private final ScheduledFuture zzb;

    public /* synthetic */ zzabl(zzabj zzabjVar, ScheduledFuture scheduledFuture, zzabk zzabkVar) {
        c95.m31848n(zzabjVar, "runnable");
        this.zza = zzabjVar;
        c95.m31848n(scheduledFuture, "future");
        this.zzb = scheduledFuture;
    }

    public final void zza() {
        this.zza.zzb = true;
        this.zzb.cancel(false);
    }

    public final boolean zzb() {
        zzabj zzabjVar = this.zza;
        return (zzabjVar.zzc || zzabjVar.zzb) ? false : true;
    }
}
