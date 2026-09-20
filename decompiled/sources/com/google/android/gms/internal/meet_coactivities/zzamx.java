package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzamx implements Runnable {
    final /* synthetic */ zzans zza;

    public zzamx(zzans zzansVar) {
        this.zza = zzansVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzans zzansVar = this.zza;
        if (zzansVar.zzD) {
            return;
        }
        zzansVar.zzy.zzg();
    }
}
