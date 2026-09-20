package com.google.android.gms.internal.meet_coactivities;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsk {
    static final zzsk zza = new zzsk(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzsk() {
        this.zzd = new HashMap();
    }

    public static zzsk zza() {
        int i = zzun.zza;
        return zza;
    }

    public final zzsx zzb(zzuf zzufVar, int i) {
        return (zzsx) this.zzd.get(new zzsj(zzufVar, i));
    }

    public zzsk(boolean z) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
