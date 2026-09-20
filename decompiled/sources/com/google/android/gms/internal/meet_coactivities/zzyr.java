package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.List;
import p204p.c95;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyr {
    private final List zza;
    private final zzvz zzb;
    private final Object[][] zzc;

    public /* synthetic */ zzyr(List list, zzvz zzvzVar, Object[][] objArr, zzyq zzyqVar) {
        c95.m31848n(list, "addresses are not set");
        this.zza = list;
        c95.m31848n(zzvzVar, "attrs");
        this.zzb = zzvzVar;
        c95.m31848n(objArr, "customOptions");
        this.zzc = objArr;
    }

    public static zzyo zzb() {
        return new zzyo();
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zza, "addrs");
        m12VarM85614C.m60523w(this.zzb, "attrs");
        m12VarM85614C.m60523w(Arrays.deepToString(this.zzc), "customOptions");
        return m12VarM85614C.toString();
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zza;
    }
}
