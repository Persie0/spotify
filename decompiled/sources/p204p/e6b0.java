package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class e6b0 {

    /* JADX INFO: renamed from: a */
    public static final e6b0 f56608a;

    /* JADX INFO: renamed from: b */
    public static final e6b0 f56609b;

    /* JADX INFO: renamed from: c */
    public static final e6b0 f56610c;

    /* JADX INFO: renamed from: d */
    public static final e6b0 f56611d;

    /* JADX INFO: renamed from: e */
    public static final e6b0 f56612e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ e6b0[] f56613f;

    static {
        e6b0 e6b0Var = new e6b0("WifiOrCellular", 0);
        f56608a = e6b0Var;
        e6b0 e6b0Var2 = new e6b0("Connect", 1);
        f56609b = e6b0Var2;
        e6b0 e6b0Var3 = new e6b0("Download", 2);
        f56610c = e6b0Var3;
        e6b0 e6b0Var4 = new e6b0("Cache", 3);
        f56611d = e6b0Var4;
        e6b0 e6b0Var5 = new e6b0("LocalFile", 4);
        f56612e = e6b0Var5;
        f56613f = new e6b0[]{e6b0Var, e6b0Var2, e6b0Var3, e6b0Var4, e6b0Var5};
    }

    public static e6b0 valueOf(String str) {
        return (e6b0) Enum.valueOf(e6b0.class, str);
    }

    public static e6b0[] values() {
        return (e6b0[]) f56613f.clone();
    }
}
