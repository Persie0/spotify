package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzlm implements Runnable {
    final /* synthetic */ zzll zza;
    final /* synthetic */ zzln zzb;

    public zzlm(zzln zzlnVar, zzll zzllVar) {
        this.zza = zzllVar;
        this.zzb = zzlnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.remove(this.zza);
    }
}
