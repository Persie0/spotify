package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum xm7 implements od50 {
    AUTHENTICATOR_TRANSPORT_UNSPECIFIED(0),
    AUTHENTICATOR_TRANSPORT_USB(1),
    AUTHENTICATOR_TRANSPORT_NFC(2),
    AUTHENTICATOR_TRANSPORT_BLE(3),
    AUTHENTICATOR_TRANSPORT_INTERNAL(4),
    AUTHENTICATOR_TRANSPORT_HYBRID(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f263309a;

    xm7(int i) {
        this.f263309a = i;
    }

    /* JADX INFO: renamed from: a */
    public static xm7 m91448a(int i) {
        if (i == 0) {
            return AUTHENTICATOR_TRANSPORT_UNSPECIFIED;
        }
        if (i == 1) {
            return AUTHENTICATOR_TRANSPORT_USB;
        }
        if (i == 2) {
            return AUTHENTICATOR_TRANSPORT_NFC;
        }
        if (i == 3) {
            return AUTHENTICATOR_TRANSPORT_BLE;
        }
        if (i == 4) {
            return AUTHENTICATOR_TRANSPORT_INTERNAL;
        }
        if (i != 5) {
            return null;
        }
        return AUTHENTICATOR_TRANSPORT_HYBRID;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f263309a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
