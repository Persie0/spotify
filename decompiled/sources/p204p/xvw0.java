package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum xvw0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_STATUS_RESULT_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_STATUS_RESULT_CAN_REQUEST(1),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_STATUS_RESULT_PENDING(2),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_STATUS_RESULT_DAILY_LIMIT_REACHED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f266530a;

    xvw0(int i) {
        this.f266530a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f266530a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
