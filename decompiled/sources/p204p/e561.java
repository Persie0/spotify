package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e561 {

    /* JADX INFO: renamed from: a */
    public static final e561 f56302a;

    /* JADX INFO: renamed from: b */
    public static final e561 f56303b;

    /* JADX INFO: renamed from: c */
    public static final e561 f56304c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ e561[] f56305d;

    static {
        e561 e561Var = new e561("IsExplicit", 0);
        f56302a = e561Var;
        e561 e561Var2 = new e561("IsBookLocked", 1);
        f56303b = e561Var2;
        e561 e561Var3 = new e561("Granted", 2);
        f56304c = e561Var3;
        f56305d = new e561[]{e561Var, e561Var2, e561Var3};
    }

    public static e561 valueOf(String str) {
        return (e561) Enum.valueOf(e561.class, str);
    }

    public static e561[] values() {
        return (e561[]) f56305d.clone();
    }
}
