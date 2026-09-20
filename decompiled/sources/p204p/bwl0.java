package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class bwl0 {

    /* JADX INFO: renamed from: a */
    public static final bwl0 f31671a;

    /* JADX INFO: renamed from: b */
    public static final bwl0 f31672b;

    /* JADX INFO: renamed from: c */
    public static final bwl0 f31673c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bwl0[] f31674d;

    static {
        bwl0 bwl0Var = new bwl0("PORTRAIT_ONLY", 0);
        f31671a = bwl0Var;
        bwl0 bwl0Var2 = new bwl0("LANDSCAPE_ONLY", 1);
        f31672b = bwl0Var2;
        bwl0 bwl0Var3 = new bwl0("UNSPECIFIED", 2);
        f31673c = bwl0Var3;
        f31674d = new bwl0[]{bwl0Var, bwl0Var2, bwl0Var3};
    }

    public static bwl0 valueOf(String str) {
        return (bwl0) Enum.valueOf(bwl0.class, str);
    }

    public static bwl0[] values() {
        return (bwl0[]) f31674d.clone();
    }
}
