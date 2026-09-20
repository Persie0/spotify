package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum cpw implements od50 {
    BEARER_WIFI(0),
    BEARER_CELLULAR(1),
    BEARER_UNKNOWN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f40668a;

    cpw(int i) {
        this.f40668a = i;
    }

    /* JADX INFO: renamed from: a */
    public static cpw m33568a(int i) {
        if (i == 0) {
            return BEARER_WIFI;
        }
        if (i == 1) {
            return BEARER_CELLULAR;
        }
        if (i != 2) {
            return null;
        }
        return BEARER_UNKNOWN;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40668a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
