package com.google.android.gms.internal.meet_coactivities;

import p204p.fk00;

/* JADX INFO: loaded from: classes4.dex */
final class zzfj implements fk00 {
    final /* synthetic */ zzfm zza;

    public zzfj(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        ((zzkv) zzfm.zza.zze().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl$2", "onFailure", 248, "AddonSessionBuilderImpl.java")).zzo("Session future failed; not setting initial collaboration starting state.");
    }

    @Override // p204p.fk00
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzfm zzfmVar = this.zza;
        zzfmVar.zzc.zzS(zzfmVar.zzi);
    }
}
