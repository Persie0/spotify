package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class alz0 {

    /* JADX INFO: renamed from: a */
    public static final alz0 f17014a;

    /* JADX INFO: renamed from: b */
    public static final alz0 f17015b;

    /* JADX INFO: renamed from: c */
    public static final alz0 f17016c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ alz0[] f17017d;

    static {
        alz0 alz0Var = new alz0("Hidden", 0);
        f17014a = alz0Var;
        alz0 alz0Var2 = new alz0("Selected", 1);
        f17015b = alz0Var2;
        alz0 alz0Var3 = new alz0("NotSelected", 2);
        f17016c = alz0Var3;
        f17017d = new alz0[]{alz0Var, alz0Var2, alz0Var3};
    }

    public static alz0 valueOf(String str) {
        return (alz0) Enum.valueOf(alz0.class, str);
    }

    public static alz0[] values() {
        return (alz0[]) f17017d.clone();
    }
}
