package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum nqb0 implements od50 {
    NONE(0),
    UNCAPPED(1),
    CAPPED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f157221a;

    nqb0(int i) {
        this.f157221a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f157221a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
