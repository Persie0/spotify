package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum ew2 implements od50 {
    UNKNOWN(0),
    PRERELEASE(1),
    LIVE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f63396a;

    ew2(int i) {
        this.f63396a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f63396a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
