package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class oqy {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ oqy[] f168400a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nzv f168401b;

    /* JADX INFO: Fake field, exist only in values array */
    oqy EF5;

    static {
        oqy[] oqyVarArr = {new oqy("PlaybackIssue", 0), new oqy("OfflineIssue", 1), new oqy("SpotifyConnectIssue", 2), new oqy("UXIssue", 3), new oqy("Other", 4)};
        f168400a = oqyVarArr;
        f168401b = new nzv(oqyVarArr);
    }

    public static oqy valueOf(String str) {
        return (oqy) Enum.valueOf(oqy.class, str);
    }

    public static oqy[] values() {
        return (oqy[]) f168400a.clone();
    }
}
