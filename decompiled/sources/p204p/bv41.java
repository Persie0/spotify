package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class bv41 {

    /* JADX INFO: renamed from: a */
    public static final bv41 f31274a;

    /* JADX INFO: renamed from: b */
    public static final bv41 f31275b;

    /* JADX INFO: renamed from: c */
    public static final bv41 f31276c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bv41[] f31277d;

    static {
        bv41 bv41Var = new bv41("None", 0);
        f31274a = bv41Var;
        bv41 bv41Var2 = new bv41("Paused", 1);
        f31275b = bv41Var2;
        bv41 bv41Var3 = new bv41("Playing", 2);
        f31276c = bv41Var3;
        f31277d = new bv41[]{bv41Var, bv41Var2, bv41Var3};
    }

    public static bv41 valueOf(String str) {
        return (bv41) Enum.valueOf(bv41.class, str);
    }

    public static bv41[] values() {
        return (bv41[]) f31277d.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30586a() {
        return this == f31275b || m30587b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m30587b() {
        return this == f31276c;
    }
}
