package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum jo80 implements od50 {
    LIST_UNKNOWN(0),
    LIST_NAME(1),
    LIST_DESCRIPTION(2),
    LIST_PICTURE(3),
    LIST_COLLABORATIVE(4),
    LIST_PL3_VERSION(5),
    LIST_DELETED_BY_OWNER(6),
    LIST_CLIENT_ID(10),
    LIST_FORMAT(11),
    LIST_FORMAT_ATTRIBUTES(12),
    LIST_PICTURE_SIZE(13),
    LIST_SEQUENCE_CONTEXT_TEMPLATE(14),
    LIST_AI_CURATION_REFERENCE_ID(15),
    LIST_ITEM_ID_ALGORITHM(16),
    LIST_RECOVERABLE(17),
    LIST_IS_USER_CREATED(18),
    LIST_SORT_MANIFEST(20);


    /* JADX INFO: renamed from: a */
    public final int f114372a;

    jo80(int i) {
        this.f114372a = i;
    }

    /* JADX INFO: renamed from: a */
    public static jo80 m53866a(int i) {
        switch (i) {
            case 0:
                return LIST_UNKNOWN;
            case 1:
                return LIST_NAME;
            case 2:
                return LIST_DESCRIPTION;
            case 3:
                return LIST_PICTURE;
            case 4:
                return LIST_COLLABORATIVE;
            case 5:
                return LIST_PL3_VERSION;
            case 6:
                return LIST_DELETED_BY_OWNER;
            case 7:
            case 8:
            case 9:
            case 19:
            default:
                return null;
            case 10:
                return LIST_CLIENT_ID;
            case 11:
                return LIST_FORMAT;
            case 12:
                return LIST_FORMAT_ATTRIBUTES;
            case 13:
                return LIST_PICTURE_SIZE;
            case 14:
                return LIST_SEQUENCE_CONTEXT_TEMPLATE;
            case 15:
                return LIST_AI_CURATION_REFERENCE_ID;
            case 16:
                return LIST_ITEM_ID_ALGORITHM;
            case 17:
                return LIST_RECOVERABLE;
            case 18:
                return LIST_IS_USER_CREATED;
            case 20:
                return LIST_SORT_MANIFEST;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f114372a;
    }
}
