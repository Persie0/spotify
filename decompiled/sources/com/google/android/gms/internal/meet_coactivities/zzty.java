package com.google.android.gms.internal.meet_coactivities;

import p204p.ilf1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzty {
    private final zztx zza;

    private zzty(zzvq zzvqVar, Object obj, zzvq zzvqVar2, Object obj2) {
        this.zza = new zztx(zzvqVar, obj, zzvqVar2, obj2);
    }

    public static int zzb(zztx zztxVar, Object obj, Object obj2) {
        return zzsp.zza(zztxVar.zza, 1, obj) + zzsp.zza(zztxVar.zzc, 2, obj2);
    }

    public static zzty zzd(zzvq zzvqVar, Object obj, zzvq zzvqVar2, Object obj2) {
        return new zzty(zzvqVar, obj, zzvqVar2, obj2);
    }

    public static void zze(zzsc zzscVar, zztx zztxVar, Object obj, Object obj2) {
        zzsp.zzi(zzscVar, zztxVar.zza, 1, obj);
        zzsp.zzi(zzscVar, zztxVar.zzc, 2, obj2);
    }

    public final int zza(int i, Object obj, Object obj2) {
        zztx zztxVar = this.zza;
        int iZzz = zzsc.zzz(i << 3);
        int iZzb = zzb(zztxVar, obj, obj2);
        return ilf1.m51028p(iZzb, iZzb, iZzz);
    }

    public final zztx zzc() {
        return this.zza;
    }
}
