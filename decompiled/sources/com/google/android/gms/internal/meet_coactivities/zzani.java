package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzani implements Runnable {
    final /* synthetic */ zzzw zza;
    final /* synthetic */ zzanp zzb;

    public zzani(zzanp zzanpVar, zzzw zzzwVar) {
        this.zza = zzzwVar;
        this.zzb = zzanpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzy.zze(this.zza);
    }
}
