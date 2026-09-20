package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qrm0 {

    /* JADX INFO: renamed from: a */
    public static final qrm0 f191883a;

    /* JADX INFO: renamed from: b */
    public static final qrm0 f191884b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qrm0[] f191885c;

    static {
        qrm0 qrm0Var = new qrm0("Main", 0);
        f191883a = qrm0Var;
        qrm0 qrm0Var2 = new qrm0("Auxiliary", 1);
        f191884b = qrm0Var2;
        f191885c = new qrm0[]{qrm0Var, qrm0Var2, new qrm0("Chrome", 2)};
    }

    public static qrm0 valueOf(String str) {
        return (qrm0) Enum.valueOf(qrm0.class, str);
    }

    public static qrm0[] values() {
        return (qrm0[]) f191885c.clone();
    }
}
