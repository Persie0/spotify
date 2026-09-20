package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class x1m0 {

    /* JADX INFO: renamed from: a */
    public static final x1m0 f257232a;

    /* JADX INFO: renamed from: b */
    public static final x1m0 f257233b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ x1m0[] f257234c;

    static {
        x1m0 x1m0Var = new x1m0("RENDER_OVERRIDE", 0);
        f257232a = x1m0Var;
        x1m0 x1m0Var2 = new x1m0("RENDER_OPEN", 1);
        f257233b = x1m0Var2;
        f257234c = new x1m0[]{x1m0Var, x1m0Var2, new x1m0("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static x1m0 valueOf(String str) {
        return (x1m0) Enum.valueOf(x1m0.class, str);
    }

    public static x1m0[] values() {
        return (x1m0[]) f257234c.clone();
    }
}
