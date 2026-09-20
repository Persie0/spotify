package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum bfv0 implements od50 {
    RECOMMENDATIONS_TYPE_UNKNOWN(0),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST(1),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE(2),
    RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY(3),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK(4),
    RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f26795a;

    bfv0(int i) {
        this.f26795a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f26795a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
