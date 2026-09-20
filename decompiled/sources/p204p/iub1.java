package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum iub1 implements od50 {
    URL(0),
    MANIFEST_ID(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f105931a;

    iub1(int i) {
        this.f105931a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f105931a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
