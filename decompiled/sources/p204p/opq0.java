package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum opq0 implements od50 {
    UNKNOWN(0),
    RECURRING_MONTHLY(1),
    TRIAL(2),
    PREPAID(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f167996a;

    opq0(int i) {
        this.f167996a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f167996a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
