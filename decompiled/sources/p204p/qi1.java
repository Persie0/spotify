package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class qi1 {

    /* JADX INFO: renamed from: a */
    public static final qi1 f188892a;

    /* JADX INFO: renamed from: b */
    public static final qi1 f188893b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qi1[] f188894c;

    static {
        qi1 qi1Var = new qi1("ADD", 0);
        f188892a = qi1Var;
        qi1 qi1Var2 = new qi1("ADDED", 1);
        f188893b = qi1Var2;
        f188894c = new qi1[]{qi1Var, qi1Var2};
    }

    public static qi1 valueOf(String str) {
        return (qi1) Enum.valueOf(qi1.class, str);
    }

    public static qi1[] values() {
        return (qi1[]) f188894c.clone();
    }
}
