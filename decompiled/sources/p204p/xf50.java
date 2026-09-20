package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xf50 {

    /* JADX INFO: renamed from: a */
    public static final xf50 f260838a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ xf50[] f260839b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f260840c;

    /* JADX INFO: Fake field, exist only in values array */
    xf50 EF0;

    static {
        xf50 xf50Var = new xf50("Shake", 0);
        xf50 xf50Var2 = new xf50("TestingTools", 1);
        f260838a = xf50Var2;
        xf50[] xf50VarArr = {xf50Var, xf50Var2, new xf50("Feature", 2), new xf50("EmployeeTools", 3), new xf50("DebugDrawer", 4), new xf50("PersistentNotification", 5)};
        f260839b = xf50VarArr;
        f260840c = new nzv(xf50VarArr);
    }

    public static xf50 valueOf(String str) {
        return (xf50) Enum.valueOf(xf50.class, str);
    }

    public static xf50[] values() {
        return (xf50[]) f260839b.clone();
    }
}
