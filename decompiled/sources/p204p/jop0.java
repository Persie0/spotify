package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum jop0 implements od50 {
    NO_FILTER(0),
    AVAILABLE(1),
    AVAILABLE_OFFLINE(2),
    ARTIST_NOT_BANNED(3),
    NOT_BANNED(4),
    NOT_EXPLICIT(5),
    NOT_EPISODE(6),
    NOT_RECOMMENDATION(7),
    UNPLAYED(8),
    IN_PROGRESS(9),
    NOT_FULLY_PLAYED(10),
    NOT_EPISODE_TRAILER(11),
    RECOMMENDATION(12),
    VIDEO_CONTENT(13),
    NOT_VIDEO_CONTENT(14),
    FINISHED(15),
    NOT_LOCAL_TRACK(16),
    NOT_PAYWALLED(17),
    NOT_FULLY_PLAYED_OR_IN_PROGRESS(18),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f114497a;

    jop0(int i) {
        this.f114497a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f114497a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
