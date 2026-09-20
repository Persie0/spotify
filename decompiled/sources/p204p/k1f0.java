package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class k1f0 {

    /* JADX INFO: renamed from: a */
    public static final k1f0 f118311a;

    /* JADX INFO: renamed from: b */
    public static final k1f0 f118312b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ k1f0[] f118313c;

    static {
        k1f0 k1f0Var = new k1f0("RetryButtonClicked", 0);
        f118311a = k1f0Var;
        k1f0 k1f0Var2 = new k1f0("CloseButtonClicked", 1);
        f118312b = k1f0Var2;
        f118313c = new k1f0[]{k1f0Var, k1f0Var2};
    }

    public static k1f0 valueOf(String str) {
        return (k1f0) Enum.valueOf(k1f0.class, str);
    }

    public static k1f0[] values() {
        return (k1f0[]) f118313c.clone();
    }
}
