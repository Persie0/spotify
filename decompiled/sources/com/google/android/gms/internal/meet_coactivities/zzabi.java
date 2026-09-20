package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzabi implements Runnable {
    final /* synthetic */ zzabj zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzabm zzc;

    public zzabi(zzabm zzabmVar, zzabj zzabjVar, Runnable runnable) {
        this.zza = zzabjVar;
        this.zzb = runnable;
        this.zzc = zzabmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzabm zzabmVar = this.zzc;
        zzabmVar.zzc(this.zza);
        zzabmVar.zzb();
    }

    public final String toString() {
        return String.valueOf(this.zzb.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
