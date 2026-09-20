package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class qky0 {

    /* JADX INFO: renamed from: a */
    public static final qky0 f189668a;

    /* JADX INFO: renamed from: b */
    public static final qky0 f189669b;

    /* JADX INFO: renamed from: c */
    public static final qky0 f189670c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qky0[] f189671d;

    static {
        qky0 qky0Var = new qky0("BOTH", 0);
        f189668a = qky0Var;
        qky0 qky0Var2 = new qky0("HORIZONTAL", 1);
        f189669b = qky0Var2;
        qky0 qky0Var3 = new qky0("VERTICAL", 2);
        f189670c = qky0Var3;
        f189671d = new qky0[]{qky0Var, qky0Var2, qky0Var3};
    }

    public static qky0 valueOf(String str) {
        return (qky0) Enum.valueOf(qky0.class, str);
    }

    public static qky0[] values() {
        return (qky0[]) f189671d.clone();
    }
}
