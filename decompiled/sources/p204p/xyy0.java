package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum xyy0 implements od50 {
    ENTITY_TYPE_UNSPECIFIED(0),
    ENTITY_TYPE_ARTIST(1),
    ENTITY_TYPE_TRACK(2),
    ENTITY_TYPE_ALBUM(3),
    ENTITY_TYPE_PODCAST(4),
    ENTITY_TYPE_EPISODE(5),
    ENTITY_TYPE_AUDIOBOOK(6),
    ENTITY_TYPE_PLAYLIST(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f267479a;

    xyy0(int i) {
        this.f267479a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f267479a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
