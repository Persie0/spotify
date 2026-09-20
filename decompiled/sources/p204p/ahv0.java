package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum ahv0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    PICK(1),
    SKIP(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f15785a;

    ahv0(int i) {
        this.f15785a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f15785a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
