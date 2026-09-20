package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dir0 {

    /* JADX INFO: renamed from: a */
    public static final dir0 f49468a;

    /* JADX INFO: renamed from: b */
    public static final dir0 f49469b;

    /* JADX INFO: renamed from: c */
    public static final dir0 f49470c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ dir0[] f49471d;

    static {
        dir0 dir0Var = new dir0("MAIN", 0);
        f49468a = dir0Var;
        dir0 dir0Var2 = new dir0("GDBPROCESS", 1);
        f49469b = dir0Var2;
        dir0 dir0Var3 = new dir0("UNKNOWN", 2);
        f49470c = dir0Var3;
        f49471d = new dir0[]{dir0Var, dir0Var2, dir0Var3};
        new t46(21);
    }

    public static dir0 valueOf(String str) {
        return (dir0) Enum.valueOf(dir0.class, str);
    }

    public static dir0[] values() {
        return (dir0[]) f49471d.clone();
    }
}
