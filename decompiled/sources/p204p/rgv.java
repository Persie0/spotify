package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum rgv implements od50 {
    ENTITY_FILTER_TYPE_UNKNOWN(0),
    ENTITY_FILTER_TYPE_ARTIST(1),
    ENTITY_FILTER_TYPE_TRACK(2),
    ENTITY_FILTER_TYPE_ALBUM(3),
    ENTITY_FILTER_TYPE_PLAYLIST(4),
    ENTITY_FILTER_TYPE_GENRE(5),
    ENTITY_FILTER_TYPE_PROFILE(6),
    ENTITY_FILTER_TYPE_AUDIOBOOK(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f199032a;

    rgv(int i) {
        this.f199032a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f199032a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
