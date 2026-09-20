package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public enum zzmk {
    GENERAL(false, true),
    BOOLEAN(false, false),
    CHARACTER(false, false),
    INTEGRAL(true, false),
    FLOAT(true, true);

    private final boolean zzg;

    zzmk(boolean z, boolean z2) {
        this.zzg = z2;
    }

    public final boolean zza() {
        return this.zzg;
    }
}
