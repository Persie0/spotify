package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafh implements Runnable {
    final /* synthetic */ zzwi zza;
    final /* synthetic */ zzzw zzb;
    final /* synthetic */ zzaft zzc;

    public zzafh(zzaft zzaftVar, zzwi zzwiVar, zzzw zzzwVar) {
        this.zza = zzwiVar;
        this.zzb = zzzwVar;
        this.zzc = zzaftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzg.zze(this.zza, this.zzb);
    }
}
