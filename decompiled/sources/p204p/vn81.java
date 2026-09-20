package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vn81 {

    /* JADX INFO: renamed from: a */
    public static final vn81 f243021a;

    /* JADX INFO: renamed from: b */
    public static final vn81 f243022b;

    /* JADX INFO: renamed from: c */
    public static final vn81 f243023c;

    /* JADX INFO: renamed from: d */
    public static final vn81 f243024d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ vn81[] f243025e;

    static {
        vn81 vn81Var = new vn81("RowClicked", 0);
        f243021a = vn81Var;
        vn81 vn81Var2 = new vn81("AddClicked", 1);
        f243022b = vn81Var2;
        vn81 vn81Var3 = new vn81("PreviewPlayClicked", 2);
        f243023c = vn81Var3;
        vn81 vn81Var4 = new vn81("PreviewPauseClicked", 3);
        f243024d = vn81Var4;
        f243025e = new vn81[]{vn81Var, vn81Var2, vn81Var3, vn81Var4};
    }

    public static vn81 valueOf(String str) {
        return (vn81) Enum.valueOf(vn81.class, str);
    }

    public static vn81[] values() {
        return (vn81[]) f243025e.clone();
    }
}
