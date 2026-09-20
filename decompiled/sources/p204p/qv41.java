package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class qv41 {

    /* JADX INFO: renamed from: a */
    public static final qv41 f192868a;

    /* JADX INFO: renamed from: b */
    public static final qv41 f192869b;

    /* JADX INFO: renamed from: c */
    public static final qv41 f192870c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qv41[] f192871d;

    static {
        qv41 qv41Var = new qv41("Initializing", 0);
        f192868a = qv41Var;
        qv41 qv41Var2 = new qv41("Idle", 1);
        f192869b = qv41Var2;
        qv41 qv41Var3 = new qv41("Loading", 2);
        f192870c = qv41Var3;
        f192871d = new qv41[]{qv41Var, qv41Var2, qv41Var3};
    }

    public static qv41 valueOf(String str) {
        return (qv41) Enum.valueOf(qv41.class, str);
    }

    public static qv41[] values() {
        return (qv41[]) f192871d.clone();
    }
}
