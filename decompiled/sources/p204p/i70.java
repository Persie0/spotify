package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class i70 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ i70[] f99385a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nzv f99386b;

    /* JADX INFO: Fake field, exist only in values array */
    i70 EF5;

    static {
        i70[] i70VarArr = {new i70("URL", 0), new i70("PDP_URL", 1), new i70("INTERNAL_WEBVIEW", 2), new i70("EXTERNAL_URL", 3), new i70("IAP", 4), new i70("DISMISS", 5), new i70("EMAIL_VERIFICATION", 6), new i70("ADD_TO_PLAYLIST", 7), new i70("CREATE_PLAYLIST", 8), new i70("SAVE_AND_NAVIGATE", 9), new i70("SAVE_ENTITY", 10), new i70("START_PLAYBACK", 11), new i70("SELECT_OPTION", 12), new i70("TOGGLE_NOTIFICATION_PREFERENCE", 13), new i70("ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES", 14), new i70("URL_V2", 15), new i70("SHARE_CONTENT", 16), new i70("OPT_OUT_BRAND_LIFT", 17), new i70("SHARE_ENTITY", 18), new i70("PRESENT_SSO_EMAIL_COLLECTION", 19), new i70("DOWNLOAD_ENTITY", 20), new i70("ADD_TO_QUEUE", 21), new i70("ADD_TO_YOUR_EPISODES", 22), new i70("OPT_IN", 23), new i70("OPT_OUT", 24), new i70("EXTERNAL_URL_V2", 25), new i70("OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE", 26)};
        f99385a = i70VarArr;
        f99386b = new nzv(i70VarArr);
    }

    public static i70 valueOf(String str) {
        return (i70) Enum.valueOf(i70.class, str);
    }

    public static i70[] values() {
        return (i70[]) f99385a.clone();
    }
}
