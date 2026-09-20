package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum uhj implements od50 {
    CONTENT_FILTER_TYPE_UNKNOWN(0),
    CONTENT_FILTER_TYPE_VIDEOS(1),
    CONTENT_FILTER_TYPE_PODCAST(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f230472a;

    uhj(int i) {
        this.f230472a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f230472a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
