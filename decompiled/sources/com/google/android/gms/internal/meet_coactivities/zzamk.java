package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzamk implements Runnable {
    final /* synthetic */ zzaml zza;

    public zzamk(zzaml zzamlVar) {
        this.zza = zzamlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf.zzD = true;
        zzans zzansVar = this.zza.zzf;
        zzansVar.zzy.zzd(zzansVar.zzw.zza, this.zza.zzf.zzw.zzb, this.zza.zzf.zzw.zzc);
    }
}
