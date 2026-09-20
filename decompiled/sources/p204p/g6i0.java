package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g6i0 {

    /* JADX INFO: renamed from: a */
    public static final g6i0 f77056a;

    /* JADX INFO: renamed from: b */
    public static final g6i0 f77057b;

    /* JADX INFO: renamed from: c */
    public static final g6i0 f77058c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ g6i0[] f77059d;

    static {
        g6i0 g6i0Var = new g6i0("IDLE", 0);
        f77056a = g6i0Var;
        g6i0 g6i0Var2 = new g6i0("LAUNCH_REQUESTED", 1);
        f77057b = g6i0Var2;
        g6i0 g6i0Var3 = new g6i0("AWAITING_RESULT", 2);
        f77058c = g6i0Var3;
        f77059d = new g6i0[]{g6i0Var, g6i0Var2, g6i0Var3};
    }

    public static g6i0 valueOf(String str) {
        return (g6i0) Enum.valueOf(g6i0.class, str);
    }

    public static g6i0[] values() {
        return (g6i0[]) f77059d.clone();
    }
}
