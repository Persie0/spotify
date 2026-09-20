package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ln21 {

    /* JADX INFO: renamed from: a */
    public static final ln21 f135075a;

    /* JADX INFO: renamed from: b */
    public static final ln21 f135076b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ln21[] f135077c;

    static {
        ln21 ln21Var = new ln21("LANGUAGE_ONBOARDING", 0);
        f135075a = ln21Var;
        ln21 ln21Var2 = new ln21("TO_SKIPPABLE", 1);
        f135076b = ln21Var2;
        f135077c = new ln21[]{ln21Var, ln21Var2};
    }

    public static ln21 valueOf(String str) {
        return (ln21) Enum.valueOf(ln21.class, str);
    }

    public static ln21[] values() {
        return (ln21[]) f135077c.clone();
    }
}
