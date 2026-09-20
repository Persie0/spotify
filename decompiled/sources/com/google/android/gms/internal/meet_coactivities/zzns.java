package com.google.android.gms.internal.meet_coactivities;

import com.google.common.annotations.GoogleInternal;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzns {

    @GoogleInternal
    private static String zza = "com.google.android.gms.internal.meet_coactivities.zzny";

    @GoogleInternal
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.gms.internal.meet_coactivities.zzny", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzpl.zza();
    }

    public static long zzb() {
        return zznq.zza.zzc();
    }

    public static zzmo zzd(String str) {
        return zznq.zza.zze(str);
    }

    public static zzms zzf() {
        return zzi().zza();
    }

    public static zznr zzg() {
        return zznq.zza.zzh();
    }

    public static zzok zzi() {
        return zznq.zza.zzj();
    }

    public static zzow zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        return zznq.zza.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z) {
        zzi().zzd(str, level, z);
        return false;
    }

    public long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract zzmo zze(String str);

    public abstract zznr zzh();

    public zzok zzj() {
        return zzok.zze();
    }

    public abstract String zzm();
}
