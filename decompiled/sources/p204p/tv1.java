package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tv1 {

    /* JADX INFO: renamed from: a */
    public static final tv1 f224023a;

    /* JADX INFO: renamed from: b */
    public static final tv1 f224024b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tv1[] f224025c;

    static {
        tv1 tv1Var = new tv1("UNKNOWN", 0);
        f224023a = tv1Var;
        tv1 tv1Var2 = new tv1("RECORDING", 1);
        f224024b = tv1Var2;
        f224025c = new tv1[]{tv1Var, tv1Var2};
    }

    public static tv1 valueOf(String str) {
        return (tv1) Enum.valueOf(tv1.class, str);
    }

    public static tv1[] values() {
        return (tv1[]) f224025c.clone();
    }
}
