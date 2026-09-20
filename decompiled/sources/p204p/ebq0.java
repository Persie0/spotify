package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum ebq0 implements od50 {
    SUCCESS(0),
    FAIL(1),
    INVALID_SLOT(2),
    INVALID_DEMAND_STATUS(3),
    INVALID_ELIGIBILITY_STATUS(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f58121a;

    ebq0(int i) {
        this.f58121a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f58121a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
