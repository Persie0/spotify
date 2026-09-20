package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ima0 {

    /* JADX INFO: renamed from: a */
    public static final ima0 f103653a;

    /* JADX INFO: renamed from: b */
    public static final ima0 f103654b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ima0[] f103655c;

    static {
        ima0 ima0Var = new ima0("SUCCEEDED", 0);
        f103653a = ima0Var;
        ima0 ima0Var2 = new ima0("POST_FAILED", 1);
        f103654b = ima0Var2;
        f103655c = new ima0[]{ima0Var, ima0Var2};
    }

    public static ima0 valueOf(String str) {
        return (ima0) Enum.valueOf(ima0.class, str);
    }

    public static ima0[] values() {
        return (ima0[]) f103655c.clone();
    }
}
