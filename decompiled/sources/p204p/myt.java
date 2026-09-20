package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum myt implements od50 {
    ELIGIBILITY_STATUS_UNSPECIFIED(0),
    ELIGIBILITY_STATUS_UNRESTRICTED(1),
    ELIGIBILITY_STATUS_HIDDEN(2),
    ELIGIBILITY_STATUS_DISABLED(3),
    ELIGIBILITY_STATUS_NEW_USER_ACCOUNT(4),
    ELIGIBILITY_STATUS_ALREADY_COMMENTED(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f148518a;

    myt(int i) {
        this.f148518a = i;
    }

    /* JADX INFO: renamed from: a */
    public static myt m63209a(int i) {
        if (i == 0) {
            return ELIGIBILITY_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return ELIGIBILITY_STATUS_UNRESTRICTED;
        }
        if (i == 2) {
            return ELIGIBILITY_STATUS_HIDDEN;
        }
        if (i == 3) {
            return ELIGIBILITY_STATUS_DISABLED;
        }
        if (i == 4) {
            return ELIGIBILITY_STATUS_NEW_USER_ACCOUNT;
        }
        if (i != 5) {
            return null;
        }
        return ELIGIBILITY_STATUS_ALREADY_COMMENTED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f148518a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
