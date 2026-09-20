package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaih implements Runnable {
    final /* synthetic */ zzaiu zza;

    public zzaih(zzaiu zzaiuVar) {
        this.zza = zzaiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh.zza(2, "Terminated");
        zzaiu zzaiuVar = this.zza;
        zzakk zzakkVar = (zzakk) zzaiuVar.zzc;
        zzakkVar.zzb.zzj.zzH.remove(zzaiuVar);
        zzakkVar.zzb.zzj.zzV.zzg(zzaiuVar);
        zzakp.zzP(zzakkVar.zzb.zzj);
    }
}
