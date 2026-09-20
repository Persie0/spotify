package com.google.android.gms.internal.meet_coactivities;

import java.util.Optional;
import p196j$.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
final class zzbv extends zzdc {
    private static final zzkz zzd = zzkz.zzj("com/google/android/libraries/communications/sdk/sync/ipc/ConnectMeetingResponseObserver");
    private final zzbw zze;

    public zzbv(zzbw zzbwVar, Duration duration) {
        super(duration, "StreamingConnectMeetingResponse");
        this.zze = zzbwVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzdc, com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zza() {
        ((zzkv) zzd.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/ConnectMeetingResponseObserver", "onCompleted", 77, "ConnectMeetingResponseObserver.java")).zzp("onCompleted called - thread %s", Thread.currentThread().getName());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzdc, com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zzb(Throwable th) {
        ((zzkv) ((zzkv) zzd.zze().zzg(th)).zzh("com/google/android/libraries/communications/sdk/sync/ipc/ConnectMeetingResponseObserver", "onError", 53, "ConnectMeetingResponseObserver.java")).zzs("onError called for %s - thread %s", "StreamingConnectMeetingResponse", Thread.currentThread().getName());
        this.zzb = zzdb.zza(th);
        if (this.zzc.getCount() != 0) {
            this.zzc.countDown();
            return;
        }
        zzbw zzbwVar = this.zze;
        Throwable th2 = this.zzb;
        th2.getClass();
        zzbwVar.zzb(Optional.of(th2));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzdc, com.google.android.gms.internal.meet_coactivities.zzapo
    public final /* bridge */ /* synthetic */ void zzc(Object obj) {
        zzx zzxVar = (zzx) obj;
        if (this.zzc.getCount() == 0) {
            ((zzkv) zzd.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/ConnectMeetingResponseObserver", "onNext", 36, "ConnectMeetingResponseObserver.java")).zzs("Additional onNext called for %s - thread %s", "StreamingConnectMeetingResponse", Thread.currentThread().getName());
            this.zze.zzc(zzxVar);
        } else {
            ((zzkv) zzd.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/ConnectMeetingResponseObserver", "onNext", 44, "ConnectMeetingResponseObserver.java")).zzs("onNext called for %s - thread %s", "StreamingConnectMeetingResponse", Thread.currentThread().getName());
            this.zza = zzxVar;
            this.zzc.countDown();
        }
    }
}
