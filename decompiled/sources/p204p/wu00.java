package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum wu00 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    CAPPED(1),
    ENTITLEMENT_MISSING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f255049a;

    wu00(int i) {
        this.f255049a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f255049a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
