package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hsa0 {

    /* JADX INFO: renamed from: a */
    public static final hsa0 f94646a;

    /* JADX INFO: renamed from: b */
    public static final hsa0 f94647b;

    /* JADX INFO: renamed from: c */
    public static final hsa0 f94648c;

    /* JADX INFO: renamed from: d */
    public static final hsa0 f94649d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ hsa0[] f94650e;

    static {
        hsa0 hsa0Var = new hsa0("REQUESTS", 0);
        f94646a = hsa0Var;
        hsa0 hsa0Var2 = new hsa0("INCLUDE_ACCESS_TOKENS", 1);
        hsa0 hsa0Var3 = new hsa0("INCLUDE_RAW_RESPONSES", 2);
        f94647b = hsa0Var3;
        hsa0 hsa0Var4 = new hsa0("CACHE", 3);
        hsa0 hsa0Var5 = new hsa0("APP_EVENTS", 4);
        f94648c = hsa0Var5;
        hsa0 hsa0Var6 = new hsa0("DEVELOPER_ERRORS", 5);
        f94649d = hsa0Var6;
        f94650e = new hsa0[]{hsa0Var, hsa0Var2, hsa0Var3, hsa0Var4, hsa0Var5, hsa0Var6, new hsa0("GRAPH_API_DEBUG_WARNING", 6), new hsa0("GRAPH_API_DEBUG_INFO", 7)};
    }

    public static hsa0 valueOf(String str) {
        return (hsa0) Enum.valueOf(hsa0.class, str);
    }

    public static hsa0[] values() {
        return (hsa0[]) f94650e.clone();
    }
}
