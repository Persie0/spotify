package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class dnq0 {

    /* JADX INFO: renamed from: a */
    public static final dnq0 f50870a;

    /* JADX INFO: renamed from: b */
    public static final dnq0 f50871b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ dnq0[] f50872c;

    static {
        dnq0 dnq0Var = new dnq0("CTAClicked", 0);
        f50870a = dnq0Var;
        dnq0 dnq0Var2 = new dnq0("SecondaryCTAClicked", 1);
        f50871b = dnq0Var2;
        f50872c = new dnq0[]{dnq0Var, dnq0Var2};
    }

    public static dnq0 valueOf(String str) {
        return (dnq0) Enum.valueOf(dnq0.class, str);
    }

    public static dnq0[] values() {
        return (dnq0[]) f50872c.clone();
    }
}
