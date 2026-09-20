package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class xz10 {

    /* JADX INFO: renamed from: a */
    public static final xz10 f267505a;

    /* JADX INFO: renamed from: b */
    public static final xz10 f267506b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xz10[] f267507c;

    static {
        xz10 xz10Var = new xz10("MINIMIZE_EMPTY_SPACE", 0);
        f267505a = xz10Var;
        xz10 xz10Var2 = new xz10("MAXIMIZE_ITEMS_SHOWN", 1);
        f267506b = xz10Var2;
        f267507c = new xz10[]{xz10Var, xz10Var2};
    }

    public static xz10 valueOf(String str) {
        return (xz10) Enum.valueOf(xz10.class, str);
    }

    public static xz10[] values() {
        return (xz10[]) f267507c.clone();
    }
}
