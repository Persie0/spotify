package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c6a0 {

    /* JADX INFO: renamed from: a */
    public static final c6a0 f34467a;

    /* JADX INFO: renamed from: b */
    public static final c6a0 f34468b;

    /* JADX INFO: renamed from: c */
    public static final c6a0 f34469c;

    /* JADX INFO: renamed from: d */
    public static final c6a0 f34470d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ c6a0[] f34471e;

    static {
        c6a0 c6a0Var = new c6a0("STOPPED", 0);
        f34467a = c6a0Var;
        c6a0 c6a0Var2 = new c6a0("LOADING", 1);
        f34468b = c6a0Var2;
        c6a0 c6a0Var3 = new c6a0("LOADED", 2);
        f34469c = c6a0Var3;
        c6a0 c6a0Var4 = new c6a0("FAILED", 3);
        f34470d = c6a0Var4;
        f34471e = new c6a0[]{c6a0Var, c6a0Var2, c6a0Var3, c6a0Var4};
    }

    public static c6a0 valueOf(String str) {
        return (c6a0) Enum.valueOf(c6a0.class, str);
    }

    public static c6a0[] values() {
        return (c6a0[]) f34471e.clone();
    }
}
