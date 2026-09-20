package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ckc implements od50 {
    NONE(0),
    UP(1),
    DOWN(2),
    NEW(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f38915a;

    ckc(int i) {
        this.f38915a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ckc m33113a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return UP;
        }
        if (i == 2) {
            return DOWN;
        }
        if (i != 3) {
            return null;
        }
        return NEW;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f38915a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
