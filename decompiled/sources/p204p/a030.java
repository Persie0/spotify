package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a030 {

    /* JADX INFO: renamed from: a */
    public static final a030 f10979a;

    /* JADX INFO: renamed from: b */
    public static final a030 f10980b;

    /* JADX INFO: renamed from: c */
    public static final a030 f10981c;

    /* JADX INFO: renamed from: d */
    public static final a030 f10982d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ a030[] f10983e;

    static {
        a030 a030Var = new a030("RowClicked", 0);
        f10979a = a030Var;
        a030 a030Var2 = new a030("AddToLibraryClicked", 1);
        f10980b = a030Var2;
        a030 a030Var3 = new a030("ClearClicked", 2);
        f10981c = a030Var3;
        a030 a030Var4 = new a030("Swiped", 3);
        f10982d = a030Var4;
        f10983e = new a030[]{a030Var, a030Var2, a030Var3, a030Var4};
    }

    public static a030 valueOf(String str) {
        return (a030) Enum.valueOf(a030.class, str);
    }

    public static a030[] values() {
        return (a030[]) f10983e.clone();
    }
}
