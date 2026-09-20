package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xh90 {

    /* JADX INFO: renamed from: a */
    public static final xh90 f261484a;

    /* JADX INFO: renamed from: b */
    public static final xh90 f261485b;

    /* JADX INFO: renamed from: c */
    public static final xh90 f261486c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xh90[] f261487d;

    static {
        xh90 xh90Var = new xh90("CardClicked", 0);
        f261484a = xh90Var;
        xh90 xh90Var2 = new xh90("CtaButtonClicked", 1);
        f261485b = xh90Var2;
        xh90 xh90Var3 = new xh90("LockedButtonClicked", 2);
        f261486c = xh90Var3;
        f261487d = new xh90[]{xh90Var, xh90Var2, xh90Var3};
    }

    public static xh90 valueOf(String str) {
        return (xh90) Enum.valueOf(xh90.class, str);
    }

    public static xh90[] values() {
        return (xh90[]) f261487d.clone();
    }
}
