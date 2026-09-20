package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ndn0 {

    /* JADX INFO: renamed from: a */
    public static final ndn0 f152805a;

    /* JADX INFO: renamed from: b */
    public static final ndn0 f152806b;

    /* JADX INFO: renamed from: c */
    public static final ndn0 f152807c;

    /* JADX INFO: renamed from: d */
    public static final ndn0 f152808d;

    /* JADX INFO: renamed from: e */
    public static final ndn0 f152809e;

    /* JADX INFO: renamed from: f */
    public static final ndn0 f152810f;

    /* JADX INFO: renamed from: g */
    public static final ndn0 f152811g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ ndn0[] f152812h;

    static {
        ndn0 ndn0Var = new ndn0("Invalid", 0);
        f152805a = ndn0Var;
        ndn0 ndn0Var2 = new ndn0("Cancelled", 1);
        f152806b = ndn0Var2;
        ndn0 ndn0Var3 = new ndn0("InitialPending", 2);
        f152807c = ndn0Var3;
        ndn0 ndn0Var4 = new ndn0("RecomposePending", 3);
        f152808d = ndn0Var4;
        ndn0 ndn0Var5 = new ndn0("Recomposing", 4);
        f152809e = ndn0Var5;
        ndn0 ndn0Var6 = new ndn0("ApplyPending", 5);
        f152810f = ndn0Var6;
        ndn0 ndn0Var7 = new ndn0("Applied", 6);
        f152811g = ndn0Var7;
        f152812h = new ndn0[]{ndn0Var, ndn0Var2, ndn0Var3, ndn0Var4, ndn0Var5, ndn0Var6, ndn0Var7};
    }

    public static ndn0 valueOf(String str) {
        return (ndn0) Enum.valueOf(ndn0.class, str);
    }

    public static ndn0[] values() {
        return (ndn0[]) f152812h.clone();
    }
}
