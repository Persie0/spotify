package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum yr41 implements od50 {
    STARTED(0),
    NOT_STARTED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f275393a;

    yr41(int i) {
        this.f275393a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f275393a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
