package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwx {
    public static final /* synthetic */ int zza = 0;
    private static final zzwx zzb = new zzwx(new zzwt(), zzwu.zza);
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public zzwx(zzww... zzwwVarArr) {
        for (int i = 0; i < 2; i++) {
            zzww zzwwVar = zzwwVarArr[i];
            this.zzc.put(zzwwVar.zza(), zzwwVar);
        }
    }

    public static zzwx zza() {
        return zzb;
    }
}
