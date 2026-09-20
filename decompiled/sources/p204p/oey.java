package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum oey implements od50 {
    UNKNOWN(0),
    ENTITLEMENT_MISSING(1),
    FEATURE_UNAVAILABLE(2),
    AGE_RESTRICTED(3),
    AGE_ASSURANCE_REQUIRED(4),
    CHILD_ACCOUNT(5),
    DEVICE_NOT_SUPPORTED(6),
    BLOCKED_BY_USER_SETTING(7),
    BLOCKED_BY_ACCOUNT_MANAGER(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f164585a;

    oey(int i) {
        this.f164585a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f164585a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
