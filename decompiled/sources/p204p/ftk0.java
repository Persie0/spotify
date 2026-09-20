package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum ftk0 implements od50 {
    UNKNOWN_VERSION(0),
    V1(1),
    V2(2),
    V3(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f73241a;

    ftk0(int i) {
        this.f73241a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f73241a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
