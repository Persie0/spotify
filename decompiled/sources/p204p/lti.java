package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum lti implements od50 {
    UNKNOWN_ERROR(0),
    TIMEOUT(1),
    INTERNAL(2),
    GROUP_DEVICE_NOT_FOUND(3),
    TARGET_NOT_FOUND(4),
    NOT_IMPLEMENTED(5),
    BUSY(12),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f136802a;

    lti(int i) {
        this.f136802a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f136802a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
