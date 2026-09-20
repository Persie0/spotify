package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class q700 {

    /* JADX INFO: renamed from: a */
    public static final q700 f185972a;

    /* JADX INFO: renamed from: b */
    public static final q700 f185973b;

    /* JADX INFO: renamed from: c */
    public static final q700 f185974c;

    /* JADX INFO: renamed from: d */
    public static final q700 f185975d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ q700[] f185976e;

    static {
        q700 q700Var = new q700("CURRENT", 0);
        f185972a = q700Var;
        q700 q700Var2 = new q700("OCCLUDED_BY_NAVIGATION_OVERLAY", 1);
        f185973b = q700Var2;
        q700 q700Var3 = new q700("OCCLUDED_BY_DIALOG", 2);
        f185974c = q700Var3;
        q700 q700Var4 = new q700("NOT_CURRENT", 3);
        f185975d = q700Var4;
        f185976e = new q700[]{q700Var, q700Var2, q700Var3, q700Var4};
    }

    public static q700 valueOf(String str) {
        return (q700) Enum.valueOf(q700.class, str);
    }

    public static q700[] values() {
        return (q700[]) f185976e.clone();
    }
}
