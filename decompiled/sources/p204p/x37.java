package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class x37 {

    /* JADX INFO: renamed from: a */
    public static final x37 f257700a;

    /* JADX INFO: renamed from: b */
    public static final x37 f257701b;

    /* JADX INFO: renamed from: c */
    public static final x37 f257702c;

    /* JADX INFO: renamed from: d */
    public static final x37 f257703d;

    /* JADX INFO: renamed from: e */
    public static final x37 f257704e;

    /* JADX INFO: renamed from: f */
    public static final x37 f257705f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ x37[] f257706g;

    static {
        x37 x37Var = new x37("CheckingPermission", 0);
        f257700a = x37Var;
        x37 x37Var2 = new x37("PermissionRequested", 1);
        f257701b = x37Var2;
        x37 x37Var3 = new x37("AwaitingPermission", 2);
        f257702c = x37Var3;
        x37 x37Var4 = new x37("Listening", 3);
        f257703d = x37Var4;
        x37 x37Var5 = new x37("Identifying", 4);
        f257704e = x37Var5;
        x37 x37Var6 = new x37("Matched", 5);
        f257705f = x37Var6;
        f257706g = new x37[]{x37Var, x37Var2, x37Var3, x37Var4, x37Var5, x37Var6};
    }

    public static x37 valueOf(String str) {
        return (x37) Enum.valueOf(x37.class, str);
    }

    public static x37[] values() {
        return (x37[]) f257706g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89778a() {
        return this == f257700a || this == f257701b || this == f257702c;
    }
}
