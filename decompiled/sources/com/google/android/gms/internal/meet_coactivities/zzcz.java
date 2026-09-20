package com.google.android.gms.internal.meet_coactivities;

import p204p.fk00;

/* JADX INFO: loaded from: classes4.dex */
final class zzcz implements fk00 {
    final /* synthetic */ String zza;

    public zzcz(String str) {
        this.zza = str;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        ((zzkv) ((zzkv) zzda.zza.zze().zzg(th)).zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$2", "onFailure", 1023, "MeetIpcManagerImpl.java")).zzp("IPC call for %s failed.", this.zza);
    }

    @Override // p204p.fk00
    public final void onSuccess(Object obj) {
        ((zzkv) zzda.zza.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$2", "onSuccess", 1018, "MeetIpcManagerImpl.java")).zzp("IPC call for %s succeeded.", this.zza);
    }
}
