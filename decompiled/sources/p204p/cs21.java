package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class cs21 {

    /* JADX INFO: renamed from: a */
    public static final cs21 f41448a;

    /* JADX INFO: renamed from: b */
    public static final cs21 f41449b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cs21[] f41450c;

    static {
        cs21 cs21Var = new cs21("Inner", 0);
        f41448a = cs21Var;
        cs21 cs21Var2 = new cs21("Items", 1);
        f41449b = cs21Var2;
        f41450c = new cs21[]{cs21Var, cs21Var2};
    }

    public static cs21 valueOf(String str) {
        return (cs21) Enum.valueOf(cs21.class, str);
    }

    public static cs21[] values() {
        return (cs21[]) f41450c.clone();
    }
}
