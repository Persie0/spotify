package com.google.android.gms.internal.meet_coactivities;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzya {
    private static final zzya zza;
    private final ConcurrentNavigableMap zzb;
    private final ConcurrentMap zzc;
    private final ConcurrentMap zzd;

    static {
        Logger.getLogger(zzya.class.getName());
        zza = new zzya();
    }

    public zzya() {
        new ConcurrentSkipListMap();
        this.zzb = new ConcurrentSkipListMap();
        this.zzc = new ConcurrentHashMap();
        this.zzd = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static zzya zza() {
        return zza;
    }

    private static void zzh(Map map, zzyi zzyiVar) {
    }

    private static void zzi(Map map, zzyi zzyiVar) {
    }

    public final void zzb(zzyi zzyiVar) {
        zzh(this.zzd, zzyiVar);
    }

    public final void zzc(zzyi zzyiVar) {
        zzh(this.zzb, zzyiVar);
    }

    public final void zzd(zzyi zzyiVar) {
        zzh(this.zzc, zzyiVar);
    }

    public final void zze(zzyi zzyiVar) {
        zzi(this.zzd, zzyiVar);
    }

    public final void zzf(zzyi zzyiVar) {
        zzi(this.zzb, zzyiVar);
    }

    public final void zzg(zzyi zzyiVar) {
        zzi(this.zzc, zzyiVar);
    }
}
