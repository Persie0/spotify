package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sse0 {

    /* JADX INFO: renamed from: a */
    public static final sse0 f213583a;

    /* JADX INFO: renamed from: b */
    public static final sse0 f213584b;

    /* JADX INFO: renamed from: c */
    public static final sse0 f213585c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sse0[] f213586d;

    static {
        sse0 sse0Var = new sse0("UNINITIALIZED", 0);
        f213583a = sse0Var;
        sse0 sse0Var2 = new sse0("STARTED", 1);
        f213584b = sse0Var2;
        sse0 sse0Var3 = new sse0("PAUSED", 2);
        f213585c = sse0Var3;
        f213586d = new sse0[]{sse0Var, sse0Var2, sse0Var3};
    }

    public static sse0 valueOf(String str) {
        return (sse0) Enum.valueOf(sse0.class, str);
    }

    public static sse0[] values() {
        return (sse0[]) f213586d.clone();
    }
}
