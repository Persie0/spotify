package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum bh30 implements od50 {
    READINESS_UNSPECIFIED(0),
    READY(1),
    NOT_READY(2),
    FAILED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f27073a;

    bh30(int i) {
        this.f27073a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f27073a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
