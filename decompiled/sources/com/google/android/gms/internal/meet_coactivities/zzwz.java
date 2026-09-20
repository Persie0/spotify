package com.google.android.gms.internal.meet_coactivities;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzwz {
    private static zzwz zza;
    private final List zzb = Collections.EMPTY_LIST;

    public static synchronized zzwz zza() {
        try {
            if (zza == null) {
                zza = new zzwz();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public final synchronized List zzb() {
        return this.zzb;
    }

    public final synchronized boolean zzc() {
        return false;
    }
}
