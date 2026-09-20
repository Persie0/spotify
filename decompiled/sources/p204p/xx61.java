package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xx61 {

    /* JADX INFO: renamed from: a */
    public static final xx61 f266879a;

    /* JADX INFO: renamed from: b */
    public static final xx61 f266880b;

    /* JADX INFO: renamed from: c */
    public static final xx61 f266881c;

    /* JADX INFO: renamed from: d */
    public static final xx61 f266882d;

    /* JADX INFO: renamed from: e */
    public static final xx61 f266883e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ xx61[] f266884f;

    static {
        xx61 xx61Var = new xx61("CONNECT", 0);
        f266879a = xx61Var;
        xx61 xx61Var2 = new xx61("CAST_JS", 1);
        f266880b = xx61Var2;
        xx61 xx61Var3 = new xx61("CAST", 2);
        f266881c = xx61Var3;
        xx61 xx61Var4 = new xx61("BLUETOOTH", 3);
        f266882d = xx61Var4;
        xx61 xx61Var5 = new xx61("AIRPLAY", 4);
        f266883e = xx61Var5;
        f266884f = new xx61[]{xx61Var, xx61Var2, xx61Var3, xx61Var4, xx61Var5};
    }

    public static xx61 valueOf(String str) {
        return (xx61) Enum.valueOf(xx61.class, str);
    }

    public static xx61[] values() {
        return (xx61[]) f266884f.clone();
    }
}
