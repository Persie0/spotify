package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public class nx31 {

    /* JADX INFO: renamed from: b */
    public static final nx31 f159349b;

    /* JADX INFO: renamed from: c */
    public static final nx31 f159350c;

    /* JADX INFO: renamed from: d */
    public static final nx31 f159351d;

    /* JADX INFO: renamed from: e */
    public static final mx31 f159352e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nx31[] f159353f;

    /* JADX INFO: renamed from: a */
    public final Object f159354a;

    static {
        nx31 nx31Var = new nx31("NULL", 0, null);
        f159349b = nx31Var;
        nx31 nx31Var2 = new nx31("INDEX", 1, -1);
        f159350c = nx31Var2;
        nx31 nx31Var3 = new nx31("FALSE", 2, Boolean.FALSE);
        f159351d = nx31Var3;
        mx31 mx31Var = new mx31("MAP_GET_OR_DEFAULT", 3, null);
        f159352e = mx31Var;
        f159353f = new nx31[]{nx31Var, nx31Var2, nx31Var3, mx31Var};
    }

    public nx31(String str, int i, Object obj) {
        super(str, i);
        this.f159354a = obj;
    }

    public static nx31 valueOf(String str) {
        return (nx31) Enum.valueOf(nx31.class, str);
    }

    public static nx31[] values() {
        return (nx31[]) f159353f.clone();
    }
}
