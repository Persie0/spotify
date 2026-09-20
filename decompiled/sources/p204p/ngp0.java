package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ngp0 {

    /* JADX INFO: renamed from: a */
    public static final ngp0 f153750a;

    /* JADX INFO: renamed from: b */
    public static final ngp0 f153751b;

    /* JADX INFO: renamed from: c */
    public static final ngp0 f153752c;

    /* JADX INFO: renamed from: d */
    public static final ngp0 f153753d;

    /* JADX INFO: renamed from: e */
    public static final ngp0 f153754e;

    /* JADX INFO: renamed from: f */
    public static final ngp0 f153755f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ ngp0[] f153756g;

    static {
        ngp0 ngp0Var = new ngp0("SONG", 0);
        f153750a = ngp0Var;
        ngp0 ngp0Var2 = new ngp0("EPISODE", 1);
        f153751b = ngp0Var2;
        ngp0 ngp0Var3 = new ngp0("AUDIOBOOK", 2);
        f153752c = ngp0Var3;
        ngp0 ngp0Var4 = new ngp0("PODCAST_CHAPTER", 3);
        f153753d = ngp0Var4;
        ngp0 ngp0Var5 = new ngp0("CLIP", 4);
        f153754e = ngp0Var5;
        ngp0 ngp0Var6 = new ngp0("OTHER", 5);
        f153755f = ngp0Var6;
        f153756g = new ngp0[]{ngp0Var, ngp0Var2, ngp0Var3, ngp0Var4, ngp0Var5, ngp0Var6};
    }

    public static ngp0 valueOf(String str) {
        return (ngp0) Enum.valueOf(ngp0.class, str);
    }

    public static ngp0[] values() {
        return (ngp0[]) f153756g.clone();
    }
}
