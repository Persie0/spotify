package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum sof implements od50 {
    NO_QUOTA_DATA(0),
    HAS_REMAINING_QUOTA(1),
    QUOTA_FULLY_CONSUMED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f211184a;

    sof(int i) {
        this.f211184a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f211184a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
