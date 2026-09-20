package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xf11 {

    /* JADX INFO: renamed from: a */
    public static final xf11 f260812a;

    /* JADX INFO: renamed from: b */
    public static final xf11 f260813b;

    /* JADX INFO: renamed from: c */
    public static final xf11 f260814c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xf11[] f260815d;

    static {
        xf11 xf11Var = new xf11("Peek", 0);
        f260812a = xf11Var;
        xf11 xf11Var2 = new xf11("Expanded", 1);
        f260813b = xf11Var2;
        xf11 xf11Var3 = new xf11("Hidden", 2);
        f260814c = xf11Var3;
        f260815d = new xf11[]{xf11Var, xf11Var2, xf11Var3};
    }

    public static xf11 valueOf(String str) {
        return (xf11) Enum.valueOf(xf11.class, str);
    }

    public static xf11[] values() {
        return (xf11[]) f260815d.clone();
    }
}
