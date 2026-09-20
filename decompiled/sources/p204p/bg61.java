package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class bg61 {

    /* JADX INFO: renamed from: a */
    public static final bg61 f26849a;

    /* JADX INFO: renamed from: b */
    public static final bg61 f26850b;

    /* JADX INFO: renamed from: c */
    public static final bg61 f26851c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bg61[] f26852d;

    static {
        bg61 bg61Var = new bg61("Word", 0);
        f26849a = bg61Var;
        bg61 bg61Var2 = new bg61("Sentenced", 1);
        f26850b = bg61Var2;
        bg61 bg61Var3 = new bg61("Static", 2);
        f26851c = bg61Var3;
        f26852d = new bg61[]{bg61Var, bg61Var2, bg61Var3};
    }

    public static bg61 valueOf(String str) {
        return (bg61) Enum.valueOf(bg61.class, str);
    }

    public static bg61[] values() {
        return (bg61[]) f26852d.clone();
    }
}
