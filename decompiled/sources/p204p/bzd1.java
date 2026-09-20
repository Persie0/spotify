package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bzd1 {

    /* JADX INFO: renamed from: a */
    public static final bzd1 f32476a;

    /* JADX INFO: renamed from: b */
    public static final bzd1 f32477b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bzd1[] f32478c;

    static {
        bzd1 bzd1Var = new bzd1("PLUGGED", 0);
        f32476a = bzd1Var;
        bzd1 bzd1Var2 = new bzd1("UNPLUGGED", 1);
        f32477b = bzd1Var2;
        f32478c = new bzd1[]{bzd1Var, bzd1Var2};
    }

    public static bzd1 valueOf(String str) {
        return (bzd1) Enum.valueOf(bzd1.class, str);
    }

    public static bzd1[] values() {
        return (bzd1[]) f32478c.clone();
    }
}
