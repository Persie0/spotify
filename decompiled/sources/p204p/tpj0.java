package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class tpj0 {

    /* JADX INFO: renamed from: a */
    public static final tpj0 f222554a;

    /* JADX INFO: renamed from: b */
    public static final tpj0 f222555b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tpj0[] f222556c;

    static {
        tpj0 tpj0Var = new tpj0("OnGoToHomeClicked", 0);
        f222554a = tpj0Var;
        tpj0 tpj0Var2 = new tpj0("OnUnfollowClicked", 1);
        f222555b = tpj0Var2;
        f222556c = new tpj0[]{tpj0Var, tpj0Var2};
    }

    public static tpj0 valueOf(String str) {
        return (tpj0) Enum.valueOf(tpj0.class, str);
    }

    public static tpj0[] values() {
        return (tpj0[]) f222556c.clone();
    }
}
