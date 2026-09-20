package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nw1 {

    /* JADX INFO: renamed from: a */
    public static final nw1 f158998a;

    /* JADX INFO: renamed from: b */
    public static final nw1 f158999b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nw1[] f159000c;

    static {
        nw1 nw1Var = new nw1("EDIT", 0);
        f158998a = nw1Var;
        nw1 nw1Var2 = new nw1("VIEW", 1);
        f158999b = nw1Var2;
        f159000c = new nw1[]{nw1Var, nw1Var2};
    }

    public static nw1 valueOf(String str) {
        return (nw1) Enum.valueOf(nw1.class, str);
    }

    public static nw1[] values() {
        return (nw1[]) f159000c.clone();
    }
}
