package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaeq extends zzafd {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzzw zzb;
    final /* synthetic */ zzaes zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaeq(zzaes zzaesVar, zzapz zzapzVar, zzabe zzabeVar, zzzw zzzwVar) {
        super(zzaesVar.zza.zzg);
        this.zza = zzabeVar;
        this.zzb = zzzwVar;
        this.zzc = zzaesVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzafd
    public final void zza() {
        int i = zzaqa.zza;
        this.zzc.zza.zzh.zzd();
        zzabe zzabeVar = this.zza;
        zzzw zzzwVar = this.zzb;
        zzaes zzaesVar = this.zzc;
        if (zzaesVar.zzc != null) {
            zzabeVar = zzaesVar.zzc;
            zzzwVar = new zzzw();
        }
        try {
            this.zzc.zzb.zza(zzabeVar, zzzwVar);
        } finally {
            this.zzc.zza.zzf.zza(zzabeVar.zzj());
        }
    }
}
