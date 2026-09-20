package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzanm implements Runnable {
    final /* synthetic */ zzanq zza;
    final /* synthetic */ zzanp zzb;

    public zzanm(zzanp zzanpVar, zzanq zzanqVar) {
        this.zza = zzanqVar;
        this.zzb = zzanpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzah(this.zza);
    }
}
