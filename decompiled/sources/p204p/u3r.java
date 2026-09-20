package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum u3r implements od50 {
    DETAILS_TYPE_UNSPECIFIED(0),
    DETAILS_TYPE_LISTENING_MINUTES(1),
    DETAILS_TYPE_TRACKS(2),
    DETAILS_TYPE_ARTISTS(3),
    DETAILS_TYPE_SOCIAL_MINUTES_LISTENED(5),
    DETAILS_TYPE_SOCIAL_ARTISTS(6),
    DETAILS_TYPE_SOCIAL_TRACKS(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f226432a;

    u3r(int i) {
        this.f226432a = i;
    }

    /* JADX INFO: renamed from: a */
    public static u3r m82306a(int i) {
        if (i == 0) {
            return DETAILS_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DETAILS_TYPE_LISTENING_MINUTES;
        }
        if (i == 2) {
            return DETAILS_TYPE_TRACKS;
        }
        if (i == 3) {
            return DETAILS_TYPE_ARTISTS;
        }
        if (i == 5) {
            return DETAILS_TYPE_SOCIAL_MINUTES_LISTENED;
        }
        if (i == 6) {
            return DETAILS_TYPE_SOCIAL_ARTISTS;
        }
        if (i != 7) {
            return null;
        }
        return DETAILS_TYPE_SOCIAL_TRACKS;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f226432a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
