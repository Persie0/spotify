package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum qgy implements od50 {
    FEATURED_CARD_MEDIA_TYPE_UNSPECIFIED(0),
    FEATURED_CARD_IMAGE(1),
    FEATURED_CARD_VIDEO(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f188584a;

    qgy(int i) {
        this.f188584a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f188584a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
