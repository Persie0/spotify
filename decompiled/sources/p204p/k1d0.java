package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum k1d0 implements od50 {
    MASK_UNSPECIFIED(0),
    MASK_CIRCULAR(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f118293a;

    k1d0(int i) {
        this.f118293a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f118293a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
