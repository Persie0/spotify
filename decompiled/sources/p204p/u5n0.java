package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class u5n0 {

    /* JADX INFO: renamed from: a */
    public static final u5n0 f227072a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ u5n0[] f227073b;

    static {
        u5n0 u5n0Var = new u5n0("CONNECTED", 0);
        f227072a = u5n0Var;
        f227073b = new u5n0[]{u5n0Var, new u5n0("NOT_CONNECTED", 1), new u5n0("INVALID", 2)};
    }

    public static u5n0 valueOf(String str) {
        return (u5n0) Enum.valueOf(u5n0.class, str);
    }

    public static u5n0[] values() {
        return (u5n0[]) f227073b.clone();
    }
}
