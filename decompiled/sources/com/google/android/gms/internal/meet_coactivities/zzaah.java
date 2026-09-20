package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p204p.c95;
import p204p.m12;
import p204p.upf;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaah {
    private final zzabe zza;
    private final Object zzb;

    private zzaah(zzabe zzabeVar) {
        this.zzb = null;
        c95.m31848n(zzabeVar, "status");
        this.zza = zzabeVar;
        c95.m31845k(!zzabeVar.zzj(), "cannot use OK status: %s", zzabeVar);
    }

    public static zzaah zza(Object obj) {
        return new zzaah(obj);
    }

    public static zzaah zzb(zzabe zzabeVar) {
        return new zzaah(zzabeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaah.class == obj.getClass()) {
            zzaah zzaahVar = (zzaah) obj;
            if (upf.m83705v(this.zza, zzaahVar.zza) && upf.m83705v(this.zzb, zzaahVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        if (this.zzb != null) {
            m12 m12VarM85614C = vie1.m85614C(this);
            m12VarM85614C.m60523w(this.zzb, "config");
            return m12VarM85614C.toString();
        }
        m12 m12VarM85614C2 = vie1.m85614C(this);
        m12VarM85614C2.m60523w(this.zza, "error");
        return m12VarM85614C2.toString();
    }

    public final zzabe zzc() {
        return this.zza;
    }

    public final Object zzd() {
        return this.zzb;
    }

    private zzaah(Object obj) {
        c95.m31848n(obj, "config");
        this.zzb = obj;
        this.zza = null;
    }
}
