package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class nin0 {

    /* JADX INFO: renamed from: a */
    public static final nin0 f154284a;

    /* JADX INFO: renamed from: b */
    public static final nin0 f154285b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nin0[] f154286c;

    static {
        nin0 nin0Var = new nin0("Accept", 0);
        f154284a = nin0Var;
        nin0 nin0Var2 = new nin0("Deny", 1);
        f154285b = nin0Var2;
        f154286c = new nin0[]{nin0Var, nin0Var2};
    }

    public static nin0 valueOf(String str) {
        return (nin0) Enum.valueOf(nin0.class, str);
    }

    public static nin0[] values() {
        return (nin0[]) f154286c.clone();
    }
}
