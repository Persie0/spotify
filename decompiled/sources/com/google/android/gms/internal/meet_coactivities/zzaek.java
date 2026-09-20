package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaek {
    private final zzaox zza;
    private final zzaiy zzb = zzaiz.zza();
    private final zzaiy zzc = zzaiz.zza();
    private final zzaiy zzd = zzaiz.zza();
    private volatile long zze;

    public zzaek(zzaox zzaoxVar) {
        this.zza = zzaoxVar;
    }

    public final void zza(boolean z) {
        if (z) {
            this.zzc.zza(1L);
        } else {
            this.zzd.zza(1L);
        }
    }

    public final void zzb() {
        this.zzb.zza(1L);
        this.zze = this.zza.zza();
    }
}
