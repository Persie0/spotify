package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ad8 {

    /* JADX INFO: renamed from: a */
    public static final ad8 f14560a;

    /* JADX INFO: renamed from: b */
    public static final ad8 f14561b;

    /* JADX INFO: renamed from: c */
    public static final ad8 f14562c;

    /* JADX INFO: renamed from: d */
    public static final ad8 f14563d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ad8[] f14564e;

    static {
        ad8 ad8Var = new ad8("UNKNOWN", 0);
        f14560a = ad8Var;
        ad8 ad8Var2 = new ad8("IMMEDIATE", 1);
        f14561b = ad8Var2;
        ad8 ad8Var3 = new ad8("CLOSE", 2);
        f14562c = ad8Var3;
        ad8 ad8Var4 = new ad8("FAR", 3);
        f14563d = ad8Var4;
        f14564e = new ad8[]{ad8Var, ad8Var2, ad8Var3, ad8Var4};
    }

    public static ad8 valueOf(String str) {
        return (ad8) Enum.valueOf(ad8.class, str);
    }

    public static ad8[] values() {
        return (ad8[]) f14564e.clone();
    }
}
