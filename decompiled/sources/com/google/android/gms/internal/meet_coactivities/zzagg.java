package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagg implements Runnable {
    final /* synthetic */ zzxm zza;
    final /* synthetic */ zzagu zzb;

    public zzagg(zzagu zzaguVar, zzxm zzxmVar) {
        this.zza = zzxmVar;
        this.zzb = zzaguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzi(this.zza);
    }
}
