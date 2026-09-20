package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum rc40 implements od50 {
    IMAGE_SIZE_UNSPECIFIED(0),
    IMAGE_SIZE_SMALL(1),
    IMAGE_SIZE_DEFAULT(2),
    IMAGE_SIZE_LARGE(3),
    IMAGE_SIZE_XLARGE(4),
    IMAGE_SIZE_XXLARGE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f197730a;

    rc40(int i) {
        this.f197730a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f197730a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
