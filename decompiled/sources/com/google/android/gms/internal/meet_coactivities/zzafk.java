package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafk implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaft zzb;

    public zzafk(zzaft zzaftVar, int i) {
        this.zza = i;
        this.zzb = zzaftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzg.zzc(this.zza);
    }
}
