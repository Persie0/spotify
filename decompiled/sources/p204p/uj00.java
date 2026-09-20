package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uj00 {

    /* JADX INFO: renamed from: a */
    public static final uj00 f230850a;

    /* JADX INFO: renamed from: b */
    public static final uj00 f230851b;

    /* JADX INFO: renamed from: c */
    public static final uj00 f230852c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uj00[] f230853d;

    static {
        uj00 uj00Var = new uj00("CACHE", 0);
        f230850a = uj00Var;
        uj00 uj00Var2 = new uj00("NETWORK", 1);
        f230851b = uj00Var2;
        uj00 uj00Var3 = new uj00("CACHE_OR_NETWORK", 2);
        f230852c = uj00Var3;
        f230853d = new uj00[]{uj00Var, uj00Var2, uj00Var3};
    }

    public static uj00 valueOf(String str) {
        return (uj00) Enum.valueOf(uj00.class, str);
    }

    public static uj00[] values() {
        return (uj00[]) f230853d.clone();
    }
}
