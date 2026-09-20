package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum o511 implements od50 {
    UNSPECIFIED_TYPE(0),
    SUMMARY(1),
    TOP_SONGS(2),
    TOP_ARTISTS(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f161846a;

    o511(int i) {
        this.f161846a = i;
    }

    /* JADX INFO: renamed from: a */
    public static o511 m66266a(int i) {
        if (i == 0) {
            return UNSPECIFIED_TYPE;
        }
        if (i == 1) {
            return SUMMARY;
        }
        if (i == 2) {
            return TOP_SONGS;
        }
        if (i != 3) {
            return null;
        }
        return TOP_ARTISTS;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f161846a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
