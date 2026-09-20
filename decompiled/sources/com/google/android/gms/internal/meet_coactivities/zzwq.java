package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwq {
    private final zzwe zza;
    private final int zzb;
    private final boolean zzc;

    public zzwq(zzwe zzweVar, int i, boolean z) {
        c95.m31848n(zzweVar, "callOptions");
        this.zza = zzweVar;
        this.zzb = i;
        this.zzc = z;
    }

    public static zzwp zza() {
        return new zzwp();
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zza, "callOptions");
        m12VarM85614C.m60521u(this.zzb, "previousAttempts");
        m12VarM85614C.m60524x("isTransparentRetry", this.zzc);
        return m12VarM85614C.toString();
    }
}
