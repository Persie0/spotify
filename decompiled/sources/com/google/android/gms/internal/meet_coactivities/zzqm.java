package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public enum zzqm implements zztb {
    INVALID(0),
    SWITCH_MEDIA(1),
    ALTER_POSITION(2),
    ALTER_PLAYBACK_STATE(3),
    ALTER_SPEED(4),
    ALTER_QUEUE(5),
    UNRECOGNIZED(-1);

    private final int zzi;

    zzqm(int i) {
        this.zzi = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
