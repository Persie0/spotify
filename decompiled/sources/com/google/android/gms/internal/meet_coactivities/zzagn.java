package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagn implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzagu zzb;

    public zzagn(zzagu zzaguVar, zzabe zzabeVar) {
        this.zza = zzabeVar;
        this.zzb = zzaguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzb(this.zza);
    }
}
