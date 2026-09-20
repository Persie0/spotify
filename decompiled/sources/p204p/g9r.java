package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum g9r implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    STATUS_UNKNOWN(0),
    STATUS_SUCCESS(1),
    STATUS_PERMISSION_UNAVAILABLE(2),
    STATUS_TIMEOUT(3),
    STATUS_FAILED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f77866a;

    g9r(int i) {
        this.f77866a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f77866a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
