package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum bfn0 implements od50 {
    TRIAL(0),
    PREPAID(1),
    RECURRING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f26751a;

    bfn0(int i) {
        this.f26751a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f26751a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
