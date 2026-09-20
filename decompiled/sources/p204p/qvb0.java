package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class qvb0 {

    /* JADX INFO: renamed from: a */
    public static final qvb0 f192958a;

    /* JADX INFO: renamed from: b */
    public static final qvb0 f192959b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qvb0[] f192960c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f192961d;

    static {
        qvb0 qvb0Var = new qvb0("VERTICAL", 0);
        f192958a = qvb0Var;
        qvb0 qvb0Var2 = new qvb0("HORIZONTAL", 1);
        qvb0 qvb0Var3 = new qvb0("LARGE", 2);
        f192959b = qvb0Var3;
        qvb0[] qvb0VarArr = {qvb0Var, qvb0Var2, qvb0Var3};
        f192960c = qvb0VarArr;
        f192961d = new nzv(qvb0VarArr);
    }

    public static qvb0 valueOf(String str) {
        return (qvb0) Enum.valueOf(qvb0.class, str);
    }

    public static qvb0[] values() {
        return (qvb0[]) f192960c.clone();
    }
}
