package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum bkw implements od50 {
    LONG(0),
    SHORT(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f28033a;

    bkw(int i) {
        this.f28033a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f28033a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
