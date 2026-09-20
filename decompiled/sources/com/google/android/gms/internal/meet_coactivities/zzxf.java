package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxf {
    static final Logger zza = Logger.getLogger(zzxf.class.getName());
    public static final zzxf zzb = new zzxf();

    private zzxf() {
    }

    public static zzxf zzb() {
        zzxf zzxfVarZza = zzxd.zza.zza();
        return zzxfVarZza == null ? zzb : zzxfVarZza;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public final zzxf zza() {
        zzxf zzxfVarZzb = zzxd.zza.zzb(this);
        return zzxfVarZzb == null ? zzb : zzxfVarZzb;
    }

    public final void zzd(zzxc zzxcVar, Executor executor) {
        zzc(executor, "executor");
    }

    public final void zze(zzxf zzxfVar) {
        zzc(zzxfVar, "toAttach");
        zzxd.zza.zzc(this, zzxfVar);
    }
}
