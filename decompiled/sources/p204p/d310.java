package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum d310 implements od50 {
    GENERATION_STATUS_UNSPECIFIED(0),
    GENERATION_STATUS_IN_PROGRESS(1),
    GENERATION_STATUS_COMPLETE(2),
    GENERATION_STATUS_ERROR(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f44748a;

    d310(int i) {
        this.f44748a = i;
    }

    /* JADX INFO: renamed from: a */
    public static d310 m34797a(int i) {
        if (i == 0) {
            return GENERATION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return GENERATION_STATUS_IN_PROGRESS;
        }
        if (i == 2) {
            return GENERATION_STATUS_COMPLETE;
        }
        if (i != 3) {
            return null;
        }
        return GENERATION_STATUS_ERROR;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f44748a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
