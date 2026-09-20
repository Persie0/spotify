package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j931 {

    /* JADX INFO: renamed from: a */
    public static final j931 f110084a;

    /* JADX INFO: renamed from: b */
    public static final j931 f110085b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ j931[] f110086c;

    static {
        j931 j931Var = new j931("Dismissed", 0);
        f110084a = j931Var;
        j931 j931Var2 = new j931("ActionPerformed", 1);
        f110085b = j931Var2;
        f110086c = new j931[]{j931Var, j931Var2};
    }

    public static j931 valueOf(String str) {
        return (j931) Enum.valueOf(j931.class, str);
    }

    public static j931[] values() {
        return (j931[]) f110086c.clone();
    }
}
