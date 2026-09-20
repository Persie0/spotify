package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum pr11 implements od50 {
    UNKNOWN(0),
    TRAILER(1),
    CONTINUE_LISTENING(2),
    LATEST_PUBLISHED(3),
    UP_NEXT(4),
    FIRST_PUBLISHED(5);


    /* JADX INFO: renamed from: a */
    public final int f180475a;

    pr11(int i) {
        this.f180475a = i;
    }

    /* JADX INFO: renamed from: a */
    public static pr11 m70698a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return TRAILER;
        }
        if (i == 2) {
            return CONTINUE_LISTENING;
        }
        if (i == 3) {
            return LATEST_PUBLISHED;
        }
        if (i == 4) {
            return UP_NEXT;
        }
        if (i != 5) {
            return null;
        }
        return FIRST_PUBLISHED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f180475a;
    }
}
