package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum eqq implements od50 {
    DENIAL_REASON_UNSPECIFIED(0),
    DENIAL_REASON_MAX_CHILDREN_REACHED(1),
    DENIAL_REASON_PARENTAL_AGE_LOW(2),
    DENIAL_REASON_NOT_ALLOWED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f61939a;

    eqq(int i) {
        this.f61939a = i;
    }

    /* JADX INFO: renamed from: a */
    public static eqq m39736a(int i) {
        if (i == 0) {
            return DENIAL_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return DENIAL_REASON_MAX_CHILDREN_REACHED;
        }
        if (i == 2) {
            return DENIAL_REASON_PARENTAL_AGE_LOW;
        }
        if (i != 3) {
            return null;
        }
        return DENIAL_REASON_NOT_ALLOWED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f61939a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
