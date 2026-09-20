package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class yjj0 {

    /* JADX INFO: renamed from: a */
    public static final yjj0 f273378a;

    /* JADX INFO: renamed from: b */
    public static final yjj0 f273379b;

    /* JADX INFO: renamed from: c */
    public static final yjj0 f273380c;

    /* JADX INFO: renamed from: d */
    public static final yjj0 f273381d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ yjj0[] f273382e;

    static {
        yjj0 yjj0Var = new yjj0("FeatureDisabled", 0);
        f273378a = yjj0Var;
        yjj0 yjj0Var2 = new yjj0("Loading", 1);
        f273379b = yjj0Var2;
        yjj0 yjj0Var3 = new yjj0("OptedIn", 2);
        f273380c = yjj0Var3;
        yjj0 yjj0Var4 = new yjj0("OptedOut", 3);
        f273381d = yjj0Var4;
        f273382e = new yjj0[]{yjj0Var, yjj0Var2, yjj0Var3, yjj0Var4};
    }

    public static yjj0 valueOf(String str) {
        return (yjj0) Enum.valueOf(yjj0.class, str);
    }

    public static yjj0[] values() {
        return (yjj0[]) f273382e.clone();
    }
}
