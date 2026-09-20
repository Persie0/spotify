package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum eyw0 implements od50 {
    RESIDENT_KEY_UNSPECIFIED(0),
    RESIDENT_KEY_REQUIRED(1),
    RESIDENT_KEY_PREFERRED(2),
    RESIDENT_KEY_DISCOURAGED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f64209a;

    eyw0(int i) {
        this.f64209a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f64209a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
