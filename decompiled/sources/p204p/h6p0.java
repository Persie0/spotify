package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class h6p0 {

    /* JADX INFO: renamed from: a */
    public static final h6p0 f88213a;

    /* JADX INFO: renamed from: b */
    public static final h6p0 f88214b;

    /* JADX INFO: renamed from: c */
    public static final h6p0 f88215c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ h6p0[] f88216d;

    static {
        h6p0 h6p0Var = new h6p0("FOCUSED_ONLY", 0);
        f88213a = h6p0Var;
        h6p0 h6p0Var2 = new h6p0("FOCUSED_OR_OCCLUDED", 1);
        f88214b = h6p0Var2;
        h6p0 h6p0Var3 = new h6p0("ALWAYS", 2);
        f88215c = h6p0Var3;
        f88216d = new h6p0[]{h6p0Var, h6p0Var2, h6p0Var3};
    }

    public static h6p0 valueOf(String str) {
        return (h6p0) Enum.valueOf(h6p0.class, str);
    }

    public static h6p0[] values() {
        return (h6p0[]) f88216d.clone();
    }
}
