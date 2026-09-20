package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum mkw implements od50 {
    INTERACTIVE(0),
    PREFETCH(1),
    OTHER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f144703a;

    mkw(int i) {
        this.f144703a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f144703a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
