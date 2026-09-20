package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzane implements Runnable {
    final zzanc zza;
    final /* synthetic */ zzans zzb;

    public zzane(zzans zzansVar, zzanc zzancVar) {
        this.zzb = zzansVar;
        this.zza = zzancVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzanq zzanqVarZzae = this.zzb.zzae(this.zzb.zzs.zze, false);
        if (zzanqVarZzae == null) {
            return;
        }
        this.zzb.zzd.execute(new zzand(this, zzanqVarZzae));
    }
}
