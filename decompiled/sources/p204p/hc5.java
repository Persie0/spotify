package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hc5 {

    /* JADX INFO: renamed from: a */
    public static final hc5 f89696a;

    /* JADX INFO: renamed from: b */
    public static final hc5 f89697b;

    /* JADX INFO: renamed from: c */
    public static final hc5 f89698c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hc5[] f89699d;

    static {
        hc5 hc5Var = new hc5("NoLoggedInUi", 0);
        f89696a = hc5Var;
        hc5 hc5Var2 = new hc5("HasLoggedInUi", 1);
        f89697b = hc5Var2;
        hc5 hc5Var3 = new hc5("Splash", 2);
        f89698c = hc5Var3;
        f89699d = new hc5[]{hc5Var, hc5Var2, hc5Var3};
    }

    public static hc5 valueOf(String str) {
        return (hc5) Enum.valueOf(hc5.class, str);
    }

    public static hc5[] values() {
        return (hc5[]) f89699d.clone();
    }
}
