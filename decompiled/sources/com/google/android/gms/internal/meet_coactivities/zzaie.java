package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaie implements Runnable {
    final /* synthetic */ zzaif zza;

    public zzaie(zzaif zzaifVar) {
        this.zza = zzaifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaiu zzaiuVar = this.zza.zzb;
        zzald zzaldVar = zzaiuVar.zzp;
        zzaiuVar.zzo = null;
        this.zza.zzb.zzp = null;
        zzaldVar.zzm(zzabe.zzk.zze("InternalSubchannel closed transport due to address change"));
    }
}
