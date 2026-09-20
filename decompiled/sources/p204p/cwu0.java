package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum cwu0 implements od50 {
    REASON_UNSPECIFIED(0),
    REASON_CONTENT_SHARING(1),
    REASON_COLLABORATIVE_PLAYLISTS(2),
    REASON_BLENDS(3),
    REASON_GROUP_SESSIONS(4),
    REASON_FAMILY(5),
    REASON_FOLLOWING(6),
    REASON_MESSAGING(7),
    REASON_WRAPPED_PARTY(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f42840a;

    cwu0(int i) {
        this.f42840a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f42840a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
