package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum qo3 implements od50 {
    ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_UNSPECIFIED(0),
    ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_OFFLINE_BACKUP(1),
    ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_OFFLINE_ARTIST(2),
    ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_CACHED_PLAYLIST(3),
    ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_CACHED_ALBUM(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f190771a;

    qo3(int i) {
        this.f190771a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f190771a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
