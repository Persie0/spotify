package com.google.android.gms.internal.meet_coactivities;

import p196j$.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgg {
    private static final zzkz zzb = zzkz.zzj("com/google/android/meet/addons/internal/ClientConfigInfo");
    static final zzgg zza = zze().zze();

    public static zzgf zze() {
        zzft zzftVar = new zzft();
        zzftVar.zzb(false);
        zzftVar.zzc(Duration.ofSeconds(1L));
        zzftVar.zzd(Duration.ofMillis(500L));
        zzftVar.zza(false);
        return zzftVar;
    }

    public static zzgg zzf(zzg zzgVar) {
        zzgf zzgfVarZze = zze();
        if (zzgVar == null) {
            ((zzkv) zzb.zze().zzh("com/google/android/meet/addons/internal/ClientConfigInfo", "fromProto", 50, "ClientConfigInfo.java")).zzo("Received null config info from Meet.");
            return zzgfVarZze.zze();
        }
        zzgfVarZze.zzb(zzgVar.zzf());
        zzgfVarZze.zza(zzgVar.zze());
        if (zzgVar.zzg()) {
            zzgfVarZze.zzc(zzvu.zzb(zzgVar.zzc()));
        }
        if (zzgVar.zzh()) {
            zzgfVarZze.zzd(zzvu.zzb(zzgVar.zzd()));
        }
        return zzgfVarZze.zze();
    }

    public abstract Duration zza();

    public abstract Duration zzb();

    public abstract boolean zzc();

    public abstract boolean zzd();
}
