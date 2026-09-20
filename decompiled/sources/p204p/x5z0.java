package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x5z0 {

    /* JADX INFO: renamed from: a */
    public static final x5z0 f258543a;

    /* JADX INFO: renamed from: b */
    public static final x5z0 f258544b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ x5z0[] f258545c;

    static {
        x5z0 x5z0Var = new x5z0("Normal", 0);
        f258543a = x5z0Var;
        x5z0 x5z0Var2 = new x5z0("ChipBar", 1);
        f258544b = x5z0Var2;
        f258545c = new x5z0[]{x5z0Var, x5z0Var2};
    }

    public static x5z0 valueOf(String str) {
        return (x5z0) Enum.valueOf(x5z0.class, str);
    }

    public static x5z0[] values() {
        return (x5z0[]) f258545c.clone();
    }
}
