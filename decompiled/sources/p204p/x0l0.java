package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x0l0 {

    /* JADX INFO: renamed from: a */
    public static final x0l0 f256897a;

    /* JADX INFO: renamed from: b */
    public static final x0l0 f256898b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ x0l0[] f256899c;

    static {
        x0l0 x0l0Var = new x0l0("Clicked", 0);
        f256897a = x0l0Var;
        x0l0 x0l0Var2 = new x0l0("LongClicked", 1);
        f256898b = x0l0Var2;
        f256899c = new x0l0[]{x0l0Var, x0l0Var2};
    }

    public static x0l0 valueOf(String str) {
        return (x0l0) Enum.valueOf(x0l0.class, str);
    }

    public static x0l0[] values() {
        return (x0l0[]) f256899c.clone();
    }
}
