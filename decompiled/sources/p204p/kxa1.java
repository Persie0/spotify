package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum kxa1 implements od50 {
    USER_STATUS_UNSPECIFIED(0),
    USER_STATUS_ACTIVE(1),
    USER_STATUS_SUGGESTED_BUT_DISABLED(2),
    USER_STATUS_SUGGESTED(3),
    USER_STATUS_NOT_ACCEPTED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f127388a;

    kxa1(int i) {
        this.f127388a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f127388a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
