package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagj implements Runnable {
    final /* synthetic */ zzxj zza;
    final /* synthetic */ zzagu zzb;

    public zzagj(zzagu zzaguVar, zzxj zzxjVar) {
        this.zza = zzxjVar;
        this.zzb = zzaguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzh(this.zza);
    }
}
