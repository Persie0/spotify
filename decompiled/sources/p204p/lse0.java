package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class lse0 {

    /* JADX INFO: renamed from: a */
    public static final lse0 f136522a;

    /* JADX INFO: renamed from: b */
    public static final lse0 f136523b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ lse0[] f136524c;

    static {
        lse0 lse0Var = new lse0("PRESENT", 0);
        f136522a = lse0Var;
        lse0 lse0Var2 = new lse0("DISCARD", 1);
        lse0 lse0Var3 = new lse0("QUEUE", 2);
        f136523b = lse0Var3;
        f136524c = new lse0[]{lse0Var, lse0Var2, lse0Var3};
    }

    public static lse0 valueOf(String str) {
        return (lse0) Enum.valueOf(lse0.class, str);
    }

    public static lse0[] values() {
        return (lse0[]) f136524c.clone();
    }
}
