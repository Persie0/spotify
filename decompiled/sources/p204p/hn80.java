package p204p;

import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX INFO: loaded from: classes2.dex */
public enum hn80 implements od50 {
    EMPTY(0),
    ARTIST(1),
    ALBUM(2),
    TRACK(4),
    LOCAL_TRACK(9),
    SHOW(62),
    EPISODE(63),
    CLIP(92),
    PODCAST_CHAPTER(96),
    KALLAX(100),
    USER_HIGHLIGHT(101),
    LISTENING_STATS(Error.TOO_YOUNG_FIELD_NUMBER),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f93248a;

    hn80(int i) {
        this.f93248a = i;
    }

    /* JADX INFO: renamed from: a */
    public static hn80 m47999a(int i) {
        if (i == 0) {
            return EMPTY;
        }
        if (i == 1) {
            return ARTIST;
        }
        if (i == 2) {
            return ALBUM;
        }
        if (i == 4) {
            return TRACK;
        }
        if (i == 9) {
            return LOCAL_TRACK;
        }
        if (i == 92) {
            return CLIP;
        }
        if (i == 96) {
            return PODCAST_CHAPTER;
        }
        if (i == 107) {
            return LISTENING_STATS;
        }
        if (i == 62) {
            return SHOW;
        }
        if (i == 63) {
            return EPISODE;
        }
        if (i == 100) {
            return KALLAX;
        }
        if (i != 101) {
            return null;
        }
        return USER_HIGHLIGHT;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f93248a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
