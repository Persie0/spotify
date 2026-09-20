package com.google.android.gms.internal.meet_coactivities;

import p204p.fk00;

/* JADX INFO: loaded from: classes4.dex */
final class zzeq implements fk00 {
    final /* synthetic */ zzfa zza;

    public zzeq(zzfa zzfaVar) {
        this.zza = zzfaVar;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        ((zzkv) ((zzkv) zzfa.zzd.zzd().zzg(th)).zzh("com/google/android/meet/addons/internal/AddonClientImpl$1", "onFailure", 357, "AddonClientImpl.java")).zzo("connectMeeting call to IpcManager failed.");
        this.zza.zzai();
    }

    @Override // p204p.fk00
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ((zzkv) zzfa.zzd.zzb().zzh("com/google/android/meet/addons/internal/AddonClientImpl$1", "onSuccess", 349, "AddonClientImpl.java")).zzo("connectMeeting call to IpcManager succeeded.");
        this.zza.zzr = new zzip();
    }
}
