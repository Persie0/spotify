package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum v4x0 implements od50 {
    NONE(0),
    IS_EXPLICIT(1),
    IS_19_PLUS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f237263a;

    v4x0(int i) {
        this.f237263a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f237263a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
