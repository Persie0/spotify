package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hdn0 {

    /* JADX INFO: renamed from: a */
    public static final hdn0 f90166a;

    /* JADX INFO: renamed from: b */
    public static final hdn0 f90167b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hdn0[] f90168c;

    static {
        hdn0 hdn0Var = new hdn0("PAUSED", 0);
        f90166a = hdn0Var;
        hdn0 hdn0Var2 = new hdn0("RESUMED", 1);
        f90167b = hdn0Var2;
        f90168c = new hdn0[]{hdn0Var, hdn0Var2};
    }

    public static hdn0 valueOf(String str) {
        return (hdn0) Enum.valueOf(hdn0.class, str);
    }

    public static hdn0[] values() {
        return (hdn0[]) f90168c.clone();
    }
}
