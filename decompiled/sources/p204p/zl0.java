package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum zl0 implements od50 {
    PRECISION_UNKNOWN(0),
    PRECISION_LOW(1),
    PRECISION_HIGH(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f283881a;

    zl0(int i) {
        this.f283881a = i;
    }

    /* JADX INFO: renamed from: a */
    public static zl0 m96348a(int i) {
        if (i == 0) {
            return PRECISION_UNKNOWN;
        }
        if (i == 1) {
            return PRECISION_LOW;
        }
        if (i != 2) {
            return null;
        }
        return PRECISION_HIGH;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f283881a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
