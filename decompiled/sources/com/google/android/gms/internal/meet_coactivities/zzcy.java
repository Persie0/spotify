package com.google.android.gms.internal.meet_coactivities;

import p204p.fk00;

/* JADX INFO: loaded from: classes4.dex */
final class zzcy implements fk00 {
    final /* synthetic */ String zza;

    public zzcy(zzda zzdaVar, String str) {
        this.zza = str;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        ((zzkv) ((zzkv) zzda.zza.zzd().zzg(th)).zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$1", "onFailure", 991, "MeetIpcManagerImpl.java")).zzs("%s unsuccessful - thread %s", this.zza, Thread.currentThread().getName());
    }

    @Override // p204p.fk00
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ((zzkv) zzda.zza.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$1", "onSuccess", 986, "MeetIpcManagerImpl.java")).zzs("%s successful - thread %s", this.zza, Thread.currentThread().getName());
    }
}
