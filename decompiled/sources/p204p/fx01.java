package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum fx01 implements od50 {
    UGC(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f74214a;

    fx01(int i) {
        this.f74214a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f74214a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
