package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hto0 {

    /* JADX INFO: renamed from: a */
    public static final hto0 f95099a;

    /* JADX INFO: renamed from: b */
    public static final hto0 f95100b;

    /* JADX INFO: renamed from: c */
    public static final hto0 f95101c;

    /* JADX INFO: renamed from: d */
    public static final hto0 f95102d;

    /* JADX INFO: renamed from: e */
    public static final hto0 f95103e;

    /* JADX INFO: renamed from: f */
    public static final hto0 f95104f;

    /* JADX INFO: renamed from: g */
    public static final hto0 f95105g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ hto0[] f95106h;

    static {
        hto0 hto0Var = new hto0("UNKNOWN", 0);
        f95099a = hto0Var;
        hto0 hto0Var2 = new hto0("NO_RESTRICTION", 1);
        f95100b = hto0Var2;
        hto0 hto0Var3 = new hto0("EXPLICIT_CONTENT", 2);
        f95101c = hto0Var3;
        hto0 hto0Var4 = new hto0("AGE_RESTRICTED", 3);
        f95102d = hto0Var4;
        hto0 hto0Var5 = new hto0("NOT_IN_CATALOGUE", 4);
        f95103e = hto0Var5;
        hto0 hto0Var6 = new hto0("NOT_AVAILABLE_OFFLINE", 5);
        f95104f = hto0Var6;
        hto0 hto0Var7 = new hto0("PREMIUM_ONLY", 6);
        f95105g = hto0Var7;
        f95106h = new hto0[]{hto0Var, hto0Var2, hto0Var3, hto0Var4, hto0Var5, hto0Var6, hto0Var7};
    }

    public static hto0 valueOf(String str) {
        return (hto0) Enum.valueOf(hto0.class, str);
    }

    public static hto0[] values() {
        return (hto0[]) f95106h.clone();
    }
}
