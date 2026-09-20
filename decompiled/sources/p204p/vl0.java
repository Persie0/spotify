package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum vl0 implements od50 {
    CLIENT_PRODUCED(0),
    INFERRED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f242335a;

    vl0(int i) {
        this.f242335a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f242335a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
