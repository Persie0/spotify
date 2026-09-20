package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xya0 {

    /* JADX INFO: renamed from: a */
    public static final xya0 f267264a;

    /* JADX INFO: renamed from: b */
    public static final xya0 f267265b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xya0[] f267266c;

    static {
        xya0 xya0Var = new xya0("HasLoggedInSession", 0);
        f267264a = xya0Var;
        xya0 xya0Var2 = new xya0("NoLoggedInSession", 1);
        f267265b = xya0Var2;
        f267266c = new xya0[]{xya0Var, xya0Var2};
    }

    public static xya0 valueOf(String str) {
        return (xya0) Enum.valueOf(xya0.class, str);
    }

    public static xya0[] values() {
        return (xya0[]) f267266c.clone();
    }
}
