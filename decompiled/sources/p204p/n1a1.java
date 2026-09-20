package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class n1a1 {

    /* JADX INFO: renamed from: a */
    public static final n1a1 f149381a;

    /* JADX INFO: renamed from: b */
    public static final n1a1 f149382b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ n1a1[] f149383c;

    static {
        n1a1 n1a1Var = new n1a1("UndoClicked", 0);
        f149381a = n1a1Var;
        n1a1 n1a1Var2 = new n1a1("Dismissed", 1);
        f149382b = n1a1Var2;
        f149383c = new n1a1[]{n1a1Var, n1a1Var2};
    }

    public static n1a1 valueOf(String str) {
        return (n1a1) Enum.valueOf(n1a1.class, str);
    }

    public static n1a1[] values() {
        return (n1a1[]) f149383c.clone();
    }
}
