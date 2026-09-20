package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class cav0 {

    /* JADX INFO: renamed from: a */
    public static final cav0 f35937a;

    /* JADX INFO: renamed from: b */
    public static final cav0 f35938b;

    /* JADX INFO: renamed from: c */
    public static final cav0 f35939c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cav0[] f35940d;

    static {
        cav0 cav0Var = new cav0("CAN_BE_ADDED", 0);
        f35937a = cav0Var;
        cav0 cav0Var2 = new cav0("IS_ADDED", 1);
        f35938b = cav0Var2;
        cav0 cav0Var3 = new cav0("NONE", 2);
        f35939c = cav0Var3;
        f35940d = new cav0[]{cav0Var, cav0Var2, cav0Var3};
    }

    public static cav0 valueOf(String str) {
        return (cav0) Enum.valueOf(cav0.class, str);
    }

    public static cav0[] values() {
        return (cav0[]) f35940d.clone();
    }
}
