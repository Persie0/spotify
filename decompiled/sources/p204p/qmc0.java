package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum qmc0 implements od50 {
    PLAYED(0),
    UNPLAYED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f190198a;

    qmc0(int i) {
        this.f190198a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f190198a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
