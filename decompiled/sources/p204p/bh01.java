package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum bh01 implements od50 {
    ROUND(0),
    SQUARE(1),
    NINE_TO_SIXTEEN(2),
    SIXTEEN_TO_NINE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f27050a;

    bh01(int i) {
        this.f27050a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f27050a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
