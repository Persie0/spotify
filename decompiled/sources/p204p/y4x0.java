package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum y4x0 implements od50 {
    UNKNOWN_RESTRICTION(0),
    FILTER_EXPLICIT_CONTENT(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f269245a;

    y4x0(int i) {
        this.f269245a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f269245a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
