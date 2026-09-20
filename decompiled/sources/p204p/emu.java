package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum emu implements od50 {
    UNKNOWN_FONT(0),
    HEADLINE_LARGE(1),
    HEADLINE_MEDIUM(2),
    TITLE_LARGE(3),
    TITLE_MEDIUM(4),
    TITLE_SMALL(5),
    BODY_MEDIUM(6),
    BODY_MEDIUM_BOLD(7),
    BODY_SMALL(8),
    BODY_SMALL_BOLD(9),
    MARGINAL(10),
    MARGINAL_BOLD(11),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f60996a;

    emu(int i) {
        this.f60996a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f60996a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
