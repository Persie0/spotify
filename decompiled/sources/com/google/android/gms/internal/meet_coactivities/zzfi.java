package com.google.android.gms.internal.meet_coactivities;

import p204p.fk00;
import p204p.i3n0;

/* JADX INFO: loaded from: classes4.dex */
final class zzfi implements fk00 {
    final /* synthetic */ i3n0 zza;
    final /* synthetic */ zzfm zzb;

    public zzfi(zzfm zzfmVar, i3n0 i3n0Var) {
        this.zza = i3n0Var;
        this.zzb = zzfmVar;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        ((zzkv) zzfm.zza.zze().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl$1", "onFailure", 224, "AddonSessionBuilderImpl.java")).zzo("Session future failed; not setting participant metadata.");
    }

    @Override // p204p.fk00
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzfm zzfmVar = this.zzb;
        zzfmVar.zzc.zzU(zzfmVar.zzh, this.zza);
    }
}
