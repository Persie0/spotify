package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaii implements Runnable {
    final /* synthetic */ zzafa zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaiu zzc;

    public zzaii(zzaiu zzaiuVar, zzafa zzafaVar, boolean z) {
        this.zza = zzafaVar;
        this.zzb = z;
        this.zzc = zzaiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzr.zzc(this.zza, this.zzb);
    }
}
