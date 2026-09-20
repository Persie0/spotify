package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum dq40 implements od50 {
    UNKNOWN(0),
    COPPA(1),
    NON(2),
    IMPLICIT(3),
    EXPLICIT(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f51813a;

    dq40(int i) {
        this.f51813a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f51813a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
