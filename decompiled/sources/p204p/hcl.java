package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum hcl implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_REQUEST_RESULT_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_REQUEST_RESULT_CREATED(1),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_REQUEST_RESULT_ALREADY_PENDING(2),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_REQUEST_RESULT_BLOCKED(3),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_REQUEST_RESULT_DAILY_LIMIT_REACHED(4),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_REQUEST_RESULT_ALREADY_ALLOWED(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f89832a;

    hcl(int i) {
        this.f89832a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f89832a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
