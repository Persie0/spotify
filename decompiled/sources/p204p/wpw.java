package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum wpw implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    kSuccess(0),
    kWsUpgradeUnauthorized(1),
    kTransportFailure(2),
    /* JADX INFO: Fake field, exist only in values array */
    kInvalidUri(3),
    /* JADX INFO: Fake field, exist only in values array */
    kSslCacertBadfile(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f253853a;

    wpw(int i) {
        this.f253853a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f253853a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
