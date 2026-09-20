package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum m7u0 implements od50 {
    CONTENT_RATING_TAG_UNSPECIFIED(0),
    CONTENT_RATING_TAG_EXPLICIT(1),
    CONTENT_RATING_TAG_MOGEF_19(2),
    CONTENT_RATING_TAG_SPOTIFY_18_PLUS(3),
    CONTENT_RATING_TAG_EROTIC(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f140842a;

    m7u0(int i) {
        this.f140842a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f140842a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
