package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum d69 implements od50 {
    BEARER_UNKNOWN(0),
    BEARER_CELLULAR(1),
    BEARER_WIFI(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f45629a;

    d69(int i) {
        this.f45629a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45629a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
