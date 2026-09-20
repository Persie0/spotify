package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class be91 {

    /* JADX INFO: renamed from: a */
    public static final be91 f26306a;

    /* JADX INFO: renamed from: b */
    public static final be91 f26307b;

    /* JADX INFO: renamed from: c */
    public static final be91 f26308c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ be91[] f26309d;

    static {
        be91 be91Var = new be91("ContinueTraversal", 0);
        f26306a = be91Var;
        be91 be91Var2 = new be91("SkipSubtreeAndContinueTraversal", 1);
        f26307b = be91Var2;
        be91 be91Var3 = new be91("CancelTraversal", 2);
        f26308c = be91Var3;
        f26309d = new be91[]{be91Var, be91Var2, be91Var3};
    }

    public static be91 valueOf(String str) {
        return (be91) Enum.valueOf(be91.class, str);
    }

    public static be91[] values() {
        return (be91[]) f26309d.clone();
    }
}
