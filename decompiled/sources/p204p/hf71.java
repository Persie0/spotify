package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hf71 {

    /* JADX INFO: renamed from: a */
    public static final hf71 f90617a;

    /* JADX INFO: renamed from: b */
    public static final hf71 f90618b;

    /* JADX INFO: renamed from: c */
    public static final hf71 f90619c;

    /* JADX INFO: renamed from: d */
    public static final hf71 f90620d;

    /* JADX INFO: renamed from: e */
    public static final hf71 f90621e;

    /* JADX INFO: renamed from: f */
    public static final hf71 f90622f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ hf71[] f90623g;

    static {
        hf71 hf71Var = new hf71("FULL", 0);
        f90617a = hf71Var;
        hf71 hf71Var2 = new hf71("FULL_STANDALONE", 1);
        f90618b = hf71Var2;
        hf71 hf71Var3 = new hf71("SHORT", 2);
        f90619c = hf71Var3;
        hf71 hf71Var4 = new hf71("SHORT_STANDALONE", 3);
        f90620d = hf71Var4;
        hf71 hf71Var5 = new hf71("NARROW", 4);
        f90621e = hf71Var5;
        hf71 hf71Var6 = new hf71("NARROW_STANDALONE", 5);
        f90622f = hf71Var6;
        f90623g = new hf71[]{hf71Var, hf71Var2, hf71Var3, hf71Var4, hf71Var5, hf71Var6};
    }

    public static hf71 valueOf(String str) {
        return (hf71) Enum.valueOf(hf71.class, str);
    }

    public static hf71[] values() {
        return (hf71[]) f90623g.clone();
    }
}
