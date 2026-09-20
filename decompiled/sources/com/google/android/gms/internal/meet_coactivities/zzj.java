package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public enum zzj implements zztb {
    HOST_APP_UNKNOWN(0),
    HOST_APP_HAM(1),
    HOST_APP_MIG(2),
    HOST_APP_DUET(3),
    HOST_APP_FAKE_TACHYON(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzj(int i) {
        this.zzh = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
