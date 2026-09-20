package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class suk0 {

    /* JADX INFO: renamed from: a */
    public static final suk0 f214142a;

    /* JADX INFO: renamed from: b */
    public static final suk0 f214143b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ suk0[] f214144c;

    static {
        suk0 suk0Var = new suk0("OnCurateClicked", 0);
        f214142a = suk0Var;
        suk0 suk0Var2 = new suk0("OnUncurateClicked", 1);
        f214143b = suk0Var2;
        f214144c = new suk0[]{suk0Var, suk0Var2};
    }

    public static suk0 valueOf(String str) {
        return (suk0) Enum.valueOf(suk0.class, str);
    }

    public static suk0[] values() {
        return (suk0[]) f214144c.clone();
    }
}
