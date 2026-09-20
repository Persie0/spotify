package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l1m0 {

    /* JADX INFO: renamed from: a */
    public static final l1m0 f128755a;

    /* JADX INFO: renamed from: b */
    public static final l1m0 f128756b;

    /* JADX INFO: renamed from: c */
    public static final l1m0 f128757c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ l1m0[] f128758d;

    static {
        l1m0 l1m0Var = new l1m0("VISIBLE", 0);
        f128755a = l1m0Var;
        l1m0 l1m0Var2 = new l1m0("HIDDEN", 1);
        f128756b = l1m0Var2;
        l1m0 l1m0Var3 = new l1m0("MINIMIZED", 2);
        f128757c = l1m0Var3;
        f128758d = new l1m0[]{l1m0Var, l1m0Var2, l1m0Var3};
    }

    public static l1m0 valueOf(String str) {
        return (l1m0) Enum.valueOf(l1m0.class, str);
    }

    public static l1m0[] values() {
        return (l1m0[]) f128758d.clone();
    }
}
