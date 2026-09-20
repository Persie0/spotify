package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum ew00 implements od50 {
    DENY_REASON_UNSPECIFIED(0),
    DENY_REASON_ENTITLEMENT_MISSING(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f63386a;

    ew00(int i) {
        this.f63386a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f63386a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
