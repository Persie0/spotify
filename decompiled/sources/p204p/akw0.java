package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum akw0 implements od50 {
    UNKNOWN_RENDERING(0),
    CAROUSEL(1),
    LIST(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f16673a;

    akw0(int i) {
        this.f16673a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16673a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
