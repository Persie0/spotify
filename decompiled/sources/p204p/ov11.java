package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum ov11 implements od50 {
    SHUFFLE_MODE_UNSPECIFIED(0),
    SHUFFLE_MODE_ON(1),
    SHUFFLE_MODE_OFF(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f170400a;

    ov11(int i) {
        this.f170400a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f170400a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
