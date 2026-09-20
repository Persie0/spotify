package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum rs8 implements od50 {
    BAN_STATUS_UNSPECIFIED(0),
    BAN_STATUS_DEFAULT(1),
    BAN_STATUS_BANNED(2),
    BAN_STATUS_ALLOWED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f202223a;

    rs8(int i) {
        this.f202223a = i;
    }

    /* JADX INFO: renamed from: a */
    public static rs8 m76314a(int i) {
        if (i == 0) {
            return BAN_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return BAN_STATUS_DEFAULT;
        }
        if (i == 2) {
            return BAN_STATUS_BANNED;
        }
        if (i != 3) {
            return null;
        }
        return BAN_STATUS_ALLOWED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f202223a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
