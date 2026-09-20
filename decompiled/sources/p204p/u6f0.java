package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class u6f0 {

    /* JADX INFO: renamed from: a */
    public static final u6f0 f227317a;

    /* JADX INFO: renamed from: b */
    public static final u6f0 f227318b;

    /* JADX INFO: renamed from: c */
    public static final u6f0 f227319c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ u6f0[] f227320d;

    static {
        u6f0 u6f0Var = new u6f0("None", 0);
        f227317a = u6f0Var;
        u6f0 u6f0Var2 = new u6f0("Public", 1);
        f227318b = u6f0Var2;
        u6f0 u6f0Var3 = new u6f0("Locked", 2);
        f227319c = u6f0Var3;
        f227320d = new u6f0[]{u6f0Var, u6f0Var2, u6f0Var3};
    }

    public static u6f0 valueOf(String str) {
        return (u6f0) Enum.valueOf(u6f0.class, str);
    }

    public static u6f0[] values() {
        return (u6f0[]) f227320d.clone();
    }
}
