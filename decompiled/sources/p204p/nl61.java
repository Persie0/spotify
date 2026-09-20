package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class nl61 {

    /* JADX INFO: renamed from: a */
    public static final nl61 f155013a;

    /* JADX INFO: renamed from: b */
    public static final nl61 f155014b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nl61[] f155015c;

    static {
        nl61 nl61Var = new nl61("Tabs", 0);
        f155013a = nl61Var;
        nl61 nl61Var2 = new nl61("Indicator", 1);
        f155014b = nl61Var2;
        f155015c = new nl61[]{nl61Var, nl61Var2};
    }

    public static nl61 valueOf(String str) {
        return (nl61) Enum.valueOf(nl61.class, str);
    }

    public static nl61[] values() {
        return (nl61[]) f155015c.clone();
    }
}
