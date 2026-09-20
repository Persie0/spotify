package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 {

    /* JADX INFO: renamed from: a */
    public static final qv1 f192850a;

    /* JADX INFO: renamed from: b */
    public static final qv1 f192851b;

    /* JADX INFO: renamed from: c */
    public static final qv1 f192852c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qv1[] f192853d;

    static {
        qv1 qv1Var = new qv1("NOT_CONNECTED", 0);
        f192850a = qv1Var;
        qv1 qv1Var2 = new qv1("CONNECTED", 1);
        f192851b = qv1Var2;
        qv1 qv1Var3 = new qv1("CONNECTED_WITH_ADDON_SESSION", 2);
        f192852c = qv1Var3;
        f192853d = new qv1[]{qv1Var, qv1Var2, qv1Var3};
    }

    public static qv1 valueOf(String str) {
        return (qv1) Enum.valueOf(qv1.class, str);
    }

    public static qv1[] values() {
        return (qv1[]) f192853d.clone();
    }
}
