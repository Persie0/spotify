package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapq extends zzapp {
    final /* synthetic */ zzapr zza;

    public zzapq(zzapr zzaprVar) {
        this.zza = zzaprVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapp, com.google.android.gms.internal.meet_coactivities.zzyu
    public final void zze(zzxa zzxaVar, zzzc zzzcVar) {
        zzapr zzaprVar = this.zza;
        if (zzaprVar.zza.zzi.containsKey(zzaprVar.zzb)) {
            this.zza.zzd = zzxaVar;
            this.zza.zze = zzzcVar;
            zzapr zzaprVar2 = this.zza;
            if (zzaprVar2.zza.zze) {
                return;
            }
            if (zzxaVar == zzxa.IDLE) {
                zzaprVar2.zzc.zzd();
            }
            this.zza.zza.zzk();
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapp
    public final zzyu zzf() {
        return this.zza.zza.zzj;
    }
}
