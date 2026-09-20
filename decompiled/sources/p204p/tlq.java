package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum tlq implements od50 {
    REASON_UNSPECIFIED(0),
    CAPPED(1),
    ENTITLEMENT_MISSING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f221510a;

    tlq(int i) {
        this.f221510a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221510a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
