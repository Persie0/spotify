package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pb20 {

    /* JADX INFO: renamed from: a */
    public static final pb20 f175694a;

    /* JADX INFO: renamed from: b */
    public static final pb20 f175695b;

    /* JADX INFO: renamed from: c */
    public static final pb20 f175696c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pb20[] f175697d;

    static {
        pb20 pb20Var = new pb20("None", 0);
        f175694a = pb20Var;
        pb20 pb20Var2 = new pb20("Selection", 1);
        f175695b = pb20Var2;
        pb20 pb20Var3 = new pb20("Cursor", 2);
        f175696c = pb20Var3;
        f175697d = new pb20[]{pb20Var, pb20Var2, pb20Var3};
    }

    public static pb20 valueOf(String str) {
        return (pb20) Enum.valueOf(pb20.class, str);
    }

    public static pb20[] values() {
        return (pb20[]) f175697d.clone();
    }
}
