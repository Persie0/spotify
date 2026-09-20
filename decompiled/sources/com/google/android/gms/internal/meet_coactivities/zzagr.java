package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagr implements Runnable {
    final /* synthetic */ zzzw zza;
    final /* synthetic */ zzagt zzb;

    public zzagr(zzagt zzagtVar, zzzw zzzwVar) {
        this.zza = zzzwVar;
        this.zzb = zzagtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zze(this.zza);
    }
}
