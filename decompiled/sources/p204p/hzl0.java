package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum hzl0 implements nd50 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f96977a;

    hzl0(int i) {
        this.f96977a = i;
    }

    /* JADX INFO: renamed from: a */
    public static hzl0 m49276a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    /* JADX INFO: renamed from: b */
    public final int m49277b() {
        if (this != UNRECOGNIZED) {
            return this.f96977a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
