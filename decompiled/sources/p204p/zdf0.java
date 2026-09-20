package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum zdf0 implements od50 {
    STATUS_UNSPECIFIED(0),
    STATUS_STARTED(1),
    STATUS_FINISHED(2),
    STATUS_FAILED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f281715a;

    zdf0(int i) {
        this.f281715a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f281715a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
