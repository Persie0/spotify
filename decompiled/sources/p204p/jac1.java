package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum jac1 implements od50 {
    VIDEO_SURFACE_UNKNOWN(0),
    VIDEO_SURFACE_FULLSCREEN(1),
    VIDEO_SURFACE_NOW_PLAYING_BAR(2),
    VIDEO_SURFACE_NOW_PLAYING_SIDEBAR(3),
    VIDEO_SURFACE_NOW_PLAYING_VIEW(4),
    VIDEO_SURFACE_NOW_PLAYING_VIEW_VERTICAL(5),
    VIDEO_SURFACE_PICTURE_IN_PICTURE(6),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_SURFACE_CINEMA(7),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_SURFACE_EXTERNAL(8),
    VIDEO_SURFACE_OTHER(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f110440a;

    jac1(int i) {
        this.f110440a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f110440a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
