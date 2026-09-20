package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum wqq implements od50 {
    UNDEFINED(0),
    NORMAL(1),
    COMPACT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f254127a;

    wqq(int i) {
        this.f254127a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f254127a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
