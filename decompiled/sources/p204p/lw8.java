package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lw8 {

    /* JADX INFO: renamed from: a */
    public static final lw8 f137479a;

    /* JADX INFO: renamed from: b */
    public static final lw8 f137480b;

    /* JADX INFO: renamed from: c */
    public static final lw8 f137481c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ lw8[] f137482d;

    static {
        lw8 lw8Var = new lw8("ALL_SUCCESS", 0);
        f137479a = lw8Var;
        lw8 lw8Var2 = new lw8("PARTIAL_SUCCESS", 1);
        f137480b = lw8Var2;
        lw8 lw8Var3 = new lw8("ALL_FAIL", 2);
        f137481c = lw8Var3;
        f137482d = new lw8[]{lw8Var, lw8Var2, lw8Var3};
    }

    public static lw8 valueOf(String str) {
        return (lw8) Enum.valueOf(lw8.class, str);
    }

    public static lw8[] values() {
        return (lw8[]) f137482d.clone();
    }
}
