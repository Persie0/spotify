package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafx implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzagc zzb;

    public zzafx(zzagc zzagcVar, zzabe zzabeVar) {
        this.zza = zzabeVar;
        this.zzb = zzagcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzh.zzd(this.zza);
    }
}
