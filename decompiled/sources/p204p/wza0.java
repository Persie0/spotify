package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class wza0 {

    /* JADX INFO: renamed from: a */
    public static final wza0 f256546a;

    /* JADX INFO: renamed from: b */
    public static final wza0 f256547b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wza0[] f256548c;

    static {
        wza0 wza0Var = new wza0("LOGGED_IN", 0);
        f256546a = wza0Var;
        wza0 wza0Var2 = new wza0("LOGGED_OUT", 1);
        f256547b = wza0Var2;
        f256548c = new wza0[]{wza0Var, wza0Var2};
    }

    public static wza0 valueOf(String str) {
        return (wza0) Enum.valueOf(wza0.class, str);
    }

    public static wza0[] values() {
        return (wza0[]) f256548c.clone();
    }
}
