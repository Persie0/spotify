package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum gmw implements od50 {
    DEFAULT(0),
    VIDEO(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f81492a;

    gmw(int i) {
        this.f81492a = i;
    }

    /* JADX INFO: renamed from: a */
    public static gmw m45283a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return VIDEO;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f81492a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
