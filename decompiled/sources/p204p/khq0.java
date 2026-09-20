package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class khq0 {

    /* JADX INFO: renamed from: a */
    public static final khq0 f122707a;

    /* JADX INFO: renamed from: b */
    public static final khq0 f122708b;

    /* JADX INFO: renamed from: c */
    public static final khq0 f122709c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ khq0[] f122710d;

    static {
        khq0 khq0Var = new khq0("Click", 0);
        f122707a = khq0Var;
        khq0 khq0Var2 = new khq0("Clear", 1);
        f122708b = khq0Var2;
        khq0 khq0Var3 = new khq0("Confirm", 2);
        f122709c = khq0Var3;
        f122710d = new khq0[]{khq0Var, khq0Var2, khq0Var3};
    }

    public static khq0 valueOf(String str) {
        return (khq0) Enum.valueOf(khq0.class, str);
    }

    public static khq0[] values() {
        return (khq0[]) f122710d.clone();
    }
}
