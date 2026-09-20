package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum jb10 implements od50 {
    STATUS_UNKNOWN(0),
    STATUS_OPEN(1),
    STATUS_LOCKED(2),
    STATUS_EXPIRED(3),
    STATUS_COMPLETED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f110624a;

    jb10(int i) {
        this.f110624a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f110624a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
