package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum hs51 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_PROVIDER_UNKNOWN(0),
    BILLING_PROVIDER_GPB(1),
    BILLING_PROVIDER_SPOTIFY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f94614a;

    hs51(int i) {
        this.f94614a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f94614a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
