package com.google.android.gms.internal.meet_coactivities;

import java.util.Collection;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class zzaml implements Runnable {
    final /* synthetic */ Collection zza;
    final /* synthetic */ zzanq zzb;
    final /* synthetic */ Future zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ Future zze;
    final /* synthetic */ zzans zzf;

    public zzaml(zzans zzansVar, Collection collection, zzanq zzanqVar, Future future, boolean z, Future future2) {
        this.zza = collection;
        this.zzb = zzanqVar;
        this.zzc = future;
        this.zzd = z;
        this.zze = future2;
        this.zzf = zzansVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (zzanq zzanqVar : this.zza) {
            if (zzanqVar != this.zzb) {
                zzanqVar.zza.zzb(zzans.zza);
            }
        }
        Future future = this.zzc;
        if (future != null) {
            future.cancel(false);
            if (!this.zzd && this.zzf.zzv.decrementAndGet() == Integer.MIN_VALUE) {
                zzabm zzabmVar = (zzabm) this.zzf.zzg;
                zzabmVar.zzc(new zzamk(this));
                zzabmVar.zzb();
            }
        }
        Future future2 = this.zze;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.zzf.zzq();
    }
}
