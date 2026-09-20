package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public enum zzt implements zztb {
    LIVE_SHARING_APP_CAPABILITY_UNSPECIFIED(0),
    SESSION_LEAVING(1),
    UNRECOGNIZED(-1);

    private final int zze;

    zzt(int i) {
        this.zze = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zze;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
