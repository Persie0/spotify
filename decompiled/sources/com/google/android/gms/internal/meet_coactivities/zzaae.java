package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaae {
    private Integer zza;
    private zzaau zzb;
    private zzabm zzc;
    private zzaam zzd;
    private ScheduledExecutorService zze;
    private zzwh zzf;
    private Executor zzg;

    public final zzaae zza(zzwh zzwhVar) {
        zzwhVar.getClass();
        this.zzf = zzwhVar;
        return this;
    }

    public final zzaae zzb(int i) {
        this.zza = 443;
        return this;
    }

    public final zzaae zzc(Executor executor) {
        this.zzg = executor;
        return this;
    }

    public final zzaae zzd(zzaau zzaauVar) {
        zzaauVar.getClass();
        this.zzb = zzaauVar;
        return this;
    }

    public final zzaae zze(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.zze = scheduledExecutorService;
        return this;
    }

    public final zzaae zzf(zzaam zzaamVar) {
        zzaamVar.getClass();
        this.zzd = zzaamVar;
        return this;
    }

    public final zzaae zzg(zzabm zzabmVar) {
        zzabmVar.getClass();
        this.zzc = zzabmVar;
        return this;
    }

    public final zzaag zzh() {
        return new zzaag(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null, null);
    }
}
