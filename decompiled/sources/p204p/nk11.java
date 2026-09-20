package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nk11 {

    /* JADX INFO: renamed from: a */
    public static final nk11 f154751a;

    /* JADX INFO: renamed from: b */
    public static final nk11 f154752b;

    /* JADX INFO: renamed from: c */
    public static final nk11 f154753c;

    /* JADX INFO: renamed from: d */
    public static final nk11 f154754d;

    /* JADX INFO: renamed from: e */
    public static final nk11 f154755e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nk11[] f154756f;

    static {
        nk11 nk11Var = new nk11("UNKNOWN", 0);
        f154751a = nk11Var;
        nk11 nk11Var2 = new nk11("ANCHOR_PAYWALL", 1);
        f154752b = nk11Var2;
        nk11 nk11Var3 = new nk11("OAP_OTP", 2);
        f154753c = nk11Var3;
        nk11 nk11Var4 = new nk11("OAP_LINKING", 3);
        f154754d = nk11Var4;
        nk11 nk11Var5 = new nk11("AUDIOBOOK_DIRECT_SALES", 4);
        nk11 nk11Var6 = new nk11("ABP", 5);
        nk11 nk11Var7 = new nk11("AUDIOBOOK_PROMOTION", 6);
        nk11 nk11Var8 = new nk11("RESERVED_LEARNING", 7);
        nk11 nk11Var9 = new nk11("PREMIUM_KPOP_EARLY_ACCESS", 8);
        nk11 nk11Var10 = new nk11("OPAL", 9);
        f154755e = nk11Var10;
        f154756f = new nk11[]{nk11Var, nk11Var2, nk11Var3, nk11Var4, nk11Var5, nk11Var6, nk11Var7, nk11Var8, nk11Var9, nk11Var10};
    }

    public static nk11 valueOf(String str) {
        return (nk11) Enum.valueOf(nk11.class, str);
    }

    public static nk11[] values() {
        return (nk11[]) f154756f.clone();
    }
}
