package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzana extends zzwr {
    long zzb;
    final /* synthetic */ zzans zzc;
    private final zzanq zzd;

    public zzana(zzans zzansVar, zzanq zzanqVar) {
        this.zzc = zzansVar;
        this.zzd = zzanqVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzabh
    public final void zza(long j) {
        if (this.zzc.zzs.zzf != null) {
            return;
        }
        synchronized (this.zzc.zzm) {
            try {
                if (this.zzc.zzs.zzf == null) {
                    zzanq zzanqVar = this.zzd;
                    if (!zzanqVar.zzb) {
                        long j2 = this.zzb + j;
                        this.zzb = j2;
                        zzans zzansVar = this.zzc;
                        if (j2 <= zzansVar.zzx) {
                            return;
                        }
                        if (j2 > zzansVar.zzo) {
                            zzanqVar.zzc = true;
                        } else {
                            long jZza = zzansVar.zzn.zza(j2 - zzansVar.zzx);
                            this.zzc.zzx = this.zzb;
                            if (jZza > this.zzc.zzp) {
                                this.zzd.zzc = true;
                            }
                        }
                        zzanq zzanqVar2 = this.zzd;
                        Runnable runnableZzaf = zzanqVar2.zzc ? this.zzc.zzaf(zzanqVar2) : null;
                        if (runnableZzaf != null) {
                            runnableZzaf.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
