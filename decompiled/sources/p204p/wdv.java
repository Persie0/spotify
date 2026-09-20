package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum wdv implements od50 {
    NO_CAPPING(0),
    ABP(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f250342a;

    wdv(int i) {
        this.f250342a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f250342a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
