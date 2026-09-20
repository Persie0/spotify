package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum qtx0 implements od50 {
    UNRECOGNIZED_STATUS(0),
    NOT_RSVPED(1),
    RSVPED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f192504a;

    qtx0(int i) {
        this.f192504a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f192504a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
