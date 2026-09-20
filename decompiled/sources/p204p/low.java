package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum low implements od50 {
    BACKEND_RPC(0),
    /* JADX INFO: Fake field, exist only in values array */
    BACKEND_STREAMING(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f135557a;

    low(int i) {
        this.f135557a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f135557a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
