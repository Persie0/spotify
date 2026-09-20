package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class qzn0 {

    /* JADX INFO: renamed from: a */
    public static final qzn0 f194232a;

    /* JADX INFO: renamed from: b */
    public static final qzn0 f194233b;

    /* JADX INFO: renamed from: c */
    public static final qzn0 f194234c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qzn0[] f194235d;

    static {
        qzn0 qzn0Var = new qzn0("ACCEPTED", 0);
        f194232a = qzn0Var;
        qzn0 qzn0Var2 = new qzn0("FAILED", 1);
        f194233b = qzn0Var2;
        qzn0 qzn0Var3 = new qzn0("BLOCKED_BY_LAUNCHER", 2);
        f194234c = qzn0Var3;
        f194235d = new qzn0[]{qzn0Var, qzn0Var2, qzn0Var3};
    }

    public static qzn0 valueOf(String str) {
        return (qzn0) Enum.valueOf(qzn0.class, str);
    }

    public static qzn0[] values() {
        return (qzn0[]) f194235d.clone();
    }
}
