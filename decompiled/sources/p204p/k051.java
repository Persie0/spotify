package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum k051 implements od50 {
    UNRECOGNISED(0),
    TIME_LISTENED_STAT(1),
    ARTIST_STAT(2),
    TRACK_STAT(3),
    SOCIAL_TIME_LISTENED_STAT(5),
    SOCIAL_ARTISTS_STAT(6),
    SOCIAL_TRACKS_STAT(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f117902a;

    k051(int i) {
        this.f117902a = i;
    }

    /* JADX INFO: renamed from: a */
    public static k051 m54930a(int i) {
        if (i == 0) {
            return UNRECOGNISED;
        }
        if (i == 1) {
            return TIME_LISTENED_STAT;
        }
        if (i == 2) {
            return ARTIST_STAT;
        }
        if (i == 3) {
            return TRACK_STAT;
        }
        if (i == 5) {
            return SOCIAL_TIME_LISTENED_STAT;
        }
        if (i == 6) {
            return SOCIAL_ARTISTS_STAT;
        }
        if (i != 7) {
            return null;
        }
        return SOCIAL_TRACKS_STAT;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f117902a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
