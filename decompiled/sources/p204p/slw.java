package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum slw implements od50 {
    UNMETERED(0),
    CELLULAR(1),
    EXPENSIVE(2),
    CONSTRAINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f210504a;

    slw(int i) {
        this.f210504a = i;
    }

    /* JADX INFO: renamed from: a */
    public static slw m78506a(int i) {
        if (i == 0) {
            return UNMETERED;
        }
        if (i == 1) {
            return CELLULAR;
        }
        if (i == 2) {
            return EXPENSIVE;
        }
        if (i != 3) {
            return null;
        }
        return CONSTRAINED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f210504a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
