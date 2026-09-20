package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaer extends zzafd {
    final /* synthetic */ zzaes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaer(zzaes zzaesVar, zzapz zzapzVar) {
        super(zzaesVar.zza.zzg);
        this.zza = zzaesVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzafd
    public final void zza() {
        int i = zzaqa.zza;
        zzaes zzaesVar = this.zza;
        if (zzaesVar.zzc != null) {
            return;
        }
        try {
            zzaesVar.zzb.zzd();
        } catch (Throwable th) {
            zzaes.zzc(this.zza, zzabe.zzb.zzd(th).zze("Failed to call onReady."));
        }
    }
}
