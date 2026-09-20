package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ofa0 implements od50 {
    RESOLUTION_METHOD_UNSPECIFIED(0),
    RESOLUTION_METHOD_STORE(1),
    RESOLUTION_METHOD_INFERRED(2),
    RESOLUTION_METHOD_PROVIDED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f164688a;

    ofa0(int i) {
        this.f164688a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f164688a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
