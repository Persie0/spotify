package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzamh implements Runnable {
    final /* synthetic */ zzami zza;

    public /* synthetic */ zzamh(zzami zzamiVar, zzamg zzamgVar) {
        this.zza = zzamiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzami zzamiVar = this.zza;
        zzabm zzabmVar = (zzabm) zzamiVar.zzb;
        zzabmVar.zzc(new zzamf(zzamiVar, null));
        zzabmVar.zzb();
    }
}
