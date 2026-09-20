package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cg10 {

    /* JADX INFO: renamed from: a */
    public static final cg10 f37509a;

    /* JADX INFO: renamed from: b */
    public static final cg10 f37510b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cg10[] f37511c;

    static {
        cg10 cg10Var = new cg10("Jam", 0);
        f37509a = cg10Var;
        cg10 cg10Var2 = new cg10("DesktopLauncher", 1);
        f37510b = cg10Var2;
        f37511c = new cg10[]{cg10Var, cg10Var2};
    }

    public static cg10 valueOf(String str) {
        return (cg10) Enum.valueOf(cg10.class, str);
    }

    public static cg10[] values() {
        return (cg10[]) f37511c.clone();
    }
}
