package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzaph extends zzapg {
    private final zzwj zza;
    private final boolean zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzaph(zzwj zzwjVar, boolean z) {
        this.zza = zzwjVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zza() {
        this.zza.zzb();
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zzb(Throwable th) {
        this.zza.zza("Cancelled by client with StreamObserver.onError()", th);
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zzc(Object obj) {
        c95.m31856v(!this.zzc, "Stream was terminated by error, no further calls are allowed");
        c95.m31856v(!this.zzd, "Stream is already completed, no further calls are allowed");
        this.zza.zzd(obj);
    }

    public final void zzd(int i) {
        if (this.zzb) {
            this.zza.zzc(1);
        } else {
            this.zza.zzc(2);
        }
    }
}
