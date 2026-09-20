package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum w4x0 implements od50 {
    NONE(0),
    IS_EXPLICIT(1),
    IS_19_PLUS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f247917a;

    w4x0(int i) {
        this.f247917a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f247917a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
