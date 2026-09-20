package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c9l0 {

    /* JADX INFO: renamed from: a */
    public static final c9l0 f35584a;

    /* JADX INFO: renamed from: b */
    public static final c9l0 f35585b;

    /* JADX INFO: renamed from: c */
    public static final c9l0 f35586c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ c9l0[] f35587d;

    static {
        c9l0 c9l0Var = new c9l0("UNKNOWN", 0);
        f35584a = c9l0Var;
        c9l0 c9l0Var2 = new c9l0("ACTIVE", 1);
        f35585b = c9l0Var2;
        c9l0 c9l0Var3 = new c9l0("INACTIVE", 2);
        f35586c = c9l0Var3;
        f35587d = new c9l0[]{c9l0Var, c9l0Var2, c9l0Var3};
    }

    public static c9l0 valueOf(String str) {
        return (c9l0) Enum.valueOf(c9l0.class, str);
    }

    public static c9l0[] values() {
        return (c9l0[]) f35587d.clone();
    }
}
