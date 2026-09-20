package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzafd implements Runnable {
    private final zzxf zza;

    public zzafd(zzxf zzxfVar) {
        this.zza = zzxfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzxf zzxfVarZza = this.zza.zza();
        try {
            zza();
        } finally {
            this.zza.zze(zzxfVarZza);
        }
    }

    public abstract void zza();
}
