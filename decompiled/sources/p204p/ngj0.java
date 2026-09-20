package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ngj0 {

    /* JADX INFO: renamed from: a */
    public static final ngj0 f153722a;

    /* JADX INFO: renamed from: b */
    public static final ngj0 f153723b;

    /* JADX INFO: renamed from: c */
    public static final ngj0 f153724c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ngj0[] f153725d;

    static {
        ngj0 ngj0Var = new ngj0("ENABLED", 0);
        f153722a = ngj0Var;
        ngj0 ngj0Var2 = new ngj0("DISABLED", 1);
        f153723b = ngj0Var2;
        ngj0 ngj0Var3 = new ngj0("UNKNOWN", 2);
        f153724c = ngj0Var3;
        f153725d = new ngj0[]{ngj0Var, ngj0Var2, ngj0Var3};
    }

    public static ngj0 valueOf(String str) {
        return (ngj0) Enum.valueOf(ngj0.class, str);
    }

    public static ngj0[] values() {
        return (ngj0[]) f153725d.clone();
    }
}
