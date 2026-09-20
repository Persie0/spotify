package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ha60 {

    /* JADX INFO: renamed from: a */
    public static final ha60 f89134a;

    /* JADX INFO: renamed from: b */
    public static final ha60 f89135b;

    /* JADX INFO: renamed from: c */
    public static final ha60 f89136c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ha60[] f89137d;

    static {
        ha60 ha60Var = new ha60("BASIC", 0);
        f89134a = ha60Var;
        ha60 ha60Var2 = new ha60("EXPANDED", 1);
        f89135b = ha60Var2;
        ha60 ha60Var3 = new ha60("DISABLED", 2);
        f89136c = ha60Var3;
        f89137d = new ha60[]{ha60Var, ha60Var2, ha60Var3};
    }

    public static ha60 valueOf(String str) {
        return (ha60) Enum.valueOf(ha60.class, str);
    }

    public static ha60[] values() {
        return (ha60[]) f89137d.clone();
    }
}
