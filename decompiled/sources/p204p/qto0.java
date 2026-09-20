package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qto0 {

    /* JADX INFO: renamed from: a */
    public static final qto0 f192423a;

    /* JADX INFO: renamed from: b */
    public static final qto0 f192424b;

    /* JADX INFO: renamed from: c */
    public static final qto0 f192425c;

    /* JADX INFO: renamed from: d */
    public static final qto0 f192426d;

    /* JADX INFO: renamed from: e */
    public static final qto0 f192427e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qto0[] f192428f;

    static {
        qto0 qto0Var = new qto0("Explicit", 0);
        f192423a = qto0Var;
        qto0 qto0Var2 = new qto0("Age", 1);
        f192424b = qto0Var2;
        qto0 qto0Var3 = new qto0("UnavailableOffline", 2);
        f192425c = qto0Var3;
        qto0 qto0Var4 = new qto0("BlockedByAccountManager", 3);
        f192426d = qto0Var4;
        qto0 qto0Var5 = new qto0("Unknown", 4);
        f192427e = qto0Var5;
        f192428f = new qto0[]{qto0Var, qto0Var2, qto0Var3, qto0Var4, qto0Var5};
    }

    public static qto0 valueOf(String str) {
        return (qto0) Enum.valueOf(qto0.class, str);
    }

    public static qto0[] values() {
        return (qto0[]) f192428f.clone();
    }
}
