package com.google.android.gms.internal.meet_coactivities;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zztr {
    public static final List zza(Object obj, long j) {
        zztg zztgVar = (zztg) zzvm.zzf(obj, j);
        if (zztgVar.zzc()) {
            return zztgVar;
        }
        int size = zztgVar.size();
        zztg zztgVarZzd = zztgVar.zzd(size == 0 ? 10 : size + size);
        zzvm.zzs(obj, j, zztgVarZzd);
        return zztgVarZzd;
    }
}
