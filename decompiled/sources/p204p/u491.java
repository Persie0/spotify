package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class u491 implements w491 {

    /* JADX INFO: renamed from: a */
    public static final u491 f226634a;

    /* JADX INFO: renamed from: b */
    public static final u491 f226635b;

    /* JADX INFO: renamed from: c */
    public static final u491 f226636c;

    /* JADX INFO: renamed from: d */
    public static final u491 f226637d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ u491[] f226638e;

    static {
        u491 u491Var = new u491("NOT_FOUND", 0);
        f226634a = u491Var;
        u491 u491Var2 = new u491("INVALID_ARGUMENTS", 1);
        f226635b = u491Var2;
        u491 u491Var3 = new u491("BACKEND_FAILURE", 2);
        f226636c = u491Var3;
        u491 u491Var4 = new u491("UNKNOWN", 3);
        f226637d = u491Var4;
        f226638e = new u491[]{u491Var, u491Var2, u491Var3, u491Var4};
    }

    public static u491 valueOf(String str) {
        return (u491) Enum.valueOf(u491.class, str);
    }

    public static u491[] values() {
        return (u491[]) f226638e.clone();
    }
}
