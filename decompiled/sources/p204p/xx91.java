package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xx91 {

    /* JADX INFO: renamed from: a */
    public static final xx91 f266922a;

    /* JADX INFO: renamed from: b */
    public static final xx91 f266923b;

    /* JADX INFO: renamed from: c */
    public static final xx91 f266924c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xx91[] f266925d;

    static {
        xx91 xx91Var = new xx91("Unavailable", 0);
        f266922a = xx91Var;
        xx91 xx91Var2 = new xx91("Inactive", 1);
        f266923b = xx91Var2;
        xx91 xx91Var3 = new xx91("Active", 2);
        f266924c = xx91Var3;
        f266925d = new xx91[]{xx91Var, xx91Var2, xx91Var3};
    }

    public static xx91 valueOf(String str) {
        return (xx91) Enum.valueOf(xx91.class, str);
    }

    public static xx91[] values() {
        return (xx91[]) f266925d.clone();
    }
}
