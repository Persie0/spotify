package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum z4j implements od50 {
    CONSENT_STATE_UNSPECIFIED(0),
    ELIGIBLE_NOT_GRANTED(1),
    INELIGIBLE(2),
    GRANTED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f279253a;

    z4j(int i) {
        this.f279253a = i;
    }

    /* JADX INFO: renamed from: a */
    public static z4j m95346a(int i) {
        if (i == 0) {
            return CONSENT_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return ELIGIBLE_NOT_GRANTED;
        }
        if (i == 2) {
            return INELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return GRANTED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f279253a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
