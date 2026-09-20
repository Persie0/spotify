package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class zp81 {

    /* JADX INFO: renamed from: a */
    public static final zp81 f285019a;

    /* JADX INFO: renamed from: b */
    public static final zp81 f285020b;

    /* JADX INFO: renamed from: c */
    public static final zp81 f285021c;

    /* JADX INFO: renamed from: d */
    public static final zp81 f285022d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ zp81[] f285023e;

    static {
        zp81 zp81Var = new zp81("DISABLED", 0);
        f285019a = zp81Var;
        zp81 zp81Var2 = new zp81("SHOW_UPSELL", 1);
        f285020b = zp81Var2;
        zp81 zp81Var3 = new zp81("ENABLED", 2);
        f285021c = zp81Var3;
        zp81 zp81Var4 = new zp81("SECTION_ONLY", 3);
        f285022d = zp81Var4;
        f285023e = new zp81[]{zp81Var, zp81Var2, zp81Var3, zp81Var4};
    }

    public static zp81 valueOf(String str) {
        return (zp81) Enum.valueOf(zp81.class, str);
    }

    public static zp81[] values() {
        return (zp81[]) f285023e.clone();
    }
}
