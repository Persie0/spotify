package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxw {
    private String zza;
    private zzxx zzb;
    private Long zzc;
    private zzyn zzd;

    public final zzxw zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzxw zzb(zzxx zzxxVar) {
        this.zzb = zzxxVar;
        return this;
    }

    public final zzxw zzc(zzyn zzynVar) {
        this.zzd = zzynVar;
        return this;
    }

    public final zzxw zzd(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    public final zzxz zze() {
        c95.m31848n(this.zza, "description");
        c95.m31848n(this.zzb, "severity");
        c95.m31848n(this.zzc, "timestampNanos");
        return new zzxz(this.zza, this.zzb, this.zzc.longValue(), null, this.zzd, null);
    }
}
