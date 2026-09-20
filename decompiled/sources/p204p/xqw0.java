package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum xqw0 implements od50 {
    ANSWER_STATE_UNSPECIFIED(0),
    CORRECT(1),
    WRONG(2),
    TIME_RAN_OUT(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f265134a;

    xqw0(int i) {
        this.f265134a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f265134a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
