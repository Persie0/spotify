package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum fty implements od50 {
    UNKNOWN(0),
    NETWORK(1),
    LOCALCACHE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f73350a;

    fty(int i) {
        this.f73350a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f73350a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
