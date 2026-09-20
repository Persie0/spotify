package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class iw21 {

    /* JADX INFO: renamed from: a */
    public static final iw21 f106328a;

    /* JADX INFO: renamed from: b */
    public static final iw21 f106329b;

    /* JADX INFO: renamed from: c */
    public static final iw21 f106330c;

    /* JADX INFO: renamed from: d */
    public static final iw21 f106331d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ iw21[] f106332e;

    static {
        iw21 iw21Var = new iw21("QUEUED", 0);
        f106328a = iw21Var;
        iw21 iw21Var2 = new iw21("PRESENTED", 1);
        f106329b = iw21Var2;
        iw21 iw21Var3 = new iw21("DISMISSED", 2);
        f106330c = iw21Var3;
        iw21 iw21Var4 = new iw21("CANCELLED", 3);
        f106331d = iw21Var4;
        f106332e = new iw21[]{iw21Var, iw21Var2, iw21Var3, iw21Var4};
    }

    public static iw21 valueOf(String str) {
        return (iw21) Enum.valueOf(iw21.class, str);
    }

    public static iw21[] values() {
        return (iw21[]) f106332e.clone();
    }
}
