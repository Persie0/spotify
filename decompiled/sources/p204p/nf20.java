package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum nf20 implements od50 {
    HEADER_ARTIST_ROLE_UNSPECIFIED(0),
    HEADER_ARTIST_ROLE_HEADLINER(1),
    HEADER_ARTIST_ROLE_SUPPORTING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f153231a;

    nf20(int i) {
        this.f153231a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f153231a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
