package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum lsj implements od50 {
    CONTENT_RATING_UNSPECIFIED(0),
    CONTENT_RATING_EXPLICIT(1),
    CONTENT_RATING_18_PLUS(2),
    CONTENT_RATING_SOUTH_KOREA_19(3),
    CONTENT_RATING_EROTICA(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f136562a;

    lsj(int i) {
        this.f136562a = i;
    }

    /* JADX INFO: renamed from: a */
    public static lsj m59838a(int i) {
        if (i == 0) {
            return CONTENT_RATING_UNSPECIFIED;
        }
        if (i == 1) {
            return CONTENT_RATING_EXPLICIT;
        }
        if (i == 2) {
            return CONTENT_RATING_18_PLUS;
        }
        if (i == 3) {
            return CONTENT_RATING_SOUTH_KOREA_19;
        }
        if (i != 4) {
            return null;
        }
        return CONTENT_RATING_EROTICA;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f136562a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
