package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t5j0 {

    /* JADX INFO: renamed from: a */
    public static final t5j0 f217308a;

    /* JADX INFO: renamed from: b */
    public static final t5j0 f217309b;

    /* JADX INFO: renamed from: c */
    public static final t5j0 f217310c;

    /* JADX INFO: renamed from: d */
    public static final t5j0 f217311d;

    /* JADX INFO: renamed from: e */
    public static final t5j0 f217312e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ t5j0[] f217313f;

    /* JADX INFO: Fake field, exist only in values array */
    t5j0 EF0;

    static {
        t5j0 t5j0Var = new t5j0("NONE", 0);
        t5j0 t5j0Var2 = new t5j0("HOME", 1);
        f217308a = t5j0Var2;
        t5j0 t5j0Var3 = new t5j0("SEARCH", 2);
        f217309b = t5j0Var3;
        t5j0 t5j0Var4 = new t5j0("YOUR_LIBRARY", 3);
        f217310c = t5j0Var4;
        t5j0 t5j0Var5 = new t5j0("PREMIUM", 4);
        f217311d = t5j0Var5;
        t5j0 t5j0Var6 = new t5j0("CREATE", 5);
        f217312e = t5j0Var6;
        f217313f = new t5j0[]{t5j0Var, t5j0Var2, t5j0Var3, t5j0Var4, t5j0Var5, t5j0Var6};
    }

    public static t5j0 valueOf(String str) {
        return (t5j0) Enum.valueOf(t5j0.class, str);
    }

    public static t5j0[] values() {
        return (t5j0[]) f217313f.clone();
    }
}
