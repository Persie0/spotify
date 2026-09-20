package com.google.android.gms.internal.meet_coactivities;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmw {
    private static final zzna zza = new zzmt();
    private static final zzmz zzb = new zzmu();
    private final zzna zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzmz zzf = null;

    public final zzmw zza(zzmz zzmzVar) {
        this.zzf = zzmzVar;
        return this;
    }

    public final zznb zzc() {
        return new zzmy(this, null);
    }

    public final void zzf(zzlt zzltVar) {
        zzpj.zza(zzltVar, "key");
        if (!zzltVar.zzi()) {
            zzna zznaVar = zza;
            zzpj.zza(zzltVar, "key");
            this.zzd.remove(zzltVar);
            this.zzc.put(zzltVar, zznaVar);
            return;
        }
        zzmz zzmzVar = zzb;
        zzpj.zza(zzltVar, "key");
        zzpj.zzc(zzltVar.zzi(), "key must be repeating");
        this.zzc.remove(zzltVar);
        this.zzd.put(zzltVar, zzmzVar);
    }
}
