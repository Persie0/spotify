package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wv1 {

    /* JADX INFO: renamed from: a */
    public static final wv1 f255311a;

    /* JADX INFO: renamed from: b */
    public static final wv1 f255312b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wv1[] f255313c;

    static {
        wv1 wv1Var = new wv1("UNKNOWN", 0);
        f255311a = wv1Var;
        wv1 wv1Var2 = new wv1("MAY_CHANGE_ADDON_SESSION_STATE", 1);
        f255312b = wv1Var2;
        f255313c = new wv1[]{wv1Var, wv1Var2};
    }

    public static wv1 valueOf(String str) {
        return (wv1) Enum.valueOf(wv1.class, str);
    }

    public static wv1[] values() {
        return (wv1[]) f255313c.clone();
    }
}
