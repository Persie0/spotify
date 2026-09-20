package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum fjw implements od50 {
    GPRS(0),
    EDGE(1),
    THREE_G(2),
    FOUR_G(3),
    FIVE_G(4),
    UNKNOWN_SUBTYPE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f70415a;

    fjw(int i) {
        this.f70415a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f70415a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
