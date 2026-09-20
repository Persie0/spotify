package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wp51 {

    /* JADX INFO: renamed from: a */
    public static final wp51 f253683a;

    /* JADX INFO: renamed from: b */
    public static final wp51 f253684b;

    /* JADX INFO: renamed from: c */
    public static final wp51 f253685c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ wp51[] f253686d;

    static {
        wp51 wp51Var = new wp51("None", 0);
        f253683a = wp51Var;
        wp51 wp51Var2 = new wp51("Public", 1);
        f253684b = wp51Var2;
        wp51 wp51Var3 = new wp51("Locked", 2);
        f253685c = wp51Var3;
        f253686d = new wp51[]{wp51Var, wp51Var2, wp51Var3};
    }

    public static wp51 valueOf(String str) {
        return (wp51) Enum.valueOf(wp51.class, str);
    }

    public static wp51[] values() {
        return (wp51[]) f253686d.clone();
    }
}
