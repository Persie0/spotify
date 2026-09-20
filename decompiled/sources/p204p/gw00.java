package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum gw00 implements od50 {
    GATING_INDICATOR_UNSPECIFIED(0),
    GATING_INDICATOR_PREMIUM(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f84869a;

    gw00(int i) {
        this.f84869a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f84869a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
