package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class qmd1 {
    public static final pmd1 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f190202a;

    /* JADX INFO: renamed from: b */
    public static final qmd1 f190203b;

    /* JADX INFO: renamed from: c */
    public static final qmd1 f190204c;

    /* JADX INFO: renamed from: d */
    public static final qmd1 f190205d;

    /* JADX INFO: renamed from: e */
    public static final qmd1 f190206e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qmd1[] f190207f;

    static {
        qmd1 qmd1Var = new qmd1("NO_URL", 0);
        f190203b = qmd1Var;
        qmd1 qmd1Var2 = new qmd1("NO_URL_DELAYED", 1);
        f190204c = qmd1Var2;
        qmd1 qmd1Var3 = new qmd1("SHOW_WEB", 2);
        f190205d = qmd1Var3;
        qmd1 qmd1Var4 = new qmd1("WEB_ERROR", 3);
        f190206e = qmd1Var4;
        f190207f = new qmd1[]{qmd1Var, qmd1Var2, qmd1Var3, qmd1Var4};
        Companion = new pmd1();
        f190202a = q3d0.m72078I(2, rfd1.f198619g);
    }

    public static qmd1 valueOf(String str) {
        return (qmd1) Enum.valueOf(qmd1.class, str);
    }

    public static qmd1[] values() {
        return (qmd1[]) f190207f.clone();
    }
}
