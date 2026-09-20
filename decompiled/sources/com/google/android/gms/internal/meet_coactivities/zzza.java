package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p204p.c95;
import p204p.m12;
import p204p.upf;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzza {
    private final List zza;
    private final zzvz zzb;
    private final Object zzc;

    public /* synthetic */ zzza(List list, zzvz zzvzVar, Object obj, zzyz zzyzVar) {
        c95.m31848n(list, "addresses");
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        c95.m31848n(zzvzVar, "attributes");
        this.zzb = zzvzVar;
        this.zzc = obj;
    }

    public static zzyy zzb() {
        return new zzyy();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzza)) {
            return false;
        }
        zzza zzzaVar = (zzza) obj;
        return upf.m83705v(this.zza, zzzaVar.zza) && upf.m83705v(this.zzb, zzzaVar.zzb) && upf.m83705v(this.zzc, zzzaVar.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zza, "addresses");
        m12VarM85614C.m60523w(this.zzb, "attributes");
        m12VarM85614C.m60523w(this.zzc, "loadBalancingPolicyConfig");
        return m12VarM85614C.toString();
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final zzyy zzc() {
        zzyy zzyyVar = new zzyy();
        zzyyVar.zza(this.zza);
        zzyyVar.zzb(this.zzb);
        zzyyVar.zzc(this.zzc);
        return zzyyVar;
    }

    public final Object zzd() {
        return this.zzc;
    }

    public final List zze() {
        return this.zza;
    }
}
