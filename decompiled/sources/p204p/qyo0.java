package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum qyo0 implements od50 {
    START(0),
    STOP(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f193955a;

    qyo0(int i) {
        this.f193955a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f193955a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
