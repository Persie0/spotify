package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ixe1 {

    /* JADX INFO: renamed from: a */
    public static final ixe1 f106666a;

    /* JADX INFO: renamed from: b */
    public static final ixe1 f106667b;

    /* JADX INFO: renamed from: c */
    public static final ixe1 f106668c;

    /* JADX INFO: renamed from: d */
    public static final ixe1 f106669d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ixe1[] f106670e;

    static {
        ixe1 ixe1Var = new ixe1("RowClicked", 0);
        f106666a = ixe1Var;
        ixe1 ixe1Var2 = new ixe1("Impression", 1);
        f106667b = ixe1Var2;
        ixe1 ixe1Var3 = new ixe1("ContextMenuClicked", 2);
        f106668c = ixe1Var3;
        ixe1 ixe1Var4 = new ixe1("SwipedEnd", 3);
        f106669d = ixe1Var4;
        f106670e = new ixe1[]{ixe1Var, ixe1Var2, ixe1Var3, ixe1Var4};
    }

    public static ixe1 valueOf(String str) {
        return (ixe1) Enum.valueOf(ixe1.class, str);
    }

    public static ixe1[] values() {
        return (ixe1[]) f106670e.clone();
    }
}
