package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum dcs0 implements od50 {
    PROMOTION_V1(0),
    SPOTLIGHT(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f47638a;

    dcs0(int i) {
        this.f47638a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47638a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
