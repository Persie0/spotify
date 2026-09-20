package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class to8 {

    /* JADX INFO: renamed from: a */
    public static final to8 f222196a;

    /* JADX INFO: renamed from: b */
    public static final to8 f222197b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ to8[] f222198c;

    static {
        to8 to8Var = new to8("EXPONENTIAL", 0);
        f222196a = to8Var;
        to8 to8Var2 = new to8("LINEAR", 1);
        f222197b = to8Var2;
        f222198c = new to8[]{to8Var, to8Var2};
    }

    public static to8 valueOf(String str) {
        return (to8) Enum.valueOf(to8.class, str);
    }

    public static to8[] values() {
        return (to8[]) f222198c.clone();
    }
}
