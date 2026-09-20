package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class lzq0 {

    /* JADX INFO: renamed from: a */
    public static final lzq0 f138411a;

    /* JADX INFO: renamed from: b */
    public static final lzq0 f138412b;

    /* JADX INFO: renamed from: c */
    public static final lzq0 f138413c;

    /* JADX INFO: renamed from: d */
    public static final lzq0 f138414d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ lzq0[] f138415e;

    static {
        lzq0 lzq0Var = new lzq0("Enough", 0);
        f138411a = lzq0Var;
        lzq0 lzq0Var2 = new lzq0("TooFew", 1);
        f138412b = lzq0Var2;
        lzq0 lzq0Var3 = new lzq0("OutgoingRowMissing", 2);
        f138413c = lzq0Var3;
        lzq0 lzq0Var4 = new lzq0("FetchFailed", 3);
        f138414d = lzq0Var4;
        f138415e = new lzq0[]{lzq0Var, lzq0Var2, lzq0Var3, lzq0Var4};
    }

    public static lzq0 valueOf(String str) {
        return (lzq0) Enum.valueOf(lzq0.class, str);
    }

    public static lzq0[] values() {
        return (lzq0[]) f138415e.clone();
    }
}
