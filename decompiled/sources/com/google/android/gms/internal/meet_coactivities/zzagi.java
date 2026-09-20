package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagi implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzagu zzb;

    public zzagi(zzagu zzaguVar, int i) {
        this.zza = i;
        this.zzb = zzaguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzk(this.zza);
    }
}
