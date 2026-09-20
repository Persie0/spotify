package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ptm0 {

    /* JADX INFO: renamed from: a */
    public static final ptm0 f181198a;

    /* JADX INFO: renamed from: b */
    public static final ptm0 f181199b;

    /* JADX INFO: renamed from: c */
    public static final ptm0 f181200c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ptm0[] f181201d;

    static {
        ptm0 ptm0Var = new ptm0("ALL", 0);
        f181198a = ptm0Var;
        ptm0 ptm0Var2 = new ptm0("ONLY_NON_SYNTHESIZED", 1);
        f181199b = ptm0Var2;
        ptm0 ptm0Var3 = new ptm0("NONE", 2);
        f181200c = ptm0Var3;
        f181201d = new ptm0[]{ptm0Var, ptm0Var2, ptm0Var3};
    }

    public static ptm0 valueOf(String str) {
        return (ptm0) Enum.valueOf(ptm0.class, str);
    }

    public static ptm0[] values() {
        return (ptm0[]) f181201d.clone();
    }
}
