package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum fu8 implements od50 {
    CONTENT_TYPE_UNSPECIFIED(0),
    CONTENT_TYPE_PODCAST(1),
    CONTENT_TYPE_AUDIOBOOK(2),
    CONTENT_TYPE_CREATOR_CHANNEL(3),
    CONTENT_TYPE_COURSE(4),
    CONTENT_TYPE_MEMBERSHIP(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f73436a;

    fu8(int i) {
        this.f73436a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f73436a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
