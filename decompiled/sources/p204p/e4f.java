package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum e4f implements od50 {
    UNKNOWN(0),
    SCAN_PRESENT(1),
    SCAN_SKIPPED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f56080a;

    e4f(int i) {
        this.f56080a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f56080a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
