package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qd2 {

    /* JADX INFO: renamed from: a */
    public static final qd2 f187459a;

    /* JADX INFO: renamed from: b */
    public static final qd2 f187460b;

    /* JADX INFO: renamed from: c */
    public static final qd2 f187461c;

    /* JADX INFO: renamed from: d */
    public static final qd2 f187462d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ qd2[] f187463e;

    static {
        qd2 qd2Var = new qd2("GOOGLE_PLAY", 0);
        f187459a = qd2Var;
        qd2 qd2Var2 = new qd2("SAMSUNG", 1);
        f187460b = qd2Var2;
        qd2 qd2Var3 = new qd2("AMAZON", 2);
        f187461c = qd2Var3;
        qd2 qd2Var4 = new qd2("UNKNOWN", 3);
        f187462d = qd2Var4;
        f187463e = new qd2[]{qd2Var, qd2Var2, qd2Var3, qd2Var4};
    }

    public static qd2 valueOf(String str) {
        return (qd2) Enum.valueOf(qd2.class, str);
    }

    public static qd2[] values() {
        return (qd2[]) f187463e.clone();
    }
}
