package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ks01 implements od50 {
    UNSPECIFIED_TYPE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f125776a;

    ks01(int i) {
        this.f125776a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f125776a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
