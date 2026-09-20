package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xqi0 {

    /* JADX INFO: renamed from: a */
    public static final xqi0 f265055a;

    /* JADX INFO: renamed from: b */
    public static final xqi0 f265056b;

    /* JADX INFO: renamed from: c */
    public static final xqi0 f265057c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xqi0[] f265058d;

    static {
        xqi0 xqi0Var = new xqi0("Default", 0);
        f265055a = xqi0Var;
        xqi0 xqi0Var2 = new xqi0("UserInput", 1);
        f265056b = xqi0Var2;
        xqi0 xqi0Var3 = new xqi0("PreventUserInput", 2);
        f265057c = xqi0Var3;
        f265058d = new xqi0[]{xqi0Var, xqi0Var2, xqi0Var3};
    }

    public static xqi0 valueOf(String str) {
        return (xqi0) Enum.valueOf(xqi0.class, str);
    }

    public static xqi0[] values() {
        return (xqi0[]) f265058d.clone();
    }
}
