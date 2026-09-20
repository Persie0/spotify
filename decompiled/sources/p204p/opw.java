package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum opw implements od50 {
    FETCH_TYPE_UNKNOWN(0),
    FETCH_TYPE_NETWORK(1),
    FETCH_TYPE_LOCAL_CACHE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f168035a;

    opw(int i) {
        this.f168035a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f168035a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
