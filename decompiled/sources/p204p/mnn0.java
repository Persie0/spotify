package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum mnn0 implements od50 {
    UNKNOWN(0),
    BLOCKED(1),
    VIEWER(2),
    CONTRIBUTOR(3),
    MADE_FOR(4),
    ADMIN(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f145457a;

    mnn0(int i) {
        this.f145457a = i;
    }

    /* JADX INFO: renamed from: a */
    public static mnn0 m62359a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return BLOCKED;
        }
        if (i == 2) {
            return VIEWER;
        }
        if (i == 3) {
            return CONTRIBUTOR;
        }
        if (i == 4) {
            return MADE_FOR;
        }
        if (i != 5) {
            return null;
        }
        return ADMIN;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f145457a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
