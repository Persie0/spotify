package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum q5u0 implements od50 {
    RANK_DIRECTION_SAME(0),
    RANK_DIRECTION_UP(1),
    RANK_DIRECTION_DOWN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f185612a;

    q5u0(int i) {
        this.f185612a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f185612a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
