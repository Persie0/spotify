package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum jfn0 implements od50 {
    TEXT_VARIANT_UNKNOWN(0),
    TEXT_VARIANT_BODY_MEDIUM(1),
    TEXT_VARIANT_MARGINAL(2),
    TEXT_VARIANT_BODY_SMALL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f111945a;

    jfn0(int i) {
        this.f111945a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f111945a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
