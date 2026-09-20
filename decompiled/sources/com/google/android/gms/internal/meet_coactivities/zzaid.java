package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaid implements Runnable {
    final /* synthetic */ zzaiu zza;

    public zzaid(zzaiu zzaiuVar) {
        this.zza = zzaiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzu.zza() == zzxa.IDLE) {
            this.zza.zzh.zza(2, "CONNECTING as requested");
            zzaiu.zzA(this.zza, zzxa.CONNECTING);
            zzaiu.zzE(this.zza);
        }
    }
}
