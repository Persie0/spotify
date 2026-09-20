package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzakd implements Runnable {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzakf zzb;

    public zzakd(zzakf zzakfVar, Runnable runnable) {
        this.zza = runnable;
        this.zzb = zzakfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.run();
        zzakf zzakfVar = this.zzb;
        zzake zzakeVar = new zzake(zzakfVar);
        zzabm zzabmVar = zzakfVar.zzd.zza.zzd;
        zzabmVar.zzc(zzakeVar);
        zzabmVar.zzb();
    }
}
