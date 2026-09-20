package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum eub1 implements od50 {
    UNKNOWN(0),
    URL(1),
    MANIFEST_ID(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f62941a;

    eub1(int i) {
        this.f62941a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f62941a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
