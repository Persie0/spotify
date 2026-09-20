package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum dyj implements od50 {
    CONTENT_TYPE_UNSPECIFIED(0),
    CONTENT_TYPE_TRACK(1),
    CONTENT_TYPE_ALBUM(2),
    CONTENT_TYPE_MUSIC_VIDEO(3),
    CONTENT_TYPE_PODCAST_EPISODE(4),
    CONTENT_TYPE_PODCAST_SHOW(5),
    CONTENT_TYPE_AUDIOBOOK_CHAPTER(6),
    CONTENT_TYPE_AUDIOBOOK(7),
    CONTENT_TYPE_COURSE(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f54381a;

    dyj(int i) {
        this.f54381a = i;
    }

    /* JADX INFO: renamed from: a */
    public static dyj m37344a(int i) {
        switch (i) {
            case 0:
                return CONTENT_TYPE_UNSPECIFIED;
            case 1:
                return CONTENT_TYPE_TRACK;
            case 2:
                return CONTENT_TYPE_ALBUM;
            case 3:
                return CONTENT_TYPE_MUSIC_VIDEO;
            case 4:
                return CONTENT_TYPE_PODCAST_EPISODE;
            case 5:
                return CONTENT_TYPE_PODCAST_SHOW;
            case 6:
                return CONTENT_TYPE_AUDIOBOOK_CHAPTER;
            case 7:
                return CONTENT_TYPE_AUDIOBOOK;
            case 8:
            default:
                return null;
            case 9:
                return CONTENT_TYPE_COURSE;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f54381a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
