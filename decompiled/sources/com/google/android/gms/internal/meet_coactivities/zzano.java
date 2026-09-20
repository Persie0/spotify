package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzano implements Runnable {
    final /* synthetic */ zzanp zza;

    public zzano(zzanp zzanpVar) {
        this.zza = zzanpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzans zzansVar = this.zza.zzb;
        if (zzansVar.zzD) {
            return;
        }
        zzansVar.zzy.zzg();
    }
}
