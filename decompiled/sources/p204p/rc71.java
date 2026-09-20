package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class rc71 {

    /* JADX INFO: renamed from: a */
    public static final rc71 f197781a;

    /* JADX INFO: renamed from: b */
    public static final rc71 f197782b;

    /* JADX INFO: renamed from: c */
    public static final rc71 f197783c;

    /* JADX INFO: renamed from: d */
    public static final rc71 f197784d;

    /* JADX INFO: renamed from: e */
    public static final rc71 f197785e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ rc71[] f197786f;

    static {
        rc71 rc71Var = new rc71("CONFIDENCE", 0);
        f197781a = rc71Var;
        rc71 rc71Var2 = new rc71("AREA", 1);
        f197782b = rc71Var2;
        rc71 rc71Var3 = new rc71("DISTANCE_TO_TOP_EDGE", 2);
        f197783c = rc71Var3;
        rc71 rc71Var4 = new rc71("DISTANCE_TO_CENTER", 3);
        f197784d = rc71Var4;
        rc71 rc71Var5 = new rc71("WORDS_COUNT", 4);
        f197785e = rc71Var5;
        f197786f = new rc71[]{rc71Var, rc71Var2, rc71Var3, rc71Var4, rc71Var5};
    }

    public static rc71 valueOf(String str) {
        return (rc71) Enum.valueOf(rc71.class, str);
    }

    public static rc71[] values() {
        return (rc71[]) f197786f.clone();
    }
}
