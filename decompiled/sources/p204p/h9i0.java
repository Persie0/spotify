package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h9i0 {

    /* JADX INFO: renamed from: a */
    public static final h9i0 f88981a;

    /* JADX INFO: renamed from: b */
    public static final h9i0 f88982b;

    /* JADX INFO: renamed from: c */
    public static final h9i0 f88983c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ h9i0[] f88984d;

    static {
        h9i0 h9i0Var = new h9i0("CardClicked", 0);
        f88981a = h9i0Var;
        h9i0 h9i0Var2 = new h9i0("PrimaryButtonClicked", 1);
        f88982b = h9i0Var2;
        h9i0 h9i0Var3 = new h9i0("AatEntryPointClicked", 2);
        f88983c = h9i0Var3;
        f88984d = new h9i0[]{h9i0Var, h9i0Var2, h9i0Var3};
    }

    public static h9i0 valueOf(String str) {
        return (h9i0) Enum.valueOf(h9i0.class, str);
    }

    public static h9i0[] values() {
        return (h9i0[]) f88984d.clone();
    }
}
