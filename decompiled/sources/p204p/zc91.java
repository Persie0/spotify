package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum zc91 implements od50 {
    VARIANT_NORMAL(0),
    VARIANT_SPECIAL(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f281483a;

    zc91(int i) {
        this.f281483a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f281483a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
