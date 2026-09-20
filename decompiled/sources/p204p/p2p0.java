package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum p2p0 implements od50 {
    NOT_ENHANCED(0),
    RECOMMENDATION(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f173381a;

    p2p0(int i) {
        this.f173381a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f173381a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
