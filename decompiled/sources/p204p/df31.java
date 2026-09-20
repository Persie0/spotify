package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class df31 {

    /* JADX INFO: renamed from: a */
    public static final df31 f48229a;

    /* JADX INFO: renamed from: b */
    public static final df31 f48230b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ df31[] f48231c;

    static {
        df31 df31Var = new df31("OnBack", 0);
        f48229a = df31Var;
        df31 df31Var2 = new df31("OnDismiss", 1);
        f48230b = df31Var2;
        f48231c = new df31[]{df31Var, df31Var2};
    }

    public static df31 valueOf(String str) {
        return (df31) Enum.valueOf(df31.class, str);
    }

    public static df31[] values() {
        return (df31[]) f48231c.clone();
    }
}
