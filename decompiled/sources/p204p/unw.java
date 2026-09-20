package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum unw implements od50 {
    FORCED_OFFLINE(0),
    NO_INTERNET(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f232274a;

    unw(int i) {
        this.f232274a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f232274a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
