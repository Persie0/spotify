package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ss10 {

    /* JADX INFO: renamed from: a */
    public static final ss10 f213451a;

    /* JADX INFO: renamed from: b */
    public static final ss10 f213452b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ss10[] f213453c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f213454d;

    static {
        ss10 ss10Var = new ss10("KIDS_TO_SELF_MANAGED", 0);
        f213451a = ss10Var;
        ss10 ss10Var2 = new ss10("KIDS_TO_TEEN", 1);
        f213452b = ss10Var2;
        ss10[] ss10VarArr = {ss10Var, ss10Var2};
        f213453c = ss10VarArr;
        f213454d = new nzv(ss10VarArr);
    }

    public static ss10 valueOf(String str) {
        return (ss10) Enum.valueOf(ss10.class, str);
    }

    public static ss10[] values() {
        return (ss10[]) f213453c.clone();
    }
}
