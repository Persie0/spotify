package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxb {
    private final zzxa zza;
    private final zzabe zzb;

    private zzxb(zzxa zzxaVar, zzabe zzabeVar) {
        c95.m31848n(zzxaVar, "state is null");
        this.zza = zzxaVar;
        c95.m31848n(zzabeVar, "status is null");
        this.zzb = zzabeVar;
    }

    public static zzxb zzb(zzxa zzxaVar) {
        c95.m31844j(zzxaVar != zzxa.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new zzxb(zzxaVar, zzabe.zza);
    }

    public static zzxb zzc(zzabe zzabeVar) {
        c95.m31844j(!zzabeVar.zzj(), "The error status must not be OK");
        return new zzxb(zzxa.TRANSIENT_FAILURE, zzabeVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxb)) {
            return false;
        }
        zzxb zzxbVar = (zzxb) obj;
        return this.zza.equals(zzxbVar.zza) && this.zzb.equals(zzxbVar.zzb);
    }

    public final int hashCode() {
        zzabe zzabeVar = this.zzb;
        return zzabeVar.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        if (this.zzb.zzj()) {
            return this.zza.toString();
        }
        return s571.m77252k(String.valueOf(this.zza), "(", String.valueOf(this.zzb), ")");
    }

    public final zzxa zza() {
        return this.zza;
    }

    public final zzabe zzd() {
        return this.zzb;
    }
}
