package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum c8q0 implements od50 {
    MULTIPLE_CHOICE(0),
    SINGLE_CHOICE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f35304a;

    c8q0(int i) {
        this.f35304a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f35304a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
