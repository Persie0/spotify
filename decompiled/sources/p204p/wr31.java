package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public enum wr31 {
    RECENTLY_UPDATED("recently_updated"),
    RECENTLY_ADDED("recently_added"),
    ALPHABETICAL("alphabetical"),
    CREATOR("creator"),
    CUSTOM("custom"),
    RECENTLY_PLAYED_OR_ADDED("recently_played_or_added"),
    AUTHOR("author"),
    RELEVANCE("relevance"),
    DATE("event_start_time"),
    RELEASE_DATE("release_date");


    /* JADX INFO: renamed from: a */
    public final String f254264a;

    /* JADX INFO: renamed from: b */
    public static final wr31 f254255b = RECENTLY_PLAYED_OR_ADDED;

    wr31(String str) {
        this.f254264a = str;
    }

    /* JADX INFO: renamed from: a */
    public final cse1 m88798a() {
        int iOrdinal = ordinal();
        cse1 cse1Var = cse1.f41528a;
        switch (iOrdinal) {
            case 0:
                return cse1.f41532e;
            case 1:
                return cse1.f41530c;
            case 2:
                return cse1.f41529b;
            case 3:
                return cse1Var;
            case 4:
                return cse1.f41531d;
            case 5:
                return cse1.f41533f;
            case 6:
                return cse1Var;
            case 7:
                return cse1.f41534g;
            case 8:
                return cse1.f41535h;
            case 9:
                return cse1.f41536i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
