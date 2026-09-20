package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p204p.c95;
import p204p.m12;
import p204p.upf;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxz {
    public final String zza;
    public final zzxx zzb;
    public final long zzc;
    public final zzyn zzd;
    public final zzyn zze;

    public /* synthetic */ zzxz(String str, zzxx zzxxVar, long j, zzyn zzynVar, zzyn zzynVar2, zzxy zzxyVar) {
        this.zza = str;
        c95.m31848n(zzxxVar, "severity");
        this.zzb = zzxxVar;
        this.zzc = j;
        this.zzd = null;
        this.zze = zzynVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzxz) {
            zzxz zzxzVar = (zzxz) obj;
            if (upf.m83705v(this.zza, zzxzVar.zza) && upf.m83705v(this.zzb, zzxzVar.zzb) && this.zzc == zzxzVar.zzc && upf.m83705v(null, null) && upf.m83705v(this.zze, zzxzVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Long.valueOf(this.zzc), null, this.zze});
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zza, "description");
        m12VarM85614C.m60523w(this.zzb, "severity");
        m12VarM85614C.m60522v(this.zzc, "timestampNanos");
        m12VarM85614C.m60523w(null, "channelRef");
        m12VarM85614C.m60523w(this.zze, "subchannelRef");
        return m12VarM85614C.toString();
    }
}
