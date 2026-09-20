package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum lir0 implements od50 {
    PROCESSING_STATUS_UNSPECIFIED(0),
    INCORPORATED(1),
    PROCESSING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f133872a;

    lir0(int i) {
        this.f133872a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f133872a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
