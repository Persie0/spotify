package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzagf implements Runnable {
    final /* synthetic */ zzww zza;
    final /* synthetic */ zzagu zzb;

    public zzagf(zzagu zzaguVar, zzww zzwwVar) {
        this.zza = zzwwVar;
        this.zzb = zzaguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzg(this.zza);
    }
}
