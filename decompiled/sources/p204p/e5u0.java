package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum e5u0 implements od50 {
    UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    MONTH(3),
    YEAR(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f56476a;

    e5u0(int i) {
        this.f56476a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f56476a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
