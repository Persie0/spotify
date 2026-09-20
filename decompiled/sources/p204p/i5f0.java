package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum i5f0 implements od50 {
    ARTIST_ROLE_UNKNOWN(0),
    ARTIST_ROLE_MAIN_ARTIST(1),
    ARTIST_ROLE_FEATURED_ARTIST(2),
    ARTIST_ROLE_REMIXER(3),
    ARTIST_ROLE_ACTOR(4),
    ARTIST_ROLE_COMPOSER(5),
    ARTIST_ROLE_CONDUCTOR(6),
    ARTIST_ROLE_ORCHESTRA(7);


    /* JADX INFO: renamed from: a */
    public final int f98950a;

    i5f0(int i) {
        this.f98950a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f98950a;
    }
}
