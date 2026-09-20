package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class zzun {
    public static final /* synthetic */ int zza = 0;
    private static final zzun zzb = new zzun();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzus zzc = new zztw();

    private zzun() {
    }

    public static zzun zza() {
        return zzb;
    }

    public final zzur zzb(Class cls) {
        zzth.zzc(cls, "messageType");
        zzur zzurVar = (zzur) this.zzd.get(cls);
        if (zzurVar != null) {
            return zzurVar;
        }
        zzur zzurVarZza = this.zzc.zza(cls);
        zzth.zzc(cls, "messageType");
        zzur zzurVar2 = (zzur) this.zzd.putIfAbsent(cls, zzurVarZza);
        return zzurVar2 == null ? zzurVarZza : zzurVar2;
    }
}
