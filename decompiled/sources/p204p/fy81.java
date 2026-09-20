package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fy81 {

    /* JADX INFO: renamed from: a */
    public static final fy81 f74655a;

    /* JADX INFO: renamed from: b */
    public static final fy81 f74656b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fy81[] f74657c;

    static {
        fy81 fy81Var = new fy81("DEFERRED", 0);
        f74655a = fy81Var;
        fy81 fy81Var2 = new fy81("IMMEDIATE", 1);
        f74656b = fy81Var2;
        f74657c = new fy81[]{fy81Var, fy81Var2, new fy81("EXCLUSIVE", 2)};
    }

    public static fy81 valueOf(String str) {
        return (fy81) Enum.valueOf(fy81.class, str);
    }

    public static fy81[] values() {
        return (fy81[]) f74657c.clone();
    }
}
