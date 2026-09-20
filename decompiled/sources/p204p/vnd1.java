package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vnd1 {

    /* JADX INFO: renamed from: a */
    public static final vnd1 f243076a;

    /* JADX INFO: renamed from: b */
    public static final vnd1 f243077b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vnd1[] f243078c;

    static {
        vnd1 vnd1Var = new vnd1("GLOBAL", 0);
        f243076a = vnd1Var;
        vnd1 vnd1Var2 = new vnd1("REGIONAL", 1);
        f243077b = vnd1Var2;
        f243078c = new vnd1[]{vnd1Var, vnd1Var2};
    }

    public static vnd1 valueOf(String str) {
        return (vnd1) Enum.valueOf(vnd1.class, str);
    }

    public static vnd1[] values() {
        return (vnd1[]) f243078c.clone();
    }
}
