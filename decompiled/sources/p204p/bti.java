package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum bti implements od50 {
    UNKNOWN_GROUPING_STATUS(0),
    GROUPED(1),
    GROUPABLE(2),
    GROUPING(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f30875a;

    bti(int i) {
        this.f30875a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f30875a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
