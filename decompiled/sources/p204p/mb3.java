package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum mb3 implements od50 {
    ALIGNMENT_UNKNOWN(0),
    CENTER(1),
    LEADING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f141774a;

    mb3(int i) {
        this.f141774a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f141774a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
