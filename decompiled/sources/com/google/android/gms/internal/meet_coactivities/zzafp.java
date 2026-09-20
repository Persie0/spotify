package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzafp implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzafs zzb;

    public zzafp(zzafs zzafsVar, Object obj) {
        this.zza = obj;
        this.zzb = zzafsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzc(this.zza);
    }
}
