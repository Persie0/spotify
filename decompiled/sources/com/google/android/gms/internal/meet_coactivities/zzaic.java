package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaic implements Runnable {
    final /* synthetic */ zzaiu zza;

    public zzaic(zzaiu zzaiuVar) {
        this.zza = zzaiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzn = null;
        this.zza.zzh.zza(2, "CONNECTING after backoff");
        zzaiu.zzA(this.zza, zzxa.CONNECTING);
        zzaiu.zzE(this.zza);
    }
}
