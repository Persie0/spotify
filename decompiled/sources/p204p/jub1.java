package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum jub1 implements od50 {
    UNKNOWN(0),
    URL(1),
    MANIFEST_ID(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f116074a;

    jub1(int i) {
        this.f116074a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f116074a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
