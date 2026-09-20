package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class udj0 {

    /* JADX INFO: renamed from: a */
    public static final udj0 f229260a;

    /* JADX INFO: renamed from: b */
    public static final udj0 f229261b;

    /* JADX INFO: renamed from: c */
    public static final udj0 f229262c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ udj0[] f229263d;

    static {
        udj0 udj0Var = new udj0("AlreadyGranted", 0);
        f229260a = udj0Var;
        udj0 udj0Var2 = new udj0("NewlyGranted", 1);
        f229261b = udj0Var2;
        udj0 udj0Var3 = new udj0("NotGranted", 2);
        f229262c = udj0Var3;
        f229263d = new udj0[]{udj0Var, udj0Var2, udj0Var3};
    }

    public static udj0 valueOf(String str) {
        return (udj0) Enum.valueOf(udj0.class, str);
    }

    public static udj0[] values() {
        return (udj0[]) f229263d.clone();
    }
}
