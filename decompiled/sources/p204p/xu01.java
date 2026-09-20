package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class xu01 {

    /* JADX INFO: renamed from: a */
    public static final xu01 f265968a;

    /* JADX INFO: renamed from: b */
    public static final xu01 f265969b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xu01[] f265970c;

    static {
        xu01 xu01Var = new xu01("Explicit", 0);
        f265968a = xu01Var;
        xu01 xu01Var2 = new xu01("NineteenPlus", 1);
        f265969b = xu01Var2;
        f265970c = new xu01[]{xu01Var, xu01Var2};
    }

    public static xu01 valueOf(String str) {
        return (xu01) Enum.valueOf(xu01.class, str);
    }

    public static xu01[] values() {
        return (xu01[]) f265970c.clone();
    }
}
