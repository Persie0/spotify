package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public enum zzam implements zztb {
    PRIVILEGE_UNSPECIFIED(0),
    MAY_CONTROL_CO_ACTIVITY(1),
    UNRECOGNIZED(-1);

    private final int zze;

    zzam(int i) {
        this.zze = i;
    }

    public static zzam zzb(int i) {
        if (i == 0) {
            return PRIVILEGE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return MAY_CONTROL_CO_ACTIVITY;
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
