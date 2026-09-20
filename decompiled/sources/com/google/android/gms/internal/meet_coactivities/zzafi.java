package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafi implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzaft zzb;

    public zzafi(zzaft zzaftVar, zzabe zzabeVar) {
        this.zza = zzabeVar;
        this.zzb = zzaftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzabe zzabeVar = this.zza;
        this.zzb.zzg.zza(zzabeVar.zzg(), zzabeVar.zzh());
    }
}
