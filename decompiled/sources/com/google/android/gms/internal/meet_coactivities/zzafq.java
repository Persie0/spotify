package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafq implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzzw zzb;
    final /* synthetic */ zzafs zzc;

    public zzafq(zzafs zzafsVar, zzabe zzabeVar, zzzw zzzwVar) {
        this.zza = zzabeVar;
        this.zzb = zzzwVar;
        this.zzc = zzafsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
    }
}
