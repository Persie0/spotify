package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class pmi0 {

    /* JADX INFO: renamed from: a */
    public static final pmi0 f179080a;

    /* JADX INFO: renamed from: b */
    public static final pmi0 f179081b;

    /* JADX INFO: renamed from: c */
    public static final pmi0 f179082c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pmi0[] f179083d;

    static {
        pmi0 pmi0Var = new pmi0("RowClicked", 0);
        f179080a = pmi0Var;
        pmi0 pmi0Var2 = new pmi0("RowLongClicked", 1);
        f179081b = pmi0Var2;
        pmi0 pmi0Var3 = new pmi0("ContextMenuClicked", 2);
        f179082c = pmi0Var3;
        f179083d = new pmi0[]{pmi0Var, pmi0Var2, pmi0Var3};
    }

    public static pmi0 valueOf(String str) {
        return (pmi0) Enum.valueOf(pmi0.class, str);
    }

    public static pmi0[] values() {
        return (pmi0[]) f179083d.clone();
    }
}
