package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class mcx0 {

    /* JADX INFO: renamed from: a */
    public static final mcx0 f142262a;

    /* JADX INFO: renamed from: b */
    public static final mcx0 f142263b;

    /* JADX INFO: renamed from: c */
    public static final mcx0 f142264c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ mcx0[] f142265d;

    static {
        mcx0 mcx0Var = new mcx0("POSITIVE", 0);
        f142262a = mcx0Var;
        mcx0 mcx0Var2 = new mcx0("NEGATIVE", 1);
        f142263b = mcx0Var2;
        mcx0 mcx0Var3 = new mcx0("CANCEL", 2);
        f142264c = mcx0Var3;
        f142265d = new mcx0[]{mcx0Var, mcx0Var2, mcx0Var3};
    }

    public static mcx0 valueOf(String str) {
        return (mcx0) Enum.valueOf(mcx0.class, str);
    }

    public static mcx0[] values() {
        return (mcx0[]) f142265d.clone();
    }
}
