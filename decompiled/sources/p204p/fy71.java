package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fy71 {

    /* JADX INFO: renamed from: a */
    public static final fy71 f74544a;

    /* JADX INFO: renamed from: b */
    public static final fy71 f74545b;

    /* JADX INFO: renamed from: c */
    public static final fy71 f74546c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fy71[] f74547d;

    static {
        fy71 fy71Var = new fy71("On", 0);
        f74544a = fy71Var;
        fy71 fy71Var2 = new fy71("Off", 1);
        f74545b = fy71Var2;
        fy71 fy71Var3 = new fy71("Indeterminate", 2);
        f74546c = fy71Var3;
        f74547d = new fy71[]{fy71Var, fy71Var2, fy71Var3};
    }

    public static fy71 valueOf(String str) {
        return (fy71) Enum.valueOf(fy71.class, str);
    }

    public static fy71[] values() {
        return (fy71[]) f74547d.clone();
    }
}
