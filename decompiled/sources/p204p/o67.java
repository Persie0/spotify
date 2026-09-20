package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum o67 implements od50 {
    SIXTEEN_BITS_PER_SAMPLE(0),
    /* JADX INFO: Fake field, exist only in values array */
    IEEE_FLOAT(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f162264a;

    o67(int i) {
        this.f162264a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f162264a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
