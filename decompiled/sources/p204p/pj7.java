package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class pj7 {

    /* JADX INFO: renamed from: a */
    public static final pj7 f178190a;

    /* JADX INFO: renamed from: b */
    public static final pj7 f178191b;

    /* JADX INFO: renamed from: c */
    public static final pj7 f178192c;

    /* JADX INFO: renamed from: d */
    public static final pj7 f178193d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ pj7[] f178194e;

    static {
        pj7 pj7Var = new pj7("HOME", 0);
        f178190a = pj7Var;
        pj7 pj7Var2 = new pj7("ACCOUNT_SELECTION", 1);
        f178191b = pj7Var2;
        pj7 pj7Var3 = new pj7("ONBOARDING", 2);
        f178192c = pj7Var3;
        pj7 pj7Var4 = new pj7("PREMIUM_UPSELL", 3);
        f178193d = pj7Var4;
        f178194e = new pj7[]{pj7Var, pj7Var2, pj7Var3, pj7Var4};
    }

    public static pj7 valueOf(String str) {
        return (pj7) Enum.valueOf(pj7.class, str);
    }

    public static pj7[] values() {
        return (pj7[]) f178194e.clone();
    }
}
