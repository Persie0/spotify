package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fw21 {

    /* JADX INFO: renamed from: a */
    public static final fw21 f73923a;

    /* JADX INFO: renamed from: b */
    public static final fw21 f73924b;

    /* JADX INFO: renamed from: c */
    public static final fw21 f73925c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fw21[] f73926d;

    static {
        fw21 fw21Var = new fw21("NPV", 0);
        f73923a = fw21Var;
        fw21 fw21Var2 = new fw21("NPB", 1);
        f73924b = fw21Var2;
        fw21 fw21Var3 = new fw21("NP_MINI", 2);
        f73925c = fw21Var3;
        f73926d = new fw21[]{fw21Var, fw21Var2, fw21Var3};
    }

    public static fw21 valueOf(String str) {
        return (fw21) Enum.valueOf(fw21.class, str);
    }

    public static fw21[] values() {
        return (fw21[]) f73926d.clone();
    }
}
