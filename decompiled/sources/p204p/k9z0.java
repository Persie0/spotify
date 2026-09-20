package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum k9z0 implements od50 {
    SECTION_TYPE_DEFAULT(0),
    SECTION_TYPE_SHELF(1),
    SECTION_TYPE_CATEGORIES(2),
    SECTION_TYPE_WATCH_FEED(3),
    SECTION_TYPE_VIDEO_RECOMMENDATIONS(4),
    SECTION_TYPE_SEE_OTHER(5),
    SECTION_TYPE_SINGLE_CONTENT_COMPONENT(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f120733a;

    k9z0(int i) {
        this.f120733a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f120733a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
