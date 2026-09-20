package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p204p.c95;
import p204p.upf;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaey {
    private String zza = "unknown-authority";
    private zzvz zzb = zzvz.zza;
    private String zzc;
    private zzxv zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaey)) {
            return false;
        }
        zzaey zzaeyVar = (zzaey) obj;
        return this.zza.equals(zzaeyVar.zza) && this.zzb.equals(zzaeyVar.zzb) && upf.m83705v(null, null) && upf.m83705v(this.zzd, zzaeyVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, this.zzd});
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final zzaey zzb(String str) {
        c95.m31848n(str, "authority");
        this.zza = str;
        return this;
    }

    public final zzaey zzc(zzvz zzvzVar) {
        c95.m31848n(zzvzVar, "eagAttributes");
        this.zzb = zzvzVar;
        return this;
    }

    public final zzaey zzd(zzxv zzxvVar) {
        this.zzd = zzxvVar;
        return this;
    }

    public final zzaey zze(String str) {
        this.zzc = null;
        return this;
    }

    public final String zzf() {
        return this.zza;
    }
}
