package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class bdb1 {

    /* JADX INFO: renamed from: a */
    public static final bdb1 f26071a;

    /* JADX INFO: renamed from: b */
    public static final bdb1 f26072b;

    /* JADX INFO: renamed from: c */
    public static final bdb1 f26073c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bdb1[] f26074d;

    static {
        bdb1 bdb1Var = new bdb1("VERIFIED", 0);
        f26071a = bdb1Var;
        bdb1 bdb1Var2 = new bdb1("INELIGIBLE", 1);
        f26072b = bdb1Var2;
        bdb1 bdb1Var3 = new bdb1("VERIFICATION_NEEDED", 2);
        f26073c = bdb1Var3;
        f26074d = new bdb1[]{bdb1Var, bdb1Var2, bdb1Var3};
    }

    public static bdb1 valueOf(String str) {
        return (bdb1) Enum.valueOf(bdb1.class, str);
    }

    public static bdb1[] values() {
        return (bdb1[]) f26074d.clone();
    }
}
