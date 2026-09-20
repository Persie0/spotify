package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h0e1 {

    /* JADX INFO: renamed from: a */
    public static final h0e1 f86263a;

    /* JADX INFO: renamed from: b */
    public static final h0e1 f86264b;

    /* JADX INFO: renamed from: c */
    public static final h0e1 f86265c;

    /* JADX INFO: renamed from: d */
    public static final h0e1 f86266d;

    /* JADX INFO: renamed from: e */
    public static final h0e1 f86267e;

    /* JADX INFO: renamed from: f */
    public static final h0e1 f86268f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ h0e1[] f86269g;

    static {
        h0e1 h0e1Var = new h0e1("ENQUEUED", 0);
        f86263a = h0e1Var;
        h0e1 h0e1Var2 = new h0e1("RUNNING", 1);
        f86264b = h0e1Var2;
        h0e1 h0e1Var3 = new h0e1("SUCCEEDED", 2);
        f86265c = h0e1Var3;
        h0e1 h0e1Var4 = new h0e1("FAILED", 3);
        f86266d = h0e1Var4;
        h0e1 h0e1Var5 = new h0e1("BLOCKED", 4);
        f86267e = h0e1Var5;
        h0e1 h0e1Var6 = new h0e1("CANCELLED", 5);
        f86268f = h0e1Var6;
        f86269g = new h0e1[]{h0e1Var, h0e1Var2, h0e1Var3, h0e1Var4, h0e1Var5, h0e1Var6};
    }

    public static h0e1 valueOf(String str) {
        return (h0e1) Enum.valueOf(h0e1.class, str);
    }

    public static h0e1[] values() {
        return (h0e1[]) f86269g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m46346a() {
        return this == f86265c || this == f86266d || this == f86268f;
    }
}
