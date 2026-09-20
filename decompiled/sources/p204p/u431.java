package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class u431 {

    /* JADX INFO: renamed from: a */
    public static final u431 f226571a;

    /* JADX INFO: renamed from: b */
    public static final u431 f226572b;

    /* JADX INFO: renamed from: c */
    public static final u431 f226573c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ u431[] f226574d;

    static {
        u431 u431Var = new u431("AVAILABLE", 0);
        f226571a = u431Var;
        u431 u431Var2 = new u431("FORCED", 1);
        f226572b = u431Var2;
        u431 u431Var3 = new u431("UNAVAILABLE", 2);
        f226573c = u431Var3;
        f226574d = new u431[]{u431Var, u431Var2, u431Var3};
    }

    public static u431 valueOf(String str) {
        return (u431) Enum.valueOf(u431.class, str);
    }

    public static u431[] values() {
        return (u431[]) f226574d.clone();
    }
}
