package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class afa0 {

    /* JADX INFO: renamed from: a */
    public static final afa0 f15105a;

    /* JADX INFO: renamed from: b */
    public static final afa0 f15106b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ afa0[] f15107c;

    static {
        afa0 afa0Var = new afa0("CONNECTED", 0);
        f15105a = afa0Var;
        afa0 afa0Var2 = new afa0("NOT_CONNECTED", 1);
        f15106b = afa0Var2;
        f15107c = new afa0[]{afa0Var, afa0Var2};
    }

    public static afa0 valueOf(String str) {
        return (afa0) Enum.valueOf(afa0.class, str);
    }

    public static afa0[] values() {
        return (afa0[]) f15107c.clone();
    }
}
