package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d3n0 {

    /* JADX INFO: renamed from: a */
    public static final d3n0 f44944a;

    /* JADX INFO: renamed from: b */
    public static final d3n0 f44945b;

    /* JADX INFO: renamed from: c */
    public static final d3n0 f44946c;

    /* JADX INFO: renamed from: d */
    public static final d3n0 f44947d;

    /* JADX INFO: renamed from: e */
    public static final d3n0 f44948e;

    /* JADX INFO: renamed from: f */
    public static final d3n0 f44949f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ d3n0[] f44950g;

    static {
        d3n0 d3n0Var = new d3n0("LINK_TAPPED", 0);
        f44944a = d3n0Var;
        d3n0 d3n0Var2 = new d3n0("DISMISSED_SWIPED_DOWN", 1);
        f44945b = d3n0Var2;
        d3n0 d3n0Var3 = new d3n0("DISMISSED_BACK_PRESSED", 2);
        f44946c = d3n0Var3;
        d3n0 d3n0Var4 = new d3n0("BLOCK_TAPPED", 3);
        f44947d = d3n0Var4;
        d3n0 d3n0Var5 = new d3n0("BLOCK_CANCELLED", 4);
        f44948e = d3n0Var5;
        d3n0 d3n0Var6 = new d3n0("BLOCK_CONFIRMED", 5);
        f44949f = d3n0Var6;
        f44950g = new d3n0[]{d3n0Var, d3n0Var2, d3n0Var3, d3n0Var4, d3n0Var5, d3n0Var6};
    }

    public static d3n0 valueOf(String str) {
        return (d3n0) Enum.valueOf(d3n0.class, str);
    }

    public static d3n0[] values() {
        return (d3n0[]) f44950g.clone();
    }
}
