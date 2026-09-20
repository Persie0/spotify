package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum trm0 implements od50 {
    alignment_unspecified(0),
    left(1),
    center(2),
    right(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f223094a;

    trm0(int i) {
        this.f223094a = i;
    }

    /* JADX INFO: renamed from: a */
    public static trm0 m81358a(int i) {
        if (i == 0) {
            return alignment_unspecified;
        }
        if (i == 1) {
            return left;
        }
        if (i == 2) {
            return center;
        }
        if (i != 3) {
            return null;
        }
        return right;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f223094a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
