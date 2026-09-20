package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hrd0 {

    /* JADX INFO: renamed from: a */
    public static final hrd0 f94414a;

    /* JADX INFO: renamed from: b */
    public static final hrd0 f94415b;

    /* JADX INFO: renamed from: c */
    public static final hrd0 f94416c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hrd0[] f94417d;

    static {
        hrd0 hrd0Var = new hrd0("NONE", 0);
        f94414a = hrd0Var;
        hrd0 hrd0Var2 = new hrd0("ONE", 1);
        f94415b = hrd0Var2;
        hrd0 hrd0Var3 = new hrd0("ALL", 2);
        f94416c = hrd0Var3;
        f94417d = new hrd0[]{hrd0Var, hrd0Var2, hrd0Var3};
    }

    public static hrd0 valueOf(String str) {
        return (hrd0) Enum.valueOf(hrd0.class, str);
    }

    public static hrd0[] values() {
        return (hrd0[]) f94417d.clone();
    }
}
