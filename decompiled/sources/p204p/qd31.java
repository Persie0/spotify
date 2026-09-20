package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum qd31 implements od50 {
    SOCIAL_DATA_TYPE_UNSPECIFIED(0),
    SOCIAL_DATA_TYPE_REAL(1),
    SOCIAL_DATA_TYPE_PLACEHOLDER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f187474a;

    qd31(int i) {
        this.f187474a = i;
    }

    /* JADX INFO: renamed from: a */
    public static qd31 m72579a(int i) {
        if (i == 0) {
            return SOCIAL_DATA_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return SOCIAL_DATA_TYPE_REAL;
        }
        if (i != 2) {
            return null;
        }
        return SOCIAL_DATA_TYPE_PLACEHOLDER;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f187474a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
