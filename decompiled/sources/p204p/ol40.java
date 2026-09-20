package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum ol40 implements od50 {
    INACCESSIBLE_REASON_UNSPECIFIED(0),
    REQUIRES_PREMIUM(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f166758a;

    ol40(int i) {
        this.f166758a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f166758a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
