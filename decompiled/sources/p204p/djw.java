package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum djw implements od50 {
    OS_INTERNET_VALIDATION_UNKNOWN(0),
    OS_INTERNET_VALIDATED(1),
    OS_INTERNET_NOT_VALIDATED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f49759a;

    djw(int i) {
        this.f49759a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f49759a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
