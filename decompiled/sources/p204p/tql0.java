package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tql0 {

    /* JADX INFO: renamed from: a */
    public static final tql0 f222829a;

    /* JADX INFO: renamed from: b */
    public static final tql0 f222830b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tql0[] f222831c;

    static {
        tql0 tql0Var = new tql0("DOWNLOAD", 0);
        f222829a = tql0Var;
        tql0 tql0Var2 = new tql0("REMOVAL", 1);
        f222830b = tql0Var2;
        f222831c = new tql0[]{tql0Var, tql0Var2};
    }

    public static tql0 valueOf(String str) {
        return (tql0) Enum.valueOf(tql0.class, str);
    }

    public static tql0[] values() {
        return (tql0[]) f222831c.clone();
    }
}
