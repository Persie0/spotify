package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzln {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();

    public abstract Object zza();

    public final Object zzb(zzll zzllVar, zzms zzmsVar) {
        Object obj = this.zza.get(zzllVar);
        if (obj != null) {
            return obj;
        }
        Object objZza = zza();
        Object objPutIfAbsent = this.zza.putIfAbsent(zzllVar, objZza);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iZza = zzmsVar.zza();
        zzlm zzlmVar = null;
        for (int i = 0; i < iZza; i++) {
            if (zzle.zzf.equals(zzmsVar.zzb(i))) {
                Object objZzd = zzmsVar.zzd(i);
                if (objZzd instanceof zzlr) {
                    if (zzlmVar == null) {
                        zzlmVar = new zzlm(this, zzllVar);
                    }
                    ((zzlr) objZzd).zza();
                }
            }
        }
        return objZza;
    }
}
