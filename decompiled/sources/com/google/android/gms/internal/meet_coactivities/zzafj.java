package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafj implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzaft zzb;

    public zzafj(zzaft zzaftVar, Object obj) {
        this.zza = obj;
        this.zzb = zzaftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzg.zzd(this.zza);
    }
}
