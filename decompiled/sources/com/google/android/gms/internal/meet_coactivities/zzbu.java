package com.google.android.gms.internal.meet_coactivities;

import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
final class zzbu implements zzapo {
    private static final zzkz zza = zzkz.zzj("com/google/android/libraries/communications/sdk/sync/ipc/BroadcastStateUpdateResponseObserver");
    private final zzbw zzb;

    public zzbu(zzbw zzbwVar) {
        this.zzb = zzbwVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zza() {
        ((zzkv) zza.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/BroadcastStateUpdateResponseObserver", "onCompleted", 48, "BroadcastStateUpdateResponseObserver.java")).zzp("onCompleted called - thread %s", Thread.currentThread().getName());
        this.zzb.zzb(Optional.empty());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zzb(Throwable th) {
        ((zzkv) ((zzkv) zza.zze().zzg(th)).zzh("com/google/android/libraries/communications/sdk/sync/ipc/BroadcastStateUpdateResponseObserver", "onError", 36, "BroadcastStateUpdateResponseObserver.java")).zzp("onError called - thread %s", Thread.currentThread().getName());
        this.zzb.zzb(Optional.of(th));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final /* bridge */ /* synthetic */ void zzc(Object obj) {
        zzbn zzbnVar = (zzbn) obj;
        ((zzkv) zza.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/BroadcastStateUpdateResponseObserver", "onNext", 26, "BroadcastStateUpdateResponseObserver.java")).zzq("onNext called with response with lamport counter: %d - thread %s", zzbnVar.zzf().zzb(), Thread.currentThread().getName());
        this.zzb.zza(zzbnVar);
    }
}
