package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum nyw0 implements od50 {
    RESOLUTION_METHOD_UNSPECIFIED(0),
    RESOLUTION_METHOD_STORE(1),
    RESOLUTION_METHOD_IP_ADDRESS(2),
    RESOLUTION_METHOD_DEFAULT(3),
    RESOLUTION_METHOD_UNRESOLVED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f159950a;

    nyw0(int i) {
        this.f159950a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f159950a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
