package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum myw0 implements od50 {
    RESOLUTION_FAILURE_REASON_UNSPECIFIED(0),
    RESOLUTION_FAILURE_REASON_ELIGIBILITY_TIMEOUT(1),
    RESOLUTION_FAILURE_REASON_CONTENT_RESOLUTION_FAILED(2),
    RESOLUTION_FAILURE_REASON_INTERNAL_ERROR(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f148547a;

    myw0(int i) {
        this.f148547a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f148547a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
