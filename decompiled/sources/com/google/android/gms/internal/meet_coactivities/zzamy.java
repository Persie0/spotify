package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzamy implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzaev zzb;
    final /* synthetic */ zzzw zzc;
    final /* synthetic */ zzans zzd;

    public zzamy(zzans zzansVar, zzabe zzabeVar, zzaev zzaevVar, zzzw zzzwVar) {
        this.zza = zzabeVar;
        this.zzb = zzaevVar;
        this.zzc = zzzwVar;
        this.zzd = zzansVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzD = true;
        this.zzd.zzy.zzd(this.zza, this.zzb, this.zzc);
    }
}
