package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum npw implements od50 {
    FAILURE_REASON_UNSPECIFIED(0),
    FAILURE_REASON_TRANSPORT_ERROR(1),
    FAILURE_REASON_TIMEOUT(2),
    FAILURE_REASON_CANCELLED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f157085a;

    npw(int i) {
        this.f157085a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f157085a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
