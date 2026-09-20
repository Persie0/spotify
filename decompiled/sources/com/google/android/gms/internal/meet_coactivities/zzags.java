package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzags implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzaev zzb;
    final /* synthetic */ zzzw zzc;
    final /* synthetic */ zzagt zzd;

    public zzags(zzagt zzagtVar, zzabe zzabeVar, zzaev zzaevVar, zzzw zzzwVar) {
        this.zza = zzabeVar;
        this.zzb = zzaevVar;
        this.zzc = zzzwVar;
        this.zzd = zzagtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzd(this.zza, this.zzb, this.zzc);
    }
}
