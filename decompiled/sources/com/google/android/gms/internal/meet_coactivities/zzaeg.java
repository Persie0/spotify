package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class zzaeg implements zzanu {
    private static final Logger zza = Logger.getLogger(zzaeg.class.getName());
    private final ScheduledExecutorService zzb;
    private final zzabm zzc;
    private zzabl zzd;
    private zzahg zze;

    public zzaeg(zzahf zzahfVar, ScheduledExecutorService scheduledExecutorService, zzabm zzabmVar) {
        this.zzb = scheduledExecutorService;
        this.zzc = zzabmVar;
    }

    public final /* synthetic */ void zza() {
        zzabl zzablVar = this.zzd;
        if (zzablVar != null && zzablVar.zzb()) {
            this.zzd.zza();
        }
        this.zze = null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzanu
    public final void zzb() {
        this.zzc.zzd();
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzaef
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza();
            }
        };
        zzabm zzabmVar = this.zzc;
        zzabmVar.zzc(runnable);
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzanu
    public final void zzc(Runnable runnable) {
        this.zzc.zzd();
        if (this.zze == null) {
            this.zze = new zzahg();
        }
        zzabl zzablVar = this.zzd;
        if (zzablVar == null || !zzablVar.zzb()) {
            long jZza = this.zze.zza();
            this.zzd = this.zzc.zza(runnable, jZza, TimeUnit.NANOSECONDS, this.zzb);
            zza.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jZza));
        }
    }
}
