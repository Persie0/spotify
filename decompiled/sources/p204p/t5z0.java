package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum t5z0 implements od50 {
    FEED_SECTION_KIND_UNSPECIFIED(0),
    FEED_SECTION_KIND_GRID(1),
    FEED_SECTION_KIND_CAROUSEL(2),
    FEED_SECTION_KIND_LIST(3),
    FEED_SECTION_KIND_LIST_HERO(4),
    FEED_SECTION_KIND_LIST_WIDE(5),
    FEED_SECTION_KIND_LIST_DATE_LOCATION(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f217399a;

    t5z0(int i) {
        this.f217399a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f217399a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
