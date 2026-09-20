package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class aha1 {

    /* JADX INFO: renamed from: a */
    public static final aha1 f15654a;

    /* JADX INFO: renamed from: b */
    public static final aha1 f15655b;

    /* JADX INFO: renamed from: c */
    public static final aha1 f15656c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ aha1[] f15657d;

    static {
        aha1 aha1Var = new aha1("CtaClicked", 0);
        f15654a = aha1Var;
        aha1 aha1Var2 = new aha1("DismissBtnClicked", 1);
        f15655b = aha1Var2;
        aha1 aha1Var3 = new aha1("Dismissed", 2);
        f15656c = aha1Var3;
        f15657d = new aha1[]{aha1Var, aha1Var2, aha1Var3};
    }

    public static aha1 valueOf(String str) {
        return (aha1) Enum.valueOf(aha1.class, str);
    }

    public static aha1[] values() {
        return (aha1[]) f15657d.clone();
    }
}
