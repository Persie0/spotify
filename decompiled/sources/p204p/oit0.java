package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum oit0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIPTION_STATUS_NONE(0),
    SUBSCRIPTION_STATUS_PAYWALLED(1),
    SUBSCRIPTION_STATUS_AVAILABLE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f165893a;

    oit0(int i) {
        this.f165893a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f165893a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
