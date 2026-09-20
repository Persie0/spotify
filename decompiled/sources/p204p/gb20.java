package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gb20 {

    /* JADX INFO: renamed from: a */
    public static final gb20 f78173a;

    /* JADX INFO: renamed from: b */
    public static final gb20 f78174b;

    /* JADX INFO: renamed from: c */
    public static final gb20 f78175c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ gb20[] f78176d;

    static {
        gb20 gb20Var = new gb20("Cursor", 0);
        f78173a = gb20Var;
        gb20 gb20Var2 = new gb20("SelectionStart", 1);
        f78174b = gb20Var2;
        gb20 gb20Var3 = new gb20("SelectionEnd", 2);
        f78175c = gb20Var3;
        f78176d = new gb20[]{gb20Var, gb20Var2, gb20Var3};
    }

    public static gb20 valueOf(String str) {
        return (gb20) Enum.valueOf(gb20.class, str);
    }

    public static gb20[] values() {
        return (gb20[]) f78176d.clone();
    }
}
