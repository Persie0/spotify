package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum oq6 implements od50 {
    KIND_UNSPECIFIED(0),
    KIND_URI(1),
    KIND_NAME(3),
    KIND_DESCRIPTION(4),
    KIND_UPDATED_AT(5),
    KIND_ADDED_BY_USERNAME(6),
    KIND_OWNER_USERNAME(7),
    KIND_CREATED_AT(8),
    KIND_CAPABILITIES(9),
    KIND_GEOBLOCK(10),
    KIND_SEEN_AT(11),
    KIND_ABUSE_REPORTING_ENABLED(12),
    KIND_APPROXIMATE_LENGTH(13),
    KIND_AVAILABLE_SIGNALS(14),
    KIND_PUBLISHED_TO_PROFILE(15),
    KIND_RECOMMENDATION_INFO(16),
    KIND_AI_CURATION(17),
    KIND_ADDED_AT(18),
    KIND_DELETED_BY_OWNER(19),
    KIND_PICTURE_FILE_ID(20),
    KIND_PICTURE_SIZES(21),
    KIND_CLIENT_ID(22),
    KIND_FORMAT(23),
    KIND_FORMAT_LIST_ATTRIBUTES(24),
    KIND_ITEM_ID_ALGORITHM(25),
    KIND_RECOVERABLE(26),
    KIND_SOURCE_LENS(27),
    KIND_SAVE_SOURCE(28);


    /* JADX INFO: renamed from: a */
    public final int f168123a;

    oq6(int i) {
        this.f168123a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f168123a;
    }
}
