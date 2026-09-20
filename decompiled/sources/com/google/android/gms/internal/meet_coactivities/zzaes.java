package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzaes implements zzaew {
    final /* synthetic */ zzaet zza;
    private final zzwi zzb;
    private zzabe zzc;

    public zzaes(zzaet zzaetVar, zzwi zzwiVar) {
        this.zza = zzaetVar;
        c95.m31848n(zzwiVar, "observer");
        this.zzb = zzwiVar;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzaes zzaesVar, zzabe zzabeVar) {
        zzaesVar.zzc = zzabeVar;
        zzaesVar.zza.zzk.zzb(zzabeVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public final void zzd(zzabe zzabeVar, zzaev zzaevVar, zzzw zzzwVar) {
        int i = zzaqa.zza;
        zzxj zzxjVarZzq = this.zza.zzq();
        if (zzabeVar.zza() == zzaaz.CANCELLED && zzxjVarZzq != null && zzxjVarZzq.zzd()) {
            zzabeVar = this.zza.zzh.zzb();
            zzzwVar = new zzzw();
        }
        this.zza.zzd.execute(new zzaeq(this, zzaqa.zza(), zzabeVar, zzzwVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public final void zze(zzzw zzzwVar) {
        this.zza.zzd.execute(new zzaeo(this, zzaqa.zza(), zzzwVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzf(zzaou zzaouVar) {
        this.zza.zzd.execute(new zzaep(this, zzaqa.zza(), zzaouVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzg() {
        if (this.zza.zzc.zzb().zza()) {
            return;
        }
        this.zza.zzd.execute(new zzaer(this, zzaqa.zza()));
    }
}
