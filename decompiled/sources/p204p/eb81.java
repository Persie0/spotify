package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum eb81 implements od50 {
    CONTENT_ACCESS_NONE(0),
    CONTENT_ACCESS_WINDOWING(1),
    CONTENT_ACCESS_GATED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f57859a;

    eb81(int i) {
        this.f57859a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f57859a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
