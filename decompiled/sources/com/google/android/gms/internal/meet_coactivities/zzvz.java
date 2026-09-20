package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import p204p.upf;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvz {
    public static final zzvz zza;
    private static final IdentityHashMap zzb;
    private final IdentityHashMap zzc;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        zzb = identityHashMap;
        zza = new zzvz(identityHashMap);
    }

    private zzvz(IdentityHashMap identityHashMap) {
        this.zzc = identityHashMap;
    }

    public static zzvw zza() {
        return new zzvw(zza, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzvz.class != obj.getClass()) {
            return false;
        }
        zzvz zzvzVar = (zzvz) obj;
        if (this.zzc.size() != zzvzVar.zzc.size()) {
            return false;
        }
        for (Map.Entry entry : this.zzc.entrySet()) {
            if (!zzvzVar.zzc.containsKey(entry.getKey()) || !upf.m83705v(entry.getValue(), zzvzVar.zzc.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.zzc.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzvw zzb() {
        return new zzvw(this, null);
    }

    public final Object zzc(zzvx zzvxVar) {
        return this.zzc.get(zzvxVar);
    }

    public /* synthetic */ zzvz(IdentityHashMap identityHashMap, zzvy zzvyVar) {
        this.zzc = identityHashMap;
    }
}
