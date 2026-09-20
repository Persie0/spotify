package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzanl implements Runnable {
    final /* synthetic */ zzanp zza;

    public zzanl(zzanp zzanpVar) {
        this.zza = zzanpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzD = true;
        zzans zzansVar = this.zza.zzb;
        zzansVar.zzy.zzd(zzansVar.zzw.zza, this.zza.zzb.zzw.zzb, this.zza.zzb.zzw.zzc);
    }
}
