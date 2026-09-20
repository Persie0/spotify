package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class o4s {

    /* JADX INFO: renamed from: a */
    public static final o4s f161747a;

    /* JADX INFO: renamed from: b */
    public static final o4s f161748b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ o4s[] f161749c;

    static {
        o4s o4sVar = new o4s("OnDownloadClicked", 0);
        f161747a = o4sVar;
        o4s o4sVar2 = new o4s("OnRemoveDownloadClicked", 1);
        f161748b = o4sVar2;
        f161749c = new o4s[]{o4sVar, o4sVar2};
    }

    public static o4s valueOf(String str) {
        return (o4s) Enum.valueOf(o4s.class, str);
    }

    public static o4s[] values() {
        return (o4s[]) f161749c.clone();
    }
}
