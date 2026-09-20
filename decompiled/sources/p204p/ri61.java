package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ri61 {

    /* JADX INFO: renamed from: a */
    public static final ri61 f199442a;

    /* JADX INFO: renamed from: b */
    public static final ri61 f199443b;

    /* JADX INFO: renamed from: c */
    public static final ri61 f199444c;

    /* JADX INFO: renamed from: d */
    public static final ri61 f199445d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ri61[] f199446e;

    static {
        ri61 ri61Var = new ri61("FIRST", 0);
        f199442a = ri61Var;
        ri61 ri61Var2 = new ri61("SECOND", 1);
        f199443b = ri61Var2;
        ri61 ri61Var3 = new ri61("THIRD", 2);
        f199444c = ri61Var3;
        ri61 ri61Var4 = new ri61("FOURTH", 3);
        f199445d = ri61Var4;
        f199446e = new ri61[]{ri61Var, ri61Var2, ri61Var3, ri61Var4};
    }

    public static ri61 valueOf(String str) {
        return (ri61) Enum.valueOf(ri61.class, str);
    }

    public static ri61[] values() {
        return (ri61[]) f199446e.clone();
    }
}
