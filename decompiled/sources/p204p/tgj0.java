package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tgj0 {

    /* JADX INFO: renamed from: a */
    public static final tgj0 f220200a;

    /* JADX INFO: renamed from: b */
    public static final tgj0 f220201b;

    /* JADX INFO: renamed from: c */
    public static final tgj0 f220202c;

    /* JADX INFO: renamed from: d */
    public static final tgj0 f220203d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ tgj0[] f220204e;

    static {
        tgj0 tgj0Var = new tgj0("UNMETERED", 0);
        f220200a = tgj0Var;
        tgj0 tgj0Var2 = new tgj0("CELLULAR", 1);
        f220201b = tgj0Var2;
        tgj0 tgj0Var3 = new tgj0("EXPENSIVE", 2);
        f220202c = tgj0Var3;
        tgj0 tgj0Var4 = new tgj0("CONSTRAINED", 3);
        f220203d = tgj0Var4;
        f220204e = new tgj0[]{tgj0Var, tgj0Var2, tgj0Var3, tgj0Var4};
    }

    public static tgj0 valueOf(String str) {
        return (tgj0) Enum.valueOf(tgj0.class, str);
    }

    public static tgj0[] values() {
        return (tgj0[]) f220204e.clone();
    }
}
