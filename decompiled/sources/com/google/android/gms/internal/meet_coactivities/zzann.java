package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzann implements Runnable {
    final /* synthetic */ zzaou zza;
    final /* synthetic */ zzanp zzb;

    public zzann(zzanp zzanpVar, zzaou zzaouVar) {
        this.zza = zzaouVar;
        this.zzb = zzanpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzy.zzf(this.zza);
    }
}
