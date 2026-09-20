package com.google.android.gms.internal.meet_coactivities;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvw {
    private zzvz zza;
    private IdentityHashMap zzb;

    public /* synthetic */ zzvw(zzvz zzvzVar, zzvv zzvvVar) {
        this.zza = zzvzVar;
    }

    public final zzvw zza(zzvx zzvxVar) {
        if (this.zza.zzc.containsKey(zzvxVar)) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.zza.zzc);
            identityHashMap.remove(zzvxVar);
            this.zza = new zzvz(identityHashMap, null);
        }
        IdentityHashMap identityHashMap2 = this.zzb;
        if (identityHashMap2 != null) {
            identityHashMap2.remove(zzvxVar);
        }
        return this;
    }

    public final zzvw zzb(zzvx zzvxVar, Object obj) {
        if (this.zzb == null) {
            this.zzb = new IdentityHashMap(1);
        }
        this.zzb.put(zzvxVar, obj);
        return this;
    }

    public final zzvz zzc() {
        if (this.zzb != null) {
            for (Map.Entry entry : this.zza.zzc.entrySet()) {
                if (!this.zzb.containsKey(entry.getKey())) {
                    this.zzb.put((zzvx) entry.getKey(), entry.getValue());
                }
            }
            this.zza = new zzvz(this.zzb, null);
            this.zzb = null;
        }
        return this.zza;
    }
}
