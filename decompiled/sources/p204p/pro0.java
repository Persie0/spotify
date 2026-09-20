package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pro0 {

    /* JADX INFO: renamed from: a */
    public static final pro0 f180653a;

    /* JADX INFO: renamed from: b */
    public static final pro0 f180654b;

    /* JADX INFO: renamed from: c */
    public static final pro0 f180655c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pro0[] f180656d;

    static {
        pro0 pro0Var = new pro0("PLAYING", 0);
        f180653a = pro0Var;
        pro0 pro0Var2 = new pro0("INACTIVE", 1);
        f180654b = pro0Var2;
        pro0 pro0Var3 = new pro0("PAUSED", 2);
        f180655c = pro0Var3;
        f180656d = new pro0[]{pro0Var, pro0Var2, pro0Var3};
    }

    public static pro0 valueOf(String str) {
        return (pro0) Enum.valueOf(pro0.class, str);
    }

    public static pro0[] values() {
        return (pro0[]) f180656d.clone();
    }
}
