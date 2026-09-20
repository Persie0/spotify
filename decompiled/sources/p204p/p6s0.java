package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum p6s0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    REASON_UNSPECIFIED(0),
    REASON_ACTIVATION_UNMUTE(1),
    REASON_ACTIVATION_ADDED_TO_LIBRARY(2),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_ACTIVATION_ADDED_TO_PLAYLIST(3),
    REASON_ACTIVATION_DOWNLOADED(4),
    REASON_ACTIVATION_TIME_THRESHOLD_EXCEEDED(5),
    REASON_ACTIVATION_GENERIC(6),
    REASON_PLAYBACK_PERIODIC(8),
    REASON_PLAYBACK_ENDED(9),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_PLAYBACK_GENERIC(10),
    REASON_ACTIVATION_SHARED(7),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_ACTIVATION_ADDED_TO_QUEUE(11),
    REASON_ACTIVATION_PAGE_MATCH(12),
    REASON_ACTIVATION_SEEK(13),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f174472a;

    p6s0(int i) {
        this.f174472a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f174472a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
