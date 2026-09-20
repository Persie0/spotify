package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum ur6 implements od50 {
    ATV_PAIRING_ERROR_UNSPECIFIED(0),
    ATV_PAIRING_ERROR_INVALID_PIN_FORMAT(1),
    ATV_PAIRING_ERROR_HAP_AUTHENTICATION(2),
    ATV_PAIRING_ERROR_HAP_BACKOFF(3),
    ATV_PAIRING_ERROR_HAP_MAX_PEERS(4),
    ATV_PAIRING_ERROR_HAP_MAX_TRIES(5),
    ATV_PAIRING_ERROR_HAP_UNAVAILABLE(6),
    ATV_PAIRING_ERROR_HAP_BUSY(7),
    ATV_PAIRING_ERROR_UNKNOWN_HAP_ERROR(8),
    ATV_PAIRING_ERROR_DEVICE_NOT_RESPONDING(9),
    ATV_PAIRING_ERROR_CONNECTION_LOST(10),
    ATV_PAIRING_ERROR_UNKNOWN(11),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f233238a;

    ur6(int i) {
        this.f233238a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f233238a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
