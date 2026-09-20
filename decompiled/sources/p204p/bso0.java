package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class bso0 {

    /* JADX INFO: renamed from: a */
    public static final bso0 f30362a;

    /* JADX INFO: renamed from: b */
    public static final bso0 f30363b;

    /* JADX INFO: renamed from: c */
    public static final bso0 f30364c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bso0[] f30365d;

    static {
        bso0 bso0Var = new bso0("Playing", 0);
        f30362a = bso0Var;
        bso0 bso0Var2 = new bso0("Paused", 1);
        f30363b = bso0Var2;
        bso0 bso0Var3 = new bso0("None", 2);
        f30364c = bso0Var3;
        f30365d = new bso0[]{bso0Var, bso0Var2, bso0Var3};
    }

    public static bso0 valueOf(String str) {
        return (bso0) Enum.valueOf(bso0.class, str);
    }

    public static bso0[] values() {
        return (bso0[]) f30365d.clone();
    }
}
