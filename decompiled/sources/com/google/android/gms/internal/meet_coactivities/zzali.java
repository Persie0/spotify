package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzali implements Runnable {
    final /* synthetic */ zzalr zza;

    public zzali(zzalr zzalrVar) {
        this.zza = zzalrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzk = null;
        if (this.zza.zzh.zzf()) {
            this.zza.zzd();
        }
    }
}
