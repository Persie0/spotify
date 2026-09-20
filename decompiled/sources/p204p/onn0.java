package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum onn0 implements od50 {
    SUCCESS(0),
    UNKNOWN_ERROR(1),
    PADLOCK_ERROR(2),
    USERACCOUNT_ERROR(3),
    NO_USER_ID(4),
    NOT_ELIGIBLE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f167305a;

    onn0(int i) {
        this.f167305a = i;
    }

    /* JADX INFO: renamed from: a */
    public static onn0 m67418a(int i) {
        if (i == 0) {
            return SUCCESS;
        }
        if (i == 1) {
            return UNKNOWN_ERROR;
        }
        if (i == 2) {
            return PADLOCK_ERROR;
        }
        if (i == 3) {
            return USERACCOUNT_ERROR;
        }
        if (i == 4) {
            return NO_USER_ID;
        }
        if (i != 5) {
            return null;
        }
        return NOT_ELIGIBLE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f167305a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
