package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hea0 {

    /* JADX INFO: renamed from: a */
    public static final hea0 f90394a;

    /* JADX INFO: renamed from: b */
    public static final hea0 f90395b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hea0[] f90396c;

    static {
        hea0 hea0Var = new hea0("PLAYING", 0);
        f90394a = hea0Var;
        hea0 hea0Var2 = new hea0("NOT_PLAYING", 1);
        f90395b = hea0Var2;
        f90396c = new hea0[]{hea0Var, hea0Var2};
        new i97(15);
    }

    public static hea0 valueOf(String str) {
        return (hea0) Enum.valueOf(hea0.class, str);
    }

    public static hea0[] values() {
        return (hea0[]) f90396c.clone();
    }
}
