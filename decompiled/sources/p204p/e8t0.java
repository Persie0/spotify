package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e8t0 {

    /* JADX INFO: renamed from: a */
    public static final e8t0 f57261a;

    /* JADX INFO: renamed from: b */
    public static final e8t0 f57262b;

    /* JADX INFO: renamed from: c */
    public static final e8t0 f57263c;

    /* JADX INFO: renamed from: d */
    public static final e8t0 f57264d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ e8t0[] f57265e;

    static {
        e8t0 e8t0Var = new e8t0("EMPTY", 0);
        f57261a = e8t0Var;
        e8t0 e8t0Var2 = new e8t0("GENERAL_ERROR", 1);
        f57262b = e8t0Var2;
        e8t0 e8t0Var3 = new e8t0("INVALID_FILE", 2);
        f57263c = e8t0Var3;
        e8t0 e8t0Var4 = new e8t0("NOT_COMPATIBLE_WITH_RUNTIME", 3);
        f57264d = e8t0Var4;
        f57265e = new e8t0[]{e8t0Var, e8t0Var2, e8t0Var3, e8t0Var4};
    }

    public static e8t0 valueOf(String str) {
        return (e8t0) Enum.valueOf(e8t0.class, str);
    }

    public static e8t0[] values() {
        return (e8t0[]) f57265e.clone();
    }
}
