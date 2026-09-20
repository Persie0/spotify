package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzze {
    public static final zzvx zza = zzvx.zza("internal:health-checking-config");
    public static final zzyp zzb = zzyp.zza("internal:health-check-consumer-listener");
    public static final zzvx zzc = zzvx.zza("internal:has-health-check-producer-listener");
    public static final zzvx zzd = zzvx.zza("io.grpc.IS_PETIOLE_POLICY");
    private int zze;

    public zzabe zza(zzza zzzaVar) {
        throw null;
    }

    public abstract void zzb(zzabe zzabeVar);

    public void zzc(zzza zzzaVar) {
        int i = this.zze;
        this.zze = i + 1;
        if (i == 0) {
            zza(zzzaVar);
        }
        this.zze = 0;
    }

    public void zzd() {
    }

    public abstract void zze();
}
