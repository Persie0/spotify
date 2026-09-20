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
public final class zzaal {
    private final List zza;
    private final zzvz zzb;
    private final zzaah zzc;

    public zzaal(List list, zzvz zzvzVar, zzaah zzaahVar) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        c95.m31848n(zzvzVar, "attributes");
        this.zzb = zzvzVar;
        this.zzc = zzaahVar;
    }

    public static zzaak zzc() {
        return new zzaak();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaal)) {
            return false;
        }
        zzaal zzaalVar = (zzaal) obj;
        return upf.m83705v(this.zza, zzaalVar.zza) && upf.m83705v(this.zzb, zzaalVar.zzb) && upf.m83705v(this.zzc, zzaalVar.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zza, "addresses");
        m12VarM85614C.m60523w(this.zzb, "attributes");
        m12VarM85614C.m60523w(this.zzc, "serviceConfig");
        return m12VarM85614C.toString();
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final zzaah zzb() {
        return this.zzc;
    }

    public final zzaak zzd() {
        zzaak zzaakVar = new zzaak();
        zzaakVar.zza(this.zza);
        zzaakVar.zzb(this.zzb);
        zzaakVar.zzc(this.zzc);
        return zzaakVar;
    }

    public final List zze() {
        return this.zza;
    }
}
