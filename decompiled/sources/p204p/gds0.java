package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class gds0 {

    /* JADX INFO: renamed from: a */
    public static final gds0 f78938a;

    /* JADX INFO: renamed from: b */
    public static final gds0 f78939b;

    /* JADX INFO: renamed from: c */
    public static final gds0 f78940c;

    /* JADX INFO: renamed from: d */
    public static final gds0 f78941d;

    /* JADX INFO: renamed from: e */
    public static final gds0 f78942e;

    /* JADX INFO: renamed from: f */
    public static final gds0 f78943f;

    /* JADX INFO: renamed from: g */
    public static final gds0 f78944g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ gds0[] f78945h;

    static {
        gds0 gds0Var = new gds0("QUEUED", 0);
        f78938a = gds0Var;
        gds0 gds0Var2 = new gds0("PRESENTED", 1);
        f78939b = gds0Var2;
        gds0 gds0Var3 = new gds0("DISMISSED_BY_TIMEOUT", 2);
        f78940c = gds0Var3;
        gds0 gds0Var4 = new gds0("DISMISSED_BY_REQUEST", 3);
        f78941d = gds0Var4;
        gds0 gds0Var5 = new gds0("DISMISSED_BY_SURFACE", 4);
        f78942e = gds0Var5;
        gds0 gds0Var6 = new gds0("DISMISSED_BY_USER", 5);
        f78943f = gds0Var6;
        gds0 gds0Var7 = new gds0("COULD_NOT_BE_PRESENTED", 6);
        f78944g = gds0Var7;
        f78945h = new gds0[]{gds0Var, gds0Var2, gds0Var3, gds0Var4, gds0Var5, gds0Var6, gds0Var7};
    }

    public static gds0 valueOf(String str) {
        return (gds0) Enum.valueOf(gds0.class, str);
    }

    public static gds0[] values() {
        return (gds0[]) f78945h.clone();
    }
}
