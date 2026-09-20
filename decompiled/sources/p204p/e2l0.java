package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class e2l0 {

    /* JADX INFO: renamed from: a */
    public static final e2l0 f55481a;

    /* JADX INFO: renamed from: b */
    public static final e2l0 f55482b;

    /* JADX INFO: renamed from: c */
    public static final e2l0 f55483c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ e2l0[] f55484d;

    static {
        e2l0 e2l0Var = new e2l0("RowClicked", 0);
        f55481a = e2l0Var;
        e2l0 e2l0Var2 = new e2l0("LongClicked", 1);
        f55482b = e2l0Var2;
        e2l0 e2l0Var3 = new e2l0("ContextMenuClicked", 2);
        f55483c = e2l0Var3;
        f55484d = new e2l0[]{e2l0Var, e2l0Var2, e2l0Var3};
    }

    public static e2l0 valueOf(String str) {
        return (e2l0) Enum.valueOf(e2l0.class, str);
    }

    public static e2l0[] values() {
        return (e2l0[]) f55484d.clone();
    }
}
