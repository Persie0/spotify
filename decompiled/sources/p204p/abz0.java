package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class abz0 {

    /* JADX INFO: renamed from: a */
    public static final abz0 f14207a;

    /* JADX INFO: renamed from: b */
    public static final abz0 f14208b;

    /* JADX INFO: renamed from: c */
    public static final abz0 f14209c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ abz0[] f14210d;

    static {
        abz0 abz0Var = new abz0("SeeMoreClicked", 0);
        f14207a = abz0Var;
        abz0 abz0Var2 = new abz0("SeeLessClicked", 1);
        f14208b = abz0Var2;
        abz0 abz0Var3 = new abz0("DisplayTextClicked", 2);
        f14209c = abz0Var3;
        f14210d = new abz0[]{abz0Var, abz0Var2, abz0Var3};
    }

    public static abz0 valueOf(String str) {
        return (abz0) Enum.valueOf(abz0.class, str);
    }

    public static abz0[] values() {
        return (abz0[]) f14210d.clone();
    }
}
