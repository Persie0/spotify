package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum vqq0 implements od50 {
    DAY(0),
    WEEK(1),
    MONTH(2),
    YEAR(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f243988a;

    vqq0(int i) {
        this.f243988a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f243988a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
