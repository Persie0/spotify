package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzake implements Runnable {
    final /* synthetic */ zzakf zza;

    public zzake(zzakf zzakfVar) {
        this.zza = zzakfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakf zzakfVar = this.zza;
        zzakp zzakpVar = zzakfVar.zzd.zza;
        if (zzakpVar.zzI != null) {
            zzakpVar.zzI.remove(zzakfVar);
            if (this.zza.zzd.zza.zzI.isEmpty()) {
                zzakp zzakpVar2 = this.zza.zzd.zza;
                zzakpVar2.zze.zzc(zzakpVar2.zzJ, false);
                this.zza.zzd.zza.zzI = null;
                if (this.zza.zzd.zza.zzN.get()) {
                    zzako zzakoVar = this.zza.zzd.zza.zzM;
                    Object obj = zzakoVar.zza;
                    zzabe zzabeVar = zzakp.zzb;
                    synchronized (obj) {
                        try {
                            if (zzakoVar.zzc != null) {
                                return;
                            }
                            zzakoVar.zzc = zzabeVar;
                            boolean zIsEmpty = zzakoVar.zzb.isEmpty();
                            if (zIsEmpty) {
                                zzakoVar.zzd.zzL.zzm(zzabeVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
