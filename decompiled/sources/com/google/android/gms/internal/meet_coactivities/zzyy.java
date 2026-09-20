package com.google.android.gms.internal.meet_coactivities;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyy {
    private List zza;
    private zzvz zzb = zzvz.zza;
    private Object zzc;

    public final zzyy zza(List list) {
        this.zza = list;
        return this;
    }

    public final zzyy zzb(zzvz zzvzVar) {
        this.zzb = zzvzVar;
        return this;
    }

    public final zzyy zzc(Object obj) {
        this.zzc = obj;
        return this;
    }

    public final zzza zzd() {
        return new zzza(this.zza, this.zzb, this.zzc, null);
    }
}
