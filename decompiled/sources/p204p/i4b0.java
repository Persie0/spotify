package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum i4b0 implements od50 {
    UNSPECIFIED(0),
    ARTWORK(1),
    FULL_SCREEN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f98481a;

    i4b0(int i) {
        this.f98481a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f98481a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
