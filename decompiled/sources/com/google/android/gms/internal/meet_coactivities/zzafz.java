package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafz extends zzagu {
    final /* synthetic */ zzagc zza;
    private final zzyx zzb;
    private final zzxf zzc = zzxf.zzb();
    private final zzwr[] zzd;

    public /* synthetic */ zzafz(zzagc zzagcVar, zzyx zzyxVar, zzwr[] zzwrVarArr, zzafy zzafyVar) {
        this.zza = zzagcVar;
        this.zzb = zzyxVar;
        this.zzd = zzwrVarArr;
    }

    public static /* bridge */ /* synthetic */ Runnable zzp(zzafz zzafzVar, zzaex zzaexVar) {
        zzxf zzxfVarZza = zzafzVar.zzc.zza();
        try {
            zzyx zzyxVar = zzafzVar.zzb;
            zzaeu zzaeuVarZzd = zzaexVar.zzd(zzyxVar.zzc(), zzyxVar.zzb(), zzyxVar.zza(), zzafzVar.zzd);
            return zzafzVar.zzs(zzaeuVarZzd);
        } finally {
            zzafzVar.zzc.zze(zzxfVarZza);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzagu, com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zza(zzaia zzaiaVar) {
        if (this.zzb.zza().zzo()) {
            zzaiaVar.zza("wait_for_ready");
        }
        super.zza(zzaiaVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzagu, com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzb(zzabe zzabeVar) {
        super.zzb(zzabeVar);
        synchronized (this.zza.zzb) {
            try {
                zzagc zzagcVar = this.zza;
                if (zzagcVar.zzg != null) {
                    boolean zRemove = zzagcVar.zzi.remove(this);
                    if (!this.zza.zzn() && zRemove) {
                        zzagc zzagcVar2 = this.zza;
                        zzagcVar2.zzd.zzc(zzagcVar2.zzf);
                        if (this.zza.zzj.zzb != null) {
                            zzagc zzagcVar3 = this.zza;
                            zzagcVar3.zzd.zzc(zzagcVar3.zzg);
                            this.zza.zzg = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzagu
    public final void zzq(zzabe zzabeVar) {
        int i = 0;
        while (true) {
            zzwr[] zzwrVarArr = this.zzd;
            if (i >= zzwrVarArr.length) {
                return;
            }
            zzwr zzwrVar = zzwrVarArr[i];
            i++;
        }
    }
}
