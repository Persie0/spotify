package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum dfj implements od50 {
    CONTENT_ALIGNMENT_UNKNOWN(0),
    CONTENT_ALIGNMENT_CENTER(1),
    CONTENT_ALIGNMENT_BOTTOM(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f48614a;

    dfj(int i) {
        this.f48614a = i;
    }

    /* JADX INFO: renamed from: a */
    public static dfj m35897a(int i) {
        if (i == 0) {
            return CONTENT_ALIGNMENT_UNKNOWN;
        }
        if (i == 1) {
            return CONTENT_ALIGNMENT_CENTER;
        }
        if (i != 2) {
            return null;
        }
        return CONTENT_ALIGNMENT_BOTTOM;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f48614a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
