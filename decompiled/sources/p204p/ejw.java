package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum ejw implements od50 {
    UNKNOWN(0),
    GOOD(1),
    POOR(3),
    ABSENT(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f60311a;

    ejw(int i) {
        this.f60311a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ejw m39240a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return GOOD;
        }
        if (i == 3) {
            return POOR;
        }
        if (i != 4) {
            return null;
        }
        return ABSENT;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f60311a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
