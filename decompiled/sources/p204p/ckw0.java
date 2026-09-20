package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ckw0 {

    /* JADX INFO: renamed from: a */
    public static final ckw0 f39102a;

    /* JADX INFO: renamed from: b */
    public static final ckw0 f39103b;

    /* JADX INFO: renamed from: c */
    public static final ckw0 f39104c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ckw0[] f39105d;

    static {
        ckw0 ckw0Var = new ckw0("AUTOMATIC", 0);
        f39102a = ckw0Var;
        ckw0 ckw0Var2 = new ckw0("HARDWARE", 1);
        f39103b = ckw0Var2;
        ckw0 ckw0Var3 = new ckw0("SOFTWARE", 2);
        f39104c = ckw0Var3;
        f39105d = new ckw0[]{ckw0Var, ckw0Var2, ckw0Var3};
    }

    public static ckw0 valueOf(String str) {
        return (ckw0) Enum.valueOf(ckw0.class, str);
    }

    public static ckw0[] values() {
        return (ckw0[]) f39105d.clone();
    }
}
