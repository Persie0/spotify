package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaeo extends zzafd {
    final /* synthetic */ zzzw zza;
    final /* synthetic */ zzaes zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaeo(zzaes zzaesVar, zzapz zzapzVar, zzzw zzzwVar) {
        super(zzaesVar.zza.zzg);
        this.zza = zzzwVar;
        this.zzb = zzaesVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzafd
    public final void zza() {
        int i = zzaqa.zza;
        zzaes zzaesVar = this.zzb;
        if (zzaesVar.zzc != null) {
            return;
        }
        try {
            zzaesVar.zzb.zzb(this.zza);
        } catch (Throwable th) {
            zzaes.zzc(this.zzb, zzabe.zzb.zzd(th).zze("Failed to read headers"));
        }
    }
}
