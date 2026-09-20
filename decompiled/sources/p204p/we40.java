package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class we40 {

    /* JADX INFO: renamed from: a */
    public static final we40 f250428a;

    /* JADX INFO: renamed from: b */
    public static final we40 f250429b;

    /* JADX INFO: renamed from: c */
    public static final we40 f250430c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ we40[] f250431d;

    static {
        we40 we40Var = new we40("NO_IMMERSIVE", 0);
        f250428a = we40Var;
        we40 we40Var2 = new we40("SEMI_IMMERSIVE", 1);
        f250429b = we40Var2;
        we40 we40Var3 = new we40("FULL_IMMERSIVE", 2);
        f250430c = we40Var3;
        f250431d = new we40[]{we40Var, we40Var2, we40Var3};
    }

    public static we40 valueOf(String str) {
        return (we40) Enum.valueOf(we40.class, str);
    }

    public static we40[] values() {
        return (we40[]) f250431d.clone();
    }
}
