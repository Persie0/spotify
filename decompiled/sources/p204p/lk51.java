package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class lk51 {

    /* JADX INFO: renamed from: a */
    public static final lk51 f134260a;

    /* JADX INFO: renamed from: b */
    public static final lk51 f134261b;

    /* JADX INFO: renamed from: c */
    public static final lk51 f134262c;

    /* JADX INFO: renamed from: d */
    public static final lk51 f134263d;

    /* JADX INFO: renamed from: e */
    public static final lk51 f134264e;

    /* JADX INFO: renamed from: f */
    public static final lk51 f134265f;

    /* JADX INFO: renamed from: g */
    public static final lk51 f134266g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ lk51[] f134267h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ nzv f134268i;

    static {
        lk51 lk51Var = new lk51("UNKNOWN", 0);
        f134260a = lk51Var;
        lk51 lk51Var2 = new lk51("LOW", 1);
        f134261b = lk51Var2;
        lk51 lk51Var3 = new lk51("NORMAL", 2);
        f134262c = lk51Var3;
        lk51 lk51Var4 = new lk51("HIGH", 3);
        f134263d = lk51Var4;
        lk51 lk51Var5 = new lk51("VERY_HIGH", 4);
        f134264e = lk51Var5;
        lk51 lk51Var6 = new lk51("LOSSLESS_16_BIT", 5);
        f134265f = lk51Var6;
        lk51 lk51Var7 = new lk51("LOSSLESS_24_BIT", 6);
        f134266g = lk51Var7;
        lk51[] lk51VarArr = {lk51Var, lk51Var2, lk51Var3, lk51Var4, lk51Var5, lk51Var6, lk51Var7};
        f134267h = lk51VarArr;
        f134268i = new nzv(lk51VarArr);
    }

    public static lk51 valueOf(String str) {
        return (lk51) Enum.valueOf(lk51.class, str);
    }

    public static lk51[] values() {
        return (lk51[]) f134267h.clone();
    }
}
