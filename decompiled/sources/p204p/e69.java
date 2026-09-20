package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e69 {

    /* JADX INFO: renamed from: a */
    public static final e69 f56588a;

    /* JADX INFO: renamed from: b */
    public static final e69 f56589b;

    /* JADX INFO: renamed from: c */
    public static final e69 f56590c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ e69[] f56591d;

    static {
        e69 e69Var = new e69("CELLULAR", 0);
        f56588a = e69Var;
        e69 e69Var2 = new e69("WIFI", 1);
        f56589b = e69Var2;
        e69 e69Var3 = new e69("UNKNOWN", 2);
        f56590c = e69Var3;
        f56591d = new e69[]{e69Var, e69Var2, e69Var3};
    }

    public static e69 valueOf(String str) {
        return (e69) Enum.valueOf(e69.class, str);
    }

    public static e69[] values() {
        return (e69[]) f56591d.clone();
    }
}
