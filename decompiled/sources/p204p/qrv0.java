package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class qrv0 {

    /* JADX INFO: renamed from: a */
    public static final qrv0 f191916a;

    /* JADX INFO: renamed from: b */
    public static final qrv0 f191917b;

    /* JADX INFO: renamed from: c */
    public static final qrv0 f191918c;

    /* JADX INFO: renamed from: d */
    public static final qrv0 f191919d;

    /* JADX INFO: renamed from: e */
    public static final qrv0 f191920e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qrv0[] f191921f;

    static {
        qrv0 qrv0Var = new qrv0("Unavailable", 0);
        f191916a = qrv0Var;
        qrv0 qrv0Var2 = new qrv0("Ready", 1);
        f191917b = qrv0Var2;
        qrv0 qrv0Var3 = new qrv0("Success", 2);
        f191918c = qrv0Var3;
        qrv0 qrv0Var4 = new qrv0("Loading", 3);
        f191919d = qrv0Var4;
        qrv0 qrv0Var5 = new qrv0("Error", 4);
        f191920e = qrv0Var5;
        f191921f = new qrv0[]{qrv0Var, qrv0Var2, qrv0Var3, qrv0Var4, qrv0Var5};
    }

    public static qrv0 valueOf(String str) {
        return (qrv0) Enum.valueOf(qrv0.class, str);
    }

    public static qrv0[] values() {
        return (qrv0[]) f191921f.clone();
    }
}
