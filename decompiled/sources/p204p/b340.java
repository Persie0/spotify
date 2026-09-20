package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum b340 implements od50 {
    SIZE_UNKNOWN(0),
    SIZE_DEFAULT(1),
    SIZE_SMALL(2),
    SIZE_LARGE(3),
    SIZE_XLARGE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f22889a;

    b340(int i) {
        this.f22889a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f22889a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
