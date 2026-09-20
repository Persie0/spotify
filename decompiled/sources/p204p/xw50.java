package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xw50 {

    /* JADX INFO: renamed from: a */
    public static final xw50 f266589a;

    /* JADX INFO: renamed from: b */
    public static final xw50 f266590b;

    /* JADX INFO: renamed from: c */
    public static final xw50 f266591c;

    /* JADX INFO: renamed from: d */
    public static final xw50 f266592d;

    /* JADX INFO: renamed from: e */
    public static final xw50 f266593e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ xw50[] f266594f;

    static {
        xw50 xw50Var = new xw50("M_DNS", 0);
        f266589a = xw50Var;
        xw50 xw50Var2 = new xw50("CONNECT", 1);
        f266590b = xw50Var2;
        xw50 xw50Var3 = new xw50("SOCIALRADAR_NEARBY", 2);
        f266591c = xw50Var3;
        xw50 xw50Var4 = new xw50("LINK", 3);
        f266592d = xw50Var4;
        xw50 xw50Var5 = new xw50("LISTENING_ACTIVITY", 4);
        f266593e = xw50Var5;
        f266594f = new xw50[]{xw50Var, xw50Var2, xw50Var3, xw50Var4, xw50Var5};
    }

    public static xw50 valueOf(String str) {
        return (xw50) Enum.valueOf(xw50.class, str);
    }

    public static xw50[] values() {
        return (xw50[]) f266594f.clone();
    }
}
