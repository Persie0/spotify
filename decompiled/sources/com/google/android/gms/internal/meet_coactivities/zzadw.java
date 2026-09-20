package com.google.android.gms.internal.meet_coactivities;

import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadw {
    final /* synthetic */ zzaee zza;
    private final zzyu zzb;
    private zzze zzc;
    private zzzg zzd;

    public zzadw(zzaee zzaeeVar, zzyu zzyuVar) {
        this.zza = zzaeeVar;
        this.zzb = zzyuVar;
        zzzg zzzgVarZza = zzaeeVar.zza.zza(zzaeeVar.zzb);
        this.zzd = zzzgVarZza;
        if (zzzgVarZza == null) {
            throw new IllegalStateException(s571.m77251j("Could not find policy '", zzaeeVar.zzb, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }
        this.zzc = zzzgVarZza.zza(zzyuVar);
    }

    public final zzze zza() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzabe zzb(zzza zzzaVar) {
        zzaok zzaokVar = (zzaok) zzzaVar.zzd();
        zzadx zzadxVar = null;
        Object[] objArr = 0;
        if (zzaokVar == null) {
            try {
                zzaee zzaeeVar = this.zza;
                zzaokVar = new zzaok(zzaee.zza(zzaeeVar, zzaeeVar.zzb, "using default policy"), null);
            } catch (zzaed e) {
                this.zzb.zze(zzxa.TRANSIENT_FAILURE, new zzadz(zzabe.zzj.zze(e.getMessage())));
                this.zzc.zze();
                this.zzd = null;
                this.zzc = new zzaeb(objArr == true ? 1 : 0);
                return zzabe.zza;
            }
        }
        if (this.zzd == null || !zzaokVar.zza.zzd().equals(this.zzd.zzd())) {
            this.zzb.zze(zzxa.CONNECTING, new zzady(zzadxVar));
            this.zzc.zze();
            zzzg zzzgVar = zzaokVar.zza;
            this.zzd = zzzgVar;
            zzze zzzeVar = this.zzc;
            this.zzc = zzzgVar.zza(this.zzb);
            ((zzajv) this.zzb).zzb.zzU.zzb(2, "Load balancer changed from {0} to {1}", zzzeVar.getClass().getSimpleName(), this.zzc.getClass().getSimpleName());
        }
        Object obj = zzaokVar.zzb;
        if (obj != null) {
            ((zzajv) this.zzb).zzb.zzU.zzb(1, "Load-balancing config: {0}", obj);
        }
        zzze zzzeVar2 = this.zzc;
        zzyy zzyyVarZzb = zzza.zzb();
        zzyyVarZzb.zza(zzzaVar.zze());
        zzyyVarZzb.zzb(zzzaVar.zza());
        zzyyVarZzb.zzc(obj);
        return zzzeVar2.zza(zzyyVarZzb.zzd());
    }

    public final void zzc() {
        this.zzc.zze();
        this.zzc = null;
    }
}
