package com.google.android.gms.internal.meet_coactivities;

import p204p.s571;
import p204p.xf40;
import p204p.y85;

/* JADX INFO: loaded from: classes4.dex */
final class zzjf extends zzjp {
    private final xf40 zza;

    public zzjf(xf40 xf40Var) {
        if (xf40Var == null) {
            throw new NullPointerException("Null intentCounterMap");
        }
        this.zza = xf40Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjp)) {
            return false;
        }
        xf40 xf40Var = this.zza;
        xf40 xf40VarZza = ((zzjp) obj).zza();
        xf40Var.getClass();
        return y85.m93065j(xf40VarZza, xf40Var);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s571.m77251j("WatchingStateMetadata{intentCounterMap=", this.zza.toString(), "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjp
    public final xf40 zza() {
        return this.zza;
    }
}
