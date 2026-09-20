package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum j9z0 implements od50 {
    SECTION_TYPE_UNKNOWN(0),
    SECTION_TYPE_VIDEO_CAROUSEL(1),
    SECTION_TYPE_GENERIC(2),
    SECTION_TYPE_DISCOVERY_FEED(3),
    SECTION_TYPE_CROSSWORD(4),
    SECTION_TYPE_INSTANT_MIX(5),
    SECTION_TYPE_DIVIDER(6),
    SECTION_TYPE_AGENT(7),
    SECTION_TYPE_RELATED_SEARCHES(8),
    SECTION_TYPE_CROSS_CONTENT_RELATED(9),
    SECTION_TYPE_START_A_CHAT(10),
    SECTION_TYPE_TRACK_VERSIONS(11),
    SECTION_TYPE_SEARCH_OVERVIEW_PLACEHOLDER(12),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f110285a;

    j9z0(int i) {
        this.f110285a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f110285a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
