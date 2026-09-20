package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwp {
    private zzwe zza = zzwe.zza;
    private int zzb;
    private boolean zzc;

    public final zzwp zza(zzwe zzweVar) {
        c95.m31848n(zzweVar, "callOptions cannot be null");
        this.zza = zzweVar;
        return this;
    }

    public final zzwp zzb(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzwp zzc(int i) {
        this.zzb = i;
        return this;
    }

    public final zzwq zzd() {
        return new zzwq(this.zza, this.zzb, this.zzc);
    }
}
