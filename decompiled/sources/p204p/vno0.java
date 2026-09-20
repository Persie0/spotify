package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class vno0 {

    /* JADX INFO: renamed from: a */
    public static final vno0 f243189a;

    /* JADX INFO: renamed from: b */
    public static final vno0 f243190b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vno0[] f243191c;

    static {
        vno0 vno0Var = new vno0("RowClicked", 0);
        f243189a = vno0Var;
        vno0 vno0Var2 = new vno0("LearnMoreButtonClicked", 1);
        f243190b = vno0Var2;
        f243191c = new vno0[]{vno0Var, vno0Var2};
    }

    public static vno0 valueOf(String str) {
        return (vno0) Enum.valueOf(vno0.class, str);
    }

    public static vno0[] values() {
        return (vno0[]) f243191c.clone();
    }
}
