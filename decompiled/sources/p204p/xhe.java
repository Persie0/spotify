package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum xhe implements od50 {
    CLICK_ACTION_TYPE_UNSPECIFIED(0),
    CLICK_ACTION_TYPE_ADD_TO_QUEUE(2),
    CLICK_ACTION_TYPE_ADD_TO_YOUR_EPISODES(3),
    CLICK_ACTION_TYPE_PRESENT_SSO_EMAIL_COLLECTION(4),
    CLICK_ACTION_TYPE_DOWNLOAD_ENTITY(5),
    CLICK_ACTION_TYPE_CREATE_PLAYLIST(6),
    CLICK_ACTION_TYPE_ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2(7),
    CLICK_ACTION_TYPE_EMAIL_VERIFICATION(8),
    CLICK_ACTION_TYPE_OPT_OUT_BRAND_LIFT(9),
    CLICK_ACTION_TYPE_OPT_IN(10),
    CLICK_ACTION_TYPE_OPT_OUT(11),
    CLICK_ACTION_TYPE_SELECT_OPTION(12),
    CLICK_ACTION_TYPE_OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE(13),
    CLICK_ACTION_TYPE_SHARE_ENTITY(14),
    CLICK_ACTION_TYPE_ADD_TO_PLAYLIST(15),
    CLICK_ACTION_TYPE_PDP_URL(17),
    CLICK_ACTION_TYPE_DISMISS(18),
    CLICK_ACTION_TYPE_SAVE_ENTITY(19),
    CLICK_ACTION_TYPE_SHARE_CONTENT(20),
    CLICK_ACTION_TYPE_INTERNAL_WEBVIEW(21),
    CLICK_ACTION_TYPE_TOGGLE_NOTIFICATION_PREFERENCE(22),
    CLICK_ACTION_TYPE_OPEN_PUSH_PERMISSIONS_DIALOG(23),
    CLICK_ACTION_TYPE_URL(24),
    CLICK_ACTION_TYPE_EXTERNAL_URL(25),
    CLICK_ACTION_TYPE_OPEN_ADS_TRACKING_PERMISSIONS_DIALOG(26),
    CLICK_ACTION_TYPE_START_PLAYBACK(27),
    CLICK_ACTION_TYPE_SAVE_AND_NAVIGATE(28),
    CLICK_ACTION_TYPE_IAP(30),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f261564a;

    xhe(int i) {
        this.f261564a = i;
    }

    /* JADX INFO: renamed from: a */
    public static xhe m90968a(int i) {
        switch (i) {
            case 0:
                return CLICK_ACTION_TYPE_UNSPECIFIED;
            case 1:
            case 16:
            case 29:
            default:
                return null;
            case 2:
                return CLICK_ACTION_TYPE_ADD_TO_QUEUE;
            case 3:
                return CLICK_ACTION_TYPE_ADD_TO_YOUR_EPISODES;
            case 4:
                return CLICK_ACTION_TYPE_PRESENT_SSO_EMAIL_COLLECTION;
            case 5:
                return CLICK_ACTION_TYPE_DOWNLOAD_ENTITY;
            case 6:
                return CLICK_ACTION_TYPE_CREATE_PLAYLIST;
            case 7:
                return CLICK_ACTION_TYPE_ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2;
            case 8:
                return CLICK_ACTION_TYPE_EMAIL_VERIFICATION;
            case 9:
                return CLICK_ACTION_TYPE_OPT_OUT_BRAND_LIFT;
            case 10:
                return CLICK_ACTION_TYPE_OPT_IN;
            case 11:
                return CLICK_ACTION_TYPE_OPT_OUT;
            case 12:
                return CLICK_ACTION_TYPE_SELECT_OPTION;
            case 13:
                return CLICK_ACTION_TYPE_OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE;
            case 14:
                return CLICK_ACTION_TYPE_SHARE_ENTITY;
            case 15:
                return CLICK_ACTION_TYPE_ADD_TO_PLAYLIST;
            case 17:
                return CLICK_ACTION_TYPE_PDP_URL;
            case 18:
                return CLICK_ACTION_TYPE_DISMISS;
            case 19:
                return CLICK_ACTION_TYPE_SAVE_ENTITY;
            case 20:
                return CLICK_ACTION_TYPE_SHARE_CONTENT;
            case 21:
                return CLICK_ACTION_TYPE_INTERNAL_WEBVIEW;
            case 22:
                return CLICK_ACTION_TYPE_TOGGLE_NOTIFICATION_PREFERENCE;
            case 23:
                return CLICK_ACTION_TYPE_OPEN_PUSH_PERMISSIONS_DIALOG;
            case 24:
                return CLICK_ACTION_TYPE_URL;
            case 25:
                return CLICK_ACTION_TYPE_EXTERNAL_URL;
            case 26:
                return CLICK_ACTION_TYPE_OPEN_ADS_TRACKING_PERMISSIONS_DIALOG;
            case 27:
                return CLICK_ACTION_TYPE_START_PLAYBACK;
            case 28:
                return CLICK_ACTION_TYPE_SAVE_AND_NAVIGATE;
            case 30:
                return CLICK_ACTION_TYPE_IAP;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f261564a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
