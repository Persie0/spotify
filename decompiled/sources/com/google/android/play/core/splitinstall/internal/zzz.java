package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzz extends zzv {
    final /* synthetic */ zzaf zza;

    public zzz(zzaf zzafVar) {
        this.zza = zzafVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        synchronized (this.zza.zzg) {
            try {
                if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                    this.zza.zzc.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                zzaf zzafVar = this.zza;
                if (zzafVar.zzn != null) {
                    zzafVar.zzc.zzd("Unbind from service.", new Object[0]);
                    zzaf zzafVar2 = this.zza;
                    zzafVar2.zzb.unbindService(zzafVar2.zzm);
                    this.zza.zzh = false;
                    this.zza.zzn = null;
                    this.zza.zzm = null;
                }
                this.zza.zzw();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
