package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class zg80 {

    /* JADX INFO: renamed from: a */
    public static final zg80 f282544a;

    /* JADX INFO: renamed from: b */
    public static final zg80 f282545b;

    /* JADX INFO: renamed from: c */
    public static final zg80 f282546c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zg80[] f282547d;

    static {
        zg80 zg80Var = new zg80("None", 0);
        f282544a = zg80Var;
        zg80 zg80Var2 = new zg80("WithTextFilteringOnly", 1);
        f282545b = zg80Var2;
        zg80 zg80Var3 = new zg80("WithSortingAndTextFiltering", 2);
        f282546c = zg80Var3;
        f282547d = new zg80[]{zg80Var, zg80Var2, zg80Var3};
    }

    public static zg80 valueOf(String str) {
        return (zg80) Enum.valueOf(zg80.class, str);
    }

    public static zg80[] values() {
        return (zg80[]) f282547d.clone();
    }
}
