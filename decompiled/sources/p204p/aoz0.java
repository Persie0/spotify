package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class aoz0 {

    /* JADX INFO: renamed from: a */
    public static final aoz0 f17793a;

    /* JADX INFO: renamed from: b */
    public static final aoz0 f17794b;

    /* JADX INFO: renamed from: c */
    public static final aoz0 f17795c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ aoz0[] f17796d;

    static {
        aoz0 aoz0Var = new aoz0("SELECTED", 0);
        f17793a = aoz0Var;
        aoz0 aoz0Var2 = new aoz0("SELECTABLE", 1);
        f17794b = aoz0Var2;
        aoz0 aoz0Var3 = new aoz0("UNSELECTED", 2);
        f17795c = aoz0Var3;
        f17796d = new aoz0[]{aoz0Var, aoz0Var2, aoz0Var3};
    }

    public static aoz0 valueOf(String str) {
        return (aoz0) Enum.valueOf(aoz0.class, str);
    }

    public static aoz0[] values() {
        return (aoz0[]) f17796d.clone();
    }
}
