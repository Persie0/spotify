package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum x4x0 implements od50 {
    NONE(0),
    IS_EXPLICIT(1),
    IS_19_PLUS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f258215a;

    x4x0(int i) {
        this.f258215a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f258215a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
