package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum kc2 implements od50 {
    AGE_RATING_UNSPECIFIED(0),
    AGE_RATING_Y(1),
    AGE_RATING_G(2),
    AGE_RATING_PG(3),
    AGE_RATING_PG13(4),
    AGE_RATING_R(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f121345a;

    kc2(int i) {
        this.f121345a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f121345a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
