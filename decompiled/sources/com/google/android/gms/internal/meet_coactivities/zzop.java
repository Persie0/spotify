package com.google.android.gms.internal.meet_coactivities;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class zzop implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzov zzovVarZza = zzov.zza(obj);
        zzov zzovVarZza2 = zzov.zza(obj2);
        if (zzovVarZza != zzovVarZza2) {
            return zzovVarZza.compareTo(zzovVarZza2);
        }
        int iOrdinal = zzovVarZza.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
