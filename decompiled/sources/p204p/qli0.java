package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class qli0 {

    /* JADX INFO: renamed from: a */
    public static final qli0 f189868a;

    /* JADX INFO: renamed from: b */
    public static final qli0 f189869b;

    /* JADX INFO: renamed from: c */
    public static final qli0 f189870c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qli0[] f189871d;

    static {
        qli0 qli0Var = new qli0("Linear", 0);
        f189868a = qli0Var;
        qli0 qli0Var2 = new qli0("Shuffle", 1);
        f189869b = qli0Var2;
        qli0 qli0Var3 = new qli0("SmartShuffle", 2);
        f189870c = qli0Var3;
        f189871d = new qli0[]{qli0Var, qli0Var2, qli0Var3};
    }

    public static qli0 valueOf(String str) {
        return (qli0) Enum.valueOf(qli0.class, str);
    }

    public static qli0[] values() {
        return (qli0[]) f189871d.clone();
    }
}
