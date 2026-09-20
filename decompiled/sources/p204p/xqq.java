package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum xqq implements od50 {
    UNDEFINED(0),
    SPARSE(1),
    NORMAL(2),
    DENSE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f265084a;

    xqq(int i) {
        this.f265084a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f265084a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
