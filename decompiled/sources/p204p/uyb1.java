package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum uyb1 implements od50 {
    THREE_BY_FOUR(0),
    NINE_BY_SIXTEEN(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f235231a;

    uyb1(int i) {
        this.f235231a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f235231a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
