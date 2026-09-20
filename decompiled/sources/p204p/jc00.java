package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class jc00 {

    /* JADX INFO: renamed from: a */
    public static final jc00 f110930a;

    /* JADX INFO: renamed from: b */
    public static final jc00 f110931b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jc00[] f110932c;

    static {
        jc00 jc00Var = new jc00("ExplorePremiumClicked", 0);
        f110930a = jc00Var;
        jc00 jc00Var2 = new jc00("SystemDismissed", 1);
        f110931b = jc00Var2;
        f110932c = new jc00[]{jc00Var, jc00Var2};
    }

    public static jc00 valueOf(String str) {
        return (jc00) Enum.valueOf(jc00.class, str);
    }

    public static jc00[] values() {
        return (jc00[]) f110932c.clone();
    }
}
