package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class li41 {

    /* JADX INFO: renamed from: a */
    public static final li41 f133722a;

    /* JADX INFO: renamed from: b */
    public static final li41 f133723b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ li41[] f133724c;

    static {
        li41 li41Var = new li41("Normal", 0);
        f133722a = li41Var;
        li41 li41Var2 = new li41("FullBleed", 1);
        f133723b = li41Var2;
        f133724c = new li41[]{li41Var, li41Var2};
    }

    public static li41 valueOf(String str) {
        return (li41) Enum.valueOf(li41.class, str);
    }

    public static li41[] values() {
        return (li41[]) f133724c.clone();
    }
}
