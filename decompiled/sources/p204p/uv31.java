package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uv31 {

    /* JADX INFO: renamed from: a */
    public static final uv31 f234329a;

    /* JADX INFO: renamed from: b */
    public static final uv31 f234330b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ uv31[] f234331c;

    static {
        uv31 uv31Var = new uv31("MEDIUM", 0);
        f234329a = uv31Var;
        uv31 uv31Var2 = new uv31("LARGE", 1);
        f234330b = uv31Var2;
        f234331c = new uv31[]{uv31Var, uv31Var2};
    }

    public static uv31 valueOf(String str) {
        return (uv31) Enum.valueOf(uv31.class, str);
    }

    public static uv31[] values() {
        return (uv31[]) f234331c.clone();
    }
}
