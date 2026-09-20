package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum ykw implements od50 {
    UNKNOWN(0),
    LOCAL_FILE(1),
    CACHE(2),
    NETWORK(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f273854a;

    ykw(int i) {
        this.f273854a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f273854a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
