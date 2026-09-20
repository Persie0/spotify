package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mz31 {

    /* JADX INFO: renamed from: a */
    public static final mz31 f148600a;

    /* JADX INFO: renamed from: b */
    public static final mz31 f148601b;

    /* JADX INFO: renamed from: c */
    public static final mz31 f148602c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ mz31[] f148603d;

    static {
        mz31 mz31Var = new mz31("ContinueButtonClicked", 0);
        f148600a = mz31Var;
        mz31 mz31Var2 = new mz31("CancelButtonClicked", 1);
        f148601b = mz31Var2;
        mz31 mz31Var3 = new mz31("DialogDismissed", 2);
        f148602c = mz31Var3;
        f148603d = new mz31[]{mz31Var, mz31Var2, mz31Var3};
    }

    public static mz31 valueOf(String str) {
        return (mz31) Enum.valueOf(mz31.class, str);
    }

    public static mz31[] values() {
        return (mz31[]) f148603d.clone();
    }
}
