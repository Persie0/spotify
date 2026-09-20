package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class aus0 {

    /* JADX INFO: renamed from: a */
    public static final aus0 f20019a;

    /* JADX INFO: renamed from: b */
    public static final aus0 f20020b;

    /* JADX INFO: renamed from: c */
    public static final aus0 f20021c;

    /* JADX INFO: renamed from: d */
    public static final aus0 f20022d;

    /* JADX INFO: renamed from: e */
    public static final aus0 f20023e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ aus0[] f20024f;

    static {
        aus0 aus0Var = new aus0("TRACK", 0);
        f20019a = aus0Var;
        aus0 aus0Var2 = new aus0("EPISODE", 1);
        f20020b = aus0Var2;
        aus0 aus0Var3 = new aus0("AUDIOBOOK", 2);
        f20021c = aus0Var3;
        aus0 aus0Var4 = new aus0("CLIP", 3);
        f20022d = aus0Var4;
        aus0 aus0Var5 = new aus0("CHAPTER", 4);
        f20023e = aus0Var5;
        f20024f = new aus0[]{aus0Var, aus0Var2, aus0Var3, aus0Var4, aus0Var5};
    }

    public static aus0 valueOf(String str) {
        return (aus0) Enum.valueOf(aus0.class, str);
    }

    public static aus0[] values() {
        return (aus0[]) f20024f.clone();
    }
}
