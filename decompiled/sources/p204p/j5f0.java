package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum j5f0 implements od50 {
    ARTIST_ROLE_UNKNOWN(0),
    ARTIST_ROLE_MAIN_ARTIST(1),
    ARTIST_ROLE_FEATURED_ARTIST(2),
    ARTIST_ROLE_REMIXER(3),
    ARTIST_ROLE_ACTOR(4),
    ARTIST_ROLE_COMPOSER(5),
    ARTIST_ROLE_CONDUCTOR(6),
    ARTIST_ROLE_ORCHESTRA(7);


    /* JADX INFO: renamed from: a */
    public final int f108961a;

    j5f0(int i) {
        this.f108961a = i;
    }

    /* JADX INFO: renamed from: a */
    public static j5f0 m52456a(int i) {
        switch (i) {
            case 0:
                return ARTIST_ROLE_UNKNOWN;
            case 1:
                return ARTIST_ROLE_MAIN_ARTIST;
            case 2:
                return ARTIST_ROLE_FEATURED_ARTIST;
            case 3:
                return ARTIST_ROLE_REMIXER;
            case 4:
                return ARTIST_ROLE_ACTOR;
            case 5:
                return ARTIST_ROLE_COMPOSER;
            case 6:
                return ARTIST_ROLE_CONDUCTOR;
            case 7:
                return ARTIST_ROLE_ORCHESTRA;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f108961a;
    }
}
