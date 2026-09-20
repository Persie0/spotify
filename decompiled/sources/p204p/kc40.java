package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum kc40 implements od50 {
    IMAGE_SHAPE_UNKNOWN(0),
    IMAGE_SHAPE_SQUARE(1),
    IMAGE_SHAPE_ROUND(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f121363a;

    kc40(int i) {
        this.f121363a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f121363a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
