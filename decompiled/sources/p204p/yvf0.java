package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class yvf0 {

    /* JADX INFO: renamed from: a */
    public static final yvf0 f276659a;

    /* JADX INFO: renamed from: b */
    public static final yvf0 f276660b;

    /* JADX INFO: renamed from: c */
    public static final yvf0 f276661c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yvf0[] f276662d;

    static {
        yvf0 yvf0Var = new yvf0("Playing", 0);
        f276659a = yvf0Var;
        yvf0 yvf0Var2 = new yvf0("Stopped", 1);
        f276660b = yvf0Var2;
        yvf0 yvf0Var3 = new yvf0("Loading", 2);
        f276661c = yvf0Var3;
        f276662d = new yvf0[]{yvf0Var, yvf0Var2, yvf0Var3};
    }

    public static yvf0 valueOf(String str) {
        return (yvf0) Enum.valueOf(yvf0.class, str);
    }

    public static yvf0[] values() {
        return (yvf0[]) f276662d.clone();
    }
}
