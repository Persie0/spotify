package com.google.android.gms.internal.meet_coactivities;

import p196j$.time.Duration;
import p196j$.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class zzji {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/state/DesiredPositionTracker");
    private Duration zzb = Duration.ZERO;
    private Instant zzc = null;

    public zzji(zzpr zzprVar) {
    }

    public final Duration zza(zzqk zzqkVar) {
        Instant instant = this.zzc;
        if (instant == null) {
            ((zzkv) zza.zze().zzh("com/google/android/meet/addons/internal/state/DesiredPositionTracker", "getDesiredPosition", 67, "DesiredPositionTracker.java")).zzo("Did not expect markBaselineDesiredPosition to not be called.");
            return zzvu.zzb(zzqkVar.zzf());
        }
        Duration durationBetween = Duration.between(instant, Instant.now());
        int iZzo = zzqkVar.zzo();
        if (iZzo == 5 || iZzo == 6) {
            return zzvu.zzb(zzqkVar.zzf());
        }
        double dZza = zzqkVar.zza();
        if (dZza == 0.0d) {
            ((zzkv) zza.zze().zzh("com/google/android/meet/addons/internal/state/DesiredPositionTracker", "getDesiredPosition", 86, "DesiredPositionTracker.java")).zzo("Did not expect playoutRate to ever be zero, yet here we are.");
            dZza = 1.0d;
        }
        return this.zzb.plus(zzpo.zza(durationBetween, dZza));
    }

    public final void zzb(Duration duration) {
        this.zzc = Instant.now();
        this.zzb = duration;
    }
}
