package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum k0w0 implements od50 {
    RELATIONSHIP_TYPE_UNSPECIFIED(0),
    REMIX(1),
    EXTENDED(2),
    COVER(3),
    LIVE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f118163a;

    k0w0(int i) {
        this.f118163a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f118163a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
