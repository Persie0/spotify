package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p204p.c95;
import p204p.m12;
import p204p.upf;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyw {
    private static final zzyw zza = new zzyw(null, null, zzabe.zza, false);
    private final zzzb zzb;
    private final zzwo zzc = null;
    private final zzabe zzd;
    private final boolean zze;

    private zzyw(zzzb zzzbVar, zzwo zzwoVar, zzabe zzabeVar, boolean z) {
        this.zzb = zzzbVar;
        c95.m31848n(zzabeVar, "status");
        this.zzd = zzabeVar;
        this.zze = z;
    }

    public static zzyw zza(zzabe zzabeVar) {
        c95.m31844j(!zzabeVar.zzj(), "drop status shouldn't be OK");
        return new zzyw(null, null, zzabeVar, true);
    }

    public static zzyw zzb(zzabe zzabeVar) {
        c95.m31844j(!zzabeVar.zzj(), "error status shouldn't be OK");
        return new zzyw(null, null, zzabeVar, false);
    }

    public static zzyw zzc() {
        return zza;
    }

    public static zzyw zzd(zzzb zzzbVar, zzwo zzwoVar) {
        c95.m31848n(zzzbVar, "subchannel");
        return new zzyw(zzzbVar, null, zzabe.zza, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyw)) {
            return false;
        }
        zzyw zzywVar = (zzyw) obj;
        return upf.m83705v(this.zzb, zzywVar.zzb) && upf.m83705v(this.zzd, zzywVar.zzd) && upf.m83705v(null, null) && this.zze == zzywVar.zze;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzd, null, Boolean.valueOf(this.zze)});
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zzb, "subchannel");
        m12VarM85614C.m60523w(null, "streamTracerFactory");
        m12VarM85614C.m60523w(this.zzd, "status");
        m12VarM85614C.m60524x("drop", this.zze);
        return m12VarM85614C.toString();
    }

    public final zzzb zze() {
        return this.zzb;
    }

    public final zzabe zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze;
    }
}
