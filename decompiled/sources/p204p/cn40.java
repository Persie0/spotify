package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cn40 {

    /* JADX INFO: renamed from: a */
    public static final cn40 f39888a;

    /* JADX INFO: renamed from: b */
    public static final cn40 f39889b;

    /* JADX INFO: renamed from: c */
    public static final cn40 f39890c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cn40[] f39891d;

    static {
        cn40 cn40Var = new cn40("AUTO", 0);
        f39888a = cn40Var;
        cn40 cn40Var2 = new cn40("CONNECT", 1);
        f39889b = cn40Var2;
        cn40 cn40Var3 = new cn40("CAST", 2);
        f39890c = cn40Var3;
        f39891d = new cn40[]{cn40Var, cn40Var2, cn40Var3};
    }

    public static cn40 valueOf(String str) {
        return (cn40) Enum.valueOf(cn40.class, str);
    }

    public static cn40[] values() {
        return (cn40[]) f39891d.clone();
    }
}
