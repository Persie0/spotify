package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hpa0 {

    /* JADX INFO: renamed from: a */
    public static final hpa0 f93724a;

    /* JADX INFO: renamed from: b */
    public static final hpa0 f93725b;

    /* JADX INFO: renamed from: c */
    public static final hpa0 f93726c;

    /* JADX INFO: renamed from: d */
    public static final hpa0 f93727d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ hpa0[] f93728e;

    static {
        hpa0 hpa0Var = new hpa0("LOCKED", 0);
        f93724a = hpa0Var;
        hpa0 hpa0Var2 = new hpa0("LOCKED_FOR_CHILD", 1);
        f93725b = hpa0Var2;
        hpa0 hpa0Var3 = new hpa0("UNLOCKED", 2);
        f93726c = hpa0Var3;
        hpa0 hpa0Var4 = new hpa0("UNKNOWN", 3);
        f93727d = hpa0Var4;
        f93728e = new hpa0[]{hpa0Var, hpa0Var2, hpa0Var3, hpa0Var4};
    }

    public static hpa0 valueOf(String str) {
        return (hpa0) Enum.valueOf(hpa0.class, str);
    }

    public static hpa0[] values() {
        return (hpa0[]) f93728e.clone();
    }
}
