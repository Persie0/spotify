package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum lrk implements od50 {
    COPYRIGHT_TYPE_UNSPECIFIED(0),
    COPYRIGHT_TYPE_P(1),
    COPYRIGHT_TYPE_C(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f136330a;

    lrk(int i) {
        this.f136330a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f136330a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
