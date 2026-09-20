package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum fub1 implements od50 {
    UNKNOWN(0),
    URL(1),
    MANIFEST_ID(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f73464a;

    fub1(int i) {
        this.f73464a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f73464a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
