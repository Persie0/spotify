package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaon implements Runnable {
    final /* synthetic */ zzaoo zza;
    final /* synthetic */ zzaop zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ zzaoq zzd;

    public zzaon(zzaoq zzaoqVar, zzaoo zzaooVar, zzaop zzaopVar, Object obj) {
        this.zza = zzaooVar;
        this.zzb = zzaopVar;
        this.zzc = obj;
        this.zzd = zzaoqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzd) {
            try {
                if (this.zza.zzb == 0) {
                    try {
                        this.zzb.zzb(this.zzc);
                        this.zzd.zzb.remove(this.zzb);
                        if (this.zzd.zzb.isEmpty()) {
                            this.zzd.zzc.shutdown();
                            this.zzd.zzc = null;
                        }
                    } catch (Throwable th) {
                        this.zzd.zzb.remove(this.zzb);
                        if (this.zzd.zzb.isEmpty()) {
                            this.zzd.zzc.shutdown();
                            this.zzd.zzc = null;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
