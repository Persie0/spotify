package com.google.android.gms.internal.meet_coactivities;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public final class zztf extends AbstractList {
    private final zztd zza;
    private final zzte zzb;

    public zztf(zztd zztdVar, zzte zzteVar) {
        this.zza = zztdVar;
        this.zzb = zzteVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zza(this.zza.zze(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
