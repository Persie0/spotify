package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum noe1 implements od50 {
    UNKNOWN(0),
    NO(1),
    YES(2),
    DOWNLOADING(3),
    WAITING(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f156683a;

    noe1(int i) {
        this.f156683a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f156683a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
