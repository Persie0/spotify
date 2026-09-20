package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class fgp0 {

    /* JADX INFO: renamed from: a */
    public static final fgp0 f69379a;

    /* JADX INFO: renamed from: b */
    public static final fgp0 f69380b;

    /* JADX INFO: renamed from: c */
    public static final fgp0 f69381c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fgp0[] f69382d;

    static {
        fgp0 fgp0Var = new fgp0("RowClicked", 0);
        f69379a = fgp0Var;
        fgp0 fgp0Var2 = new fgp0("AddToLibraryClicked", 1);
        f69380b = fgp0Var2;
        fgp0 fgp0Var3 = new fgp0("ContextMenuClicked", 2);
        f69381c = fgp0Var3;
        f69382d = new fgp0[]{fgp0Var, fgp0Var2, fgp0Var3};
    }

    public static fgp0 valueOf(String str) {
        return (fgp0) Enum.valueOf(fgp0.class, str);
    }

    public static fgp0[] values() {
        return (fgp0[]) f69382d.clone();
    }
}
