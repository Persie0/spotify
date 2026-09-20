package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum r5f implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    IGNOREINRECS(4),
    /* JADX INFO: Fake field, exist only in values array */
    BANNED_ARTISTS(8),
    CONCERTS(10),
    PRERELEASE(12),
    MARKED_AS_FINISHED(13),
    NOT_INTERESTED(14),
    PAGE_MATCH(16),
    ISBN_SCAN(18),
    RATINGS(19),
    HOME_HIDES(20),
    /* JADX INFO: Fake field, exist only in values array */
    MVCDP_NOTIFICATIONS(21),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f196045a;

    r5f(int i) {
        this.f196045a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f196045a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
