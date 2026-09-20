package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import p204p.klh;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaia {
    private final ArrayList zza = new ArrayList();

    public final String toString() {
        return this.zza.toString();
    }

    public final zzaia zza(Object obj) {
        this.zza.add(String.valueOf(obj));
        return this;
    }

    public final zzaia zzb(String str, Object obj) {
        this.zza.add(klh.m56834f(str, "=", String.valueOf(obj)));
        return this;
    }
}
