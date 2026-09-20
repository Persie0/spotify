package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum f000 implements od50 {
    BODY_MEDIUM(0),
    BODY_MEDIUM_BOLD(1),
    TITLE_LARGE(2),
    HEADLINE_MEDIUM_BLACK_WIDE(3),
    HEADLINE_MEDIUM_MEDIUM_WIDE(4),
    TITLE_LARGE_BLACK_WIDE(5),
    TITLE_LARGE_MEDIUM_WIDE(6),
    TITLE_SMALL_MEDIUM_WIDE(7),
    TITLE_SMALL_BLACK_WIDE(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f64522a;

    f000(int i) {
        this.f64522a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f64522a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
