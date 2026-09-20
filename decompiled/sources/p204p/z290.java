package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class z290 {

    /* JADX INFO: renamed from: a */
    public static final z290 f278517a;

    /* JADX INFO: renamed from: b */
    public static final z290 f278518b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z290[] f278519c;

    static {
        z290 z290Var = new z290("LEGACY", 0);
        f278517a = z290Var;
        z290 z290Var2 = new z290("FLOW", 1);
        f278518b = z290Var2;
        f278519c = new z290[]{z290Var, z290Var2};
    }

    public static z290 valueOf(String str) {
        return (z290) Enum.valueOf(z290.class, str);
    }

    public static z290[] values() {
        return (z290[]) f278519c.clone();
    }
}
