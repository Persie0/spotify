package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum xq71 implements od50 {
    TIMELINE_ICON_UNSPECIFIED(0),
    TIMELINE_ICON_EVENTS(1),
    TIMELINE_ICON_USER(2),
    TIMELINE_ICON_INFORMATION(3),
    TIMELINE_ICON_SPOTIFY(4),
    TIMELINE_ICON_PLAYLIST(5),
    TIMELINE_ICON_NOTIFICATIONS(6),
    TIMELINE_ICON_NOTIFICATIONS_ACTIVE(7),
    TIMELINE_ICON_EXTERNAL_LINK(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f264901a;

    xq71(int i) {
        this.f264901a = i;
    }

    /* JADX INFO: renamed from: a */
    public static xq71 m91818a(int i) {
        switch (i) {
            case 0:
                return TIMELINE_ICON_UNSPECIFIED;
            case 1:
                return TIMELINE_ICON_EVENTS;
            case 2:
                return TIMELINE_ICON_USER;
            case 3:
                return TIMELINE_ICON_INFORMATION;
            case 4:
                return TIMELINE_ICON_SPOTIFY;
            case 5:
                return TIMELINE_ICON_PLAYLIST;
            case 6:
                return TIMELINE_ICON_NOTIFICATIONS;
            case 7:
                return TIMELINE_ICON_NOTIFICATIONS_ACTIVE;
            case 8:
                return TIMELINE_ICON_EXTERNAL_LINK;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f264901a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
