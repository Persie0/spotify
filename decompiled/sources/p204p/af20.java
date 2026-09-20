package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class af20 {

    /* JADX INFO: renamed from: a */
    public static final af20 f15007a;

    /* JADX INFO: renamed from: b */
    public static final af20 f15008b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ af20[] f15009c;

    static {
        af20 af20Var = new af20("NEXT", 0);
        f15007a = af20Var;
        af20 af20Var2 = new af20("SKIP", 1);
        f15008b = af20Var2;
        f15009c = new af20[]{af20Var, af20Var2};
    }

    public static af20 valueOf(String str) {
        return (af20) Enum.valueOf(af20.class, str);
    }

    public static af20[] values() {
        return (af20[]) f15009c.clone();
    }
}
