package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ler0 {

    /* JADX INFO: renamed from: a */
    public static final ler0 f132669a;

    /* JADX INFO: renamed from: b */
    public static final ler0 f132670b;

    /* JADX INFO: renamed from: c */
    public static final ler0 f132671c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ler0[] f132672d;

    static {
        ler0 ler0Var = new ler0("DEFAULT", 0);
        f132669a = ler0Var;
        ler0 ler0Var2 = new ler0("VERY_LOW", 1);
        f132670b = ler0Var2;
        ler0 ler0Var3 = new ler0("HIGHEST", 2);
        f132671c = ler0Var3;
        f132672d = new ler0[]{ler0Var, ler0Var2, ler0Var3};
    }

    public static ler0 valueOf(String str) {
        return (ler0) Enum.valueOf(ler0.class, str);
    }

    public static ler0[] values() {
        return (ler0[]) f132672d.clone();
    }
}
