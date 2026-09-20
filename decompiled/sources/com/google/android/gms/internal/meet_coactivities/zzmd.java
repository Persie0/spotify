package com.google.android.gms.internal.meet_coactivities;

import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
final class zzmd implements zzll {
    private final zzll zza;
    private final Object zzb;

    private zzmd(zzll zzllVar, Object obj) {
        zzpj.zza(zzllVar, "log site key");
        this.zza = zzllVar;
        zzpj.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    public static zzll zza(zzll zzllVar, Object obj) {
        return new zzmd(zzllVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmd)) {
            return false;
        }
        zzmd zzmdVar = (zzmd) obj;
        return this.zza.equals(zzmdVar.zza) && this.zzb.equals(zzmdVar.zzb);
    }

    public final int hashCode() {
        Object obj = this.zzb;
        return obj.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        return dq60.m36615o("SpecializedLogSiteKey{ delegate='", this.zza.toString(), "', qualifier='", this.zzb.toString(), "' }");
    }
}
