package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum c321 implements od50 {
    UNSPECIFIED_TYPE(0),
    LOCAL(1),
    GLOBAL(2),
    CHART(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f33534a;

    c321(int i) {
        this.f33534a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f33534a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
