package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum jfe0 implements od50 {
    MEMBER(0),
    MANAGER(1),
    KID(2),
    KID_V2(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f111888a;

    jfe0(int i) {
        this.f111888a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f111888a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
