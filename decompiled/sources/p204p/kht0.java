package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kht0 {

    /* JADX INFO: renamed from: a */
    public static final kht0 f122721a;

    /* JADX INFO: renamed from: b */
    public static final kht0 f122722b;

    /* JADX INFO: renamed from: c */
    public static final kht0 f122723c;

    /* JADX INFO: renamed from: d */
    public static final kht0 f122724d;

    /* JADX INFO: renamed from: e */
    public static final kht0 f122725e;

    /* JADX INFO: renamed from: f */
    public static final kht0 f122726f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ kht0[] f122727g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ nzv f122728h;

    static {
        kht0 kht0Var = new kht0("STANDARD", 0);
        f122721a = kht0Var;
        kht0 kht0Var2 = new kht0("STANDARD_WITH_ALL_UPSELLS", 1);
        f122722b = kht0Var2;
        kht0 kht0Var3 = new kht0("STANDARD_WITH_MULTI_TIERED_UPSELLS", 2);
        f122723c = kht0Var3;
        kht0 kht0Var4 = new kht0("VERY_HIGH", 3);
        f122724d = kht0Var4;
        kht0 kht0Var5 = new kht0("VERY_HIGH_WITH_MULTI_TIERED_UPSELLS", 4);
        f122725e = kht0Var5;
        kht0 kht0Var6 = new kht0("LOSSLESS", 5);
        f122726f = kht0Var6;
        kht0[] kht0VarArr = {kht0Var, kht0Var2, kht0Var3, kht0Var4, kht0Var5, kht0Var6};
        f122727g = kht0VarArr;
        f122728h = new nzv(kht0VarArr);
    }

    public static kht0 valueOf(String str) {
        return (kht0) Enum.valueOf(kht0.class, str);
    }

    public static kht0[] values() {
        return (kht0[]) f122727g.clone();
    }
}
