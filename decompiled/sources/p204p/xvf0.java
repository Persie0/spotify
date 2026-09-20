package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class xvf0 {

    /* JADX INFO: renamed from: a */
    public static final xvf0 f266381a;

    /* JADX INFO: renamed from: b */
    public static final xvf0 f266382b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xvf0[] f266383c;

    static {
        xvf0 xvf0Var = new xvf0("OnPlayClicked", 0);
        f266381a = xvf0Var;
        xvf0 xvf0Var2 = new xvf0("OnStopClicked", 1);
        f266382b = xvf0Var2;
        f266383c = new xvf0[]{xvf0Var, xvf0Var2};
    }

    public static xvf0 valueOf(String str) {
        return (xvf0) Enum.valueOf(xvf0.class, str);
    }

    public static xvf0[] values() {
        return (xvf0[]) f266383c.clone();
    }
}
