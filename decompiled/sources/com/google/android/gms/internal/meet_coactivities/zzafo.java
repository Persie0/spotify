package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafo implements Runnable {
    final /* synthetic */ zzzw zza;
    final /* synthetic */ zzafs zzb;

    public zzafo(zzafs zzafsVar, zzzw zzzwVar) {
        this.zza = zzzwVar;
        this.zzb = zzafsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzb(this.zza);
    }
}
