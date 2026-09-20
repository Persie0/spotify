package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzank implements Runnable {
    final /* synthetic */ zzanc zza;
    final /* synthetic */ zzanq zzb;
    final /* synthetic */ zzanp zzc;

    public zzank(zzanp zzanpVar, zzanc zzancVar, zzanq zzanqVar) {
        this.zza = zzancVar;
        this.zzb = zzanqVar;
        this.zzc = zzanpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zza) {
            zzanc zzancVar = this.zza;
            if (zzancVar.zzc) {
                return;
            }
            zzancVar.zza();
            this.zzc.zzb.zzd.execute(new zzanj(this));
        }
    }
}
