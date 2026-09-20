package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum z8t0 implements od50 {
    UNKNOWN(0),
    USER_INITIATED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f280564a;

    z8t0(int i) {
        this.f280564a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f280564a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
