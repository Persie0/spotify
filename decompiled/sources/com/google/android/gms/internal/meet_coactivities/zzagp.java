package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagp implements Runnable {
    final /* synthetic */ zzaou zza;
    final /* synthetic */ zzagt zzb;

    public zzagp(zzagt zzagtVar, zzaou zzaouVar) {
        this.zza = zzaouVar;
        this.zzb = zzagtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzf(this.zza);
    }
}
