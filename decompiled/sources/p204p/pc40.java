package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum pc40 implements od50 {
    IMAGE_SIZE_UNSPECIFIED(0),
    IMAGE_SIZE_DEFAULT(1),
    IMAGE_SIZE_SMALL(2),
    IMAGE_SIZE_LARGE(3),
    IMAGE_SIZE_XLARGE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f175957a;

    pc40(int i) {
        this.f175957a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f175957a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
