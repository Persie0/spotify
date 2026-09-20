package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaik extends zzahk {
    final /* synthetic */ zzaeu zza;
    final /* synthetic */ zzaim zzb;

    public zzaik(zzaim zzaimVar, zzaeu zzaeuVar) {
        this.zza = zzaeuVar;
        this.zzb = zzaimVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzahk, com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzl(zzaew zzaewVar) {
        this.zzb.zzb.zzb();
        this.zza.zzl(new zzaij(this, zzaewVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzahk
    public final zzaeu zzo() {
        return this.zza;
    }
}
