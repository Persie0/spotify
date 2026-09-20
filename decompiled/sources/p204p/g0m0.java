package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g0m0 {

    /* JADX INFO: renamed from: a */
    public static final g0m0 f75395a;

    /* JADX INFO: renamed from: b */
    public static final g0m0 f75396b;

    /* JADX INFO: renamed from: c */
    public static final g0m0 f75397c;

    /* JADX INFO: renamed from: d */
    public static final g0m0 f75398d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ g0m0[] f75399e;

    static {
        g0m0 g0m0Var = new g0m0("AUTO_HIDE", 0);
        f75395a = g0m0Var;
        g0m0 g0m0Var2 = new g0m0("HIDE_DISABLED", 1);
        f75396b = g0m0Var2;
        g0m0 g0m0Var3 = new g0m0("HIDE_ENABLED", 2);
        f75397c = g0m0Var3;
        g0m0 g0m0Var4 = new g0m0("MINIMIZE_ENABLED", 3);
        f75398d = g0m0Var4;
        f75399e = new g0m0[]{g0m0Var, g0m0Var2, g0m0Var3, g0m0Var4};
    }

    public static g0m0 valueOf(String str) {
        return (g0m0) Enum.valueOf(g0m0.class, str);
    }

    public static g0m0[] values() {
        return (g0m0[]) f75399e.clone();
    }
}
