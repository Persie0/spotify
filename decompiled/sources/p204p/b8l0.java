package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b8l0 {

    /* JADX INFO: renamed from: a */
    public static final b8l0 f24604a;

    /* JADX INFO: renamed from: b */
    public static final b8l0 f24605b;

    /* JADX INFO: renamed from: c */
    public static final b8l0 f24606c;

    /* JADX INFO: renamed from: d */
    public static final b8l0 f24607d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ b8l0[] f24608e;

    static {
        b8l0 b8l0Var = new b8l0("UNKNOWN", 0);
        f24604a = b8l0Var;
        b8l0 b8l0Var2 = new b8l0("NOT_ON_DEMAND", 1);
        f24605b = b8l0Var2;
        b8l0 b8l0Var3 = new b8l0("ON_DEMAND", 2);
        f24606c = b8l0Var3;
        b8l0 b8l0Var4 = new b8l0("ON_DEMAND_NON_MUSIC_ONLY", 3);
        f24607d = b8l0Var4;
        f24608e = new b8l0[]{b8l0Var, b8l0Var2, b8l0Var3, b8l0Var4};
    }

    public static b8l0 valueOf(String str) {
        return (b8l0) Enum.valueOf(b8l0.class, str);
    }

    public static b8l0[] values() {
        return (b8l0[]) f24608e.clone();
    }
}
