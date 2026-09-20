package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vj0 {

    /* JADX INFO: renamed from: a */
    public static final vj0 f241841a;

    /* JADX INFO: renamed from: b */
    public static final vj0 f241842b;

    /* JADX INFO: renamed from: c */
    public static final vj0 f241843c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ vj0[] f241844d;

    static {
        vj0 vj0Var = new vj0("DEFAULT", 0);
        f241841a = vj0Var;
        vj0 vj0Var2 = new vj0("SEE_MORE", 1);
        f241842b = vj0Var2;
        vj0 vj0Var3 = new vj0("SEE_LESS", 2);
        f241843c = vj0Var3;
        f241844d = new vj0[]{vj0Var, vj0Var2, vj0Var3};
    }

    public static vj0 valueOf(String str) {
        return (vj0) Enum.valueOf(vj0.class, str);
    }

    public static vj0[] values() {
        return (vj0[]) f241844d.clone();
    }
}
