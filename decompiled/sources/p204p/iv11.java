package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class iv11 {

    /* JADX INFO: renamed from: a */
    public static final iv11 f106067a;

    /* JADX INFO: renamed from: b */
    public static final iv11 f106068b;

    /* JADX INFO: renamed from: c */
    public static final iv11 f106069c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ iv11[] f106070d;

    static {
        iv11 iv11Var = new iv11("Linear", 0);
        f106067a = iv11Var;
        iv11 iv11Var2 = new iv11("Shuffle", 1);
        f106068b = iv11Var2;
        iv11 iv11Var3 = new iv11("SmartShuffle", 2);
        f106069c = iv11Var3;
        f106070d = new iv11[]{iv11Var, iv11Var2, iv11Var3};
    }

    public static iv11 valueOf(String str) {
        return (iv11) Enum.valueOf(iv11.class, str);
    }

    public static iv11[] values() {
        return (iv11[]) f106070d.clone();
    }
}
