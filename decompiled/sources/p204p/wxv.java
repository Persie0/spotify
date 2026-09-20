package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum wxv implements od50 {
    ENTITY_TYPE_UNSPECIFIED(0),
    ENTITY_TYPE_TRACK(1),
    ENTITY_TYPE_ALBUM(2),
    ENTITY_TYPE_PODCAST_EPISODE(3),
    ENTITY_TYPE_PODCAST_SHOW(4),
    ENTITY_TYPE_AUDIOBOOK_CHAPTER(5),
    ENTITY_TYPE_AUDIOBOOK(6),
    ENTITY_TYPE_LEARNING_COURSE(7),
    ENTITY_TYPE_LEARNING_LESSON(8),
    ENTITY_TYPE_USER_HIGHLIGHT(9),
    ENTITY_TYPE_AUTHOR(10),
    ENTITY_TYPE_ARTIST(11),
    ENTITY_TYPE_PLAYLIST(12),
    ENTITY_TYPE_USER(13),
    ENTITY_TYPE_PODCAST_CHAPTER(14),
    ENTITY_TYPE_EDITOR(19),
    ENTITY_TYPE_CLASSICAL_ARTIST(20),
    ENTITY_TYPE_AUDIOBOOK_SERIES(21),
    ENTITY_TYPE_CLASSICAL_WORK(22),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f256134a;

    wxv(int i) {
        this.f256134a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f256134a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
