package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum cbw implements od50 {
    ALBUM_TYPE_UNSPECIFIED(0),
    ALBUM_TYPE_ALBUM(1),
    ALBUM_TYPE_SINGLE(2),
    ALBUM_TYPE_EP(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f36244a;

    cbw(int i) {
        this.f36244a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36244a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
