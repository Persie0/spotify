package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p196j$.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
class zzdc implements zzapo {
    private static final zzkz zzd = zzkz.zzj("com/google/android/libraries/communications/sdk/sync/ipc/ResponseObserver");
    protected volatile Object zza = null;
    protected volatile Throwable zzb = null;
    protected final CountDownLatch zzc = new CountDownLatch(1);
    private final String zze;
    private final Duration zzf;

    public zzdc(Duration duration, String str) {
        this.zzf = duration;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public void zza() {
        ((zzkv) zzd.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/ResponseObserver", "onCompleted", 102, "ResponseObserver.java")).zzs("onCompleted called for %s - thread %s", this.zze, Thread.currentThread().getName());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public void zzb(Throwable th) {
        ((zzkv) ((zzkv) zzd.zze().zzg(th)).zzh("com/google/android/libraries/communications/sdk/sync/ipc/ResponseObserver", "onError", 92, "ResponseObserver.java")).zzs("onError called for %s - thread %s", this.zze, Thread.currentThread().getName());
        this.zzb = zzdb.zza(th);
        this.zzc.countDown();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public void zzc(Object obj) {
        ((zzkv) zzd.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/ResponseObserver", "onNext", 81, "ResponseObserver.java")).zzs("onNext called for %s - thread %s", this.zze, Thread.currentThread().getName());
        this.zza = obj;
        this.zzc.countDown();
    }

    public final Object zzd() {
        try {
            if (!this.zzc.await(this.zzf.getSeconds(), TimeUnit.SECONDS)) {
                ((zzkv) zzd.zze().zzh("com/google/android/libraries/communications/sdk/sync/ipc/ResponseObserver", "getOrWaitForResponse", 70, "ResponseObserver.java")).zzp("Timed out while waiting for the response - thread %s", Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            ((zzkv) ((zzkv) zzd.zzd().zzg(e)).zzh("com/google/android/libraries/communications/sdk/sync/ipc/ResponseObserver", "getOrWaitForResponse", 65, "ResponseObserver.java")).zzs("Failed to get %s from Meet Service - thread %s", this.zze, Thread.currentThread().getName());
        }
        return this.zza;
    }
}
