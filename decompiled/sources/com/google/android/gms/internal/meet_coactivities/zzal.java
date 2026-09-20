package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public enum zzal implements zztb {
    UNKNOWN(0),
    CONNECTING(1),
    CONNECTED(2),
    CONNECTED_WITH_COACTIVITY(3),
    CONNECTED_WITH_COACTIVITY_LOCAL_USER_LEFT(8),
    ENDING(4),
    ENDED(5),
    NOT_CONNECTED(6),
    ENDED_UNEXPECTEDLY(7),
    ENDED_DUE_TO_RECORDING_STATUS_DESYNC(9),
    UNRECOGNIZED(-1);

    private final int zzm;

    zzal(int i) {
        this.zzm = i;
    }

    public static zzal zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONNECTING;
            case 2:
                return CONNECTED;
            case 3:
                return CONNECTED_WITH_COACTIVITY;
            case 4:
                return ENDING;
            case 5:
                return ENDED;
            case 6:
                return NOT_CONNECTED;
            case 7:
                return ENDED_UNEXPECTEDLY;
            case 8:
                return CONNECTED_WITH_COACTIVITY_LOCAL_USER_LEFT;
            case 9:
                return ENDED_DUE_TO_RECORDING_STATUS_DESYNC;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzm;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
