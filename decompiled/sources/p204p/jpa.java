package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum jpa implements od50 {
    UNSPECIFIED(0),
    XL(1),
    L(2),
    M(3),
    S(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f114595a;

    jpa(int i) {
        this.f114595a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f114595a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
