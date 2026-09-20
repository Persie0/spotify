package com.google.android.gms.internal.meet_coactivities;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaad {
    private static zzaad zza;

    public zzaad() {
        new HashSet();
    }

    public static synchronized zzaad zza() {
        try {
            if (zza == null) {
                zza = new zzaad();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
