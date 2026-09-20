package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class qx61 {

    /* JADX INFO: renamed from: a */
    public static final qx61 f193527a;

    /* JADX INFO: renamed from: b */
    public static final qx61 f193528b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qx61[] f193529c;

    static {
        qx61 qx61Var = new qx61("CIRCLE", 0);
        f193527a = qx61Var;
        qx61 qx61Var2 = new qx61("SQUARE", 1);
        f193528b = qx61Var2;
        f193529c = new qx61[]{qx61Var, qx61Var2};
    }

    public static qx61 valueOf(String str) {
        return (qx61) Enum.valueOf(qx61.class, str);
    }

    public static qx61[] values() {
        return (qx61[]) f193529c.clone();
    }
}
