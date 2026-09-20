package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum l301 implements od50 {
    SESSION_STATUS_UNSPECIFIED(0),
    SESSION_STATUS_PENDING(1),
    SESSION_STATUS_COMPLETE(2),
    SESSION_STATUS_TERMINATED(3),
    SESSION_STATUS_REDEEMED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f129174a;

    l301(int i) {
        this.f129174a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f129174a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
