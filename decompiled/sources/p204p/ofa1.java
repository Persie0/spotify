package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum ofa1 implements od50 {
    UPLOAD_DATE_FILTER_TYPE_UNKNOWN(0),
    UPLOAD_DATE_FILTER_TYPE_MOST_RECENT(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f164693a;

    ofa1(int i) {
        this.f164693a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f164693a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
