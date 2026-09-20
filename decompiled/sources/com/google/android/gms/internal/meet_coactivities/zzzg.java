package com.google.android.gms.internal.meet_coactivities;

import java.util.Map;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzzg extends zzys {
    static {
        zzaah.zza(new zzzf());
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(zzd(), "policy");
        m12VarM85614C.m60521u(5, "priority");
        m12VarM85614C.m60524x("available", true);
        return m12VarM85614C.toString();
    }

    public abstract int zzb();

    public zzaah zzc(Map map) {
        throw null;
    }

    public abstract String zzd();

    public abstract boolean zze();
}
