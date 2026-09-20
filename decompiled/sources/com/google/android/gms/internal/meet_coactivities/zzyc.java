package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyc {
    private Object zza;

    private zzyc() {
        throw null;
    }

    public final zzyc zza(Object obj) {
        c95.m31848n(obj, "config");
        this.zza = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzye zzb() {
        c95.m31856v(this.zza != null, "config is not set");
        return new zzye(zzabe.zza, this.zza, null, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzyc(zzyb zzybVar) {
    }
}
