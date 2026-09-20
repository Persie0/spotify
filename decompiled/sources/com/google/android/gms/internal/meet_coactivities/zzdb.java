package com.google.android.gms.internal.meet_coactivities;

import p204p.pv1;
import p204p.sli0;

/* JADX INFO: loaded from: classes4.dex */
final class zzdb {
    public static Throwable zza(Throwable th) {
        zzaaz zzaazVarZza = zzabe.zzc(th).zza();
        if (zzaazVarZza.equals(zzaaz.UNIMPLEMENTED)) {
            return sli0.m78492s(pv1.f181560b);
        }
        return zzaazVarZza.equals(zzaaz.UNAVAILABLE) ? sli0.m78492s(pv1.f181561c) : th;
    }
}
