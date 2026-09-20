package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaff implements Runnable {
    final /* synthetic */ StringBuilder zza;
    final /* synthetic */ zzaft zzb;

    public zzaff(zzaft zzaftVar, StringBuilder sb) {
        this.zza = sb;
        this.zzb = zzaftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzl(zzabe.zzd.zze(this.zza.toString()), true);
    }
}
