package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum u4x0 implements od50 {
    NONE(0),
    IS_EXPLICIT(1),
    IS_19_PLUS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f226824a;

    u4x0(int i) {
        this.f226824a = i;
    }

    /* JADX INFO: renamed from: a */
    public static u4x0 m82368a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return IS_EXPLICIT;
        }
        if (i != 2) {
            return null;
        }
        return IS_19_PLUS;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f226824a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
