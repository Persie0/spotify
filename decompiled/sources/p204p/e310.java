package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e310 {

    /* JADX INFO: renamed from: a */
    public static final e310 f55590a;

    /* JADX INFO: renamed from: b */
    public static final e310 f55591b;

    /* JADX INFO: renamed from: c */
    public static final e310 f55592c;

    /* JADX INFO: renamed from: d */
    public static final e310 f55593d;

    /* JADX INFO: renamed from: e */
    public static final e310 f55594e;

    /* JADX INFO: renamed from: f */
    public static final e310 f55595f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ e310[] f55596g;

    static {
        e310 e310Var = new e310("UNSPECIFIED", 0);
        f55590a = e310Var;
        e310 e310Var2 = new e310("GENERATING", 1);
        f55591b = e310Var2;
        e310 e310Var3 = new e310("GENERATED", 2);
        f55592c = e310Var3;
        e310 e310Var4 = new e310("READY", 3);
        f55593d = e310Var4;
        e310 e310Var5 = new e310("FAILED", 4);
        f55594e = e310Var5;
        e310 e310Var6 = new e310("NO_CREDITS", 5);
        f55595f = e310Var6;
        f55596g = new e310[]{e310Var, e310Var2, e310Var3, e310Var4, e310Var5, e310Var6};
    }

    public static e310 valueOf(String str) {
        return (e310) Enum.valueOf(e310.class, str);
    }

    public static e310[] values() {
        return (e310[]) f55596g.clone();
    }
}
