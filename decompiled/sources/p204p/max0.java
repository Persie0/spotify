package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum max0 implements od50 {
    RESPONSE_RESULT_UNSPECIFIED(0),
    RESPONSE_RESULT_SUCCESS(1),
    RESPONSE_RESULT_NO_ITEMS_IN_REQUEST(2),
    RESPONSE_RESULT_INVALID_ITEM_IN_REQUEST(3),
    RESPONSE_RESULT_INVALID_FILTER_IN_REQUEST(4),
    RESPONSE_RESULT_PAGE_IDENTIFIER_TOO_LONG(5),
    RESPONSE_RESULT_PAGE_IDENTIFIER_EMPTY(6),
    RESPONSE_RESULT_USE_CASE_IDENTIFIER_TOO_LONG(7),
    RESPONSE_RESULT_USE_CASE_IDENTIFIER_EMPTY(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f141717a;

    max0(int i) {
        this.f141717a = i;
    }

    /* JADX INFO: renamed from: a */
    public static max0 m61333a(int i) {
        switch (i) {
            case 0:
                return RESPONSE_RESULT_UNSPECIFIED;
            case 1:
                return RESPONSE_RESULT_SUCCESS;
            case 2:
                return RESPONSE_RESULT_NO_ITEMS_IN_REQUEST;
            case 3:
                return RESPONSE_RESULT_INVALID_ITEM_IN_REQUEST;
            case 4:
                return RESPONSE_RESULT_INVALID_FILTER_IN_REQUEST;
            case 5:
                return RESPONSE_RESULT_PAGE_IDENTIFIER_TOO_LONG;
            case 6:
                return RESPONSE_RESULT_PAGE_IDENTIFIER_EMPTY;
            case 7:
                return RESPONSE_RESULT_USE_CASE_IDENTIFIER_TOO_LONG;
            case 8:
                return RESPONSE_RESULT_USE_CASE_IDENTIFIER_EMPTY;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f141717a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
