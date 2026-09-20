package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class xgj0 {

    /* JADX INFO: renamed from: a */
    public static final xgj0 f261328a;

    /* JADX INFO: renamed from: b */
    public static final xgj0 f261329b;

    /* JADX INFO: renamed from: c */
    public static final xgj0 f261330c;

    /* JADX INFO: renamed from: d */
    public static final xgj0 f261331d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ xgj0[] f261332e;

    static {
        xgj0 xgj0Var = new xgj0("FORCED_OFFLINE", 0);
        f261328a = xgj0Var;
        xgj0 xgj0Var2 = new xgj0("AIRPLANE_MODE", 1);
        f261329b = xgj0Var2;
        xgj0 xgj0Var3 = new xgj0("NO_NETWORK_CONNECTION", 2);
        f261330c = xgj0Var3;
        xgj0 xgj0Var4 = new xgj0("UNKNOWN", 3);
        f261331d = xgj0Var4;
        f261332e = new xgj0[]{xgj0Var, xgj0Var2, xgj0Var3, xgj0Var4};
    }

    public static xgj0 valueOf(String str) {
        return (xgj0) Enum.valueOf(xgj0.class, str);
    }

    public static xgj0[] values() {
        return (xgj0[]) f261332e.clone();
    }
}
