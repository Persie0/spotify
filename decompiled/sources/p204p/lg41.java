package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum lg41 implements od50 {
    SPOTLIGHT_TYPE_UNSPECIFIED(0),
    SPOTLIGHT_TYPE_TOP_ARTIST(1),
    SPOTLIGHT_TYPE_TOP_SONG(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f133079a;

    lg41(int i) {
        this.f133079a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f133079a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
