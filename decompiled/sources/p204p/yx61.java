package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class yx61 {

    /* JADX INFO: renamed from: a */
    public static final yx61 f277144a;

    /* JADX INFO: renamed from: b */
    public static final yx61 f277145b;

    /* JADX INFO: renamed from: c */
    public static final yx61 f277146c;

    /* JADX INFO: renamed from: d */
    public static final yx61 f277147d;

    /* JADX INFO: renamed from: e */
    public static final yx61 f277148e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ yx61[] f277149f;

    static {
        yx61 yx61Var = new yx61("CAST", 0);
        f277144a = yx61Var;
        yx61 yx61Var2 = new yx61("BLUETOOTH", 1);
        f277145b = yx61Var2;
        yx61 yx61Var3 = new yx61("AIRPLAY", 2);
        f277146c = yx61Var3;
        yx61 yx61Var4 = new yx61("CONNECT", 3);
        f277147d = yx61Var4;
        yx61 yx61Var5 = new yx61("WIRED", 4);
        f277148e = yx61Var5;
        f277149f = new yx61[]{yx61Var, yx61Var2, yx61Var3, yx61Var4, yx61Var5};
    }

    public static yx61 valueOf(String str) {
        return (yx61) Enum.valueOf(yx61.class, str);
    }

    public static yx61[] values() {
        return (yx61[]) f277149f.clone();
    }
}
