package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class hvf0 {

    /* JADX INFO: renamed from: a */
    public static final hvf0 f95704a;

    /* JADX INFO: renamed from: b */
    public static final hvf0 f95705b;

    /* JADX INFO: renamed from: c */
    public static final hvf0 f95706c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hvf0[] f95707d;

    static {
        hvf0 hvf0Var = new hvf0("OnGoBackButtonClicked", 0);
        f95704a = hvf0Var;
        hvf0 hvf0Var2 = new hvf0("OnEditMixOrderButtonClicked", 1);
        f95705b = hvf0Var2;
        hvf0 hvf0Var3 = new hvf0("OnDismissRequest", 2);
        f95706c = hvf0Var3;
        f95707d = new hvf0[]{hvf0Var, hvf0Var2, hvf0Var3};
    }

    public static hvf0 valueOf(String str) {
        return (hvf0) Enum.valueOf(hvf0.class, str);
    }

    public static hvf0[] values() {
        return (hvf0[]) f95707d.clone();
    }
}
