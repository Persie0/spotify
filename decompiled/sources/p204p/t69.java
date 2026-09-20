package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t69 {

    /* JADX INFO: renamed from: a */
    public static final t69 f217488a;

    /* JADX INFO: renamed from: b */
    public static final t69 f217489b;

    /* JADX INFO: renamed from: c */
    public static final t69 f217490c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ t69[] f217491d;

    static {
        t69 t69Var = new t69("ENABLE", 0);
        f217488a = t69Var;
        t69 t69Var2 = new t69("ENABLED", 1);
        f217489b = t69Var2;
        t69 t69Var3 = new t69("ENABLE_WITH_UPDATES", 2);
        f217490c = t69Var3;
        f217491d = new t69[]{t69Var, t69Var2, t69Var3};
    }

    public static t69 valueOf(String str) {
        return (t69) Enum.valueOf(t69.class, str);
    }

    public static t69[] values() {
        return (t69[]) f217491d.clone();
    }
}
