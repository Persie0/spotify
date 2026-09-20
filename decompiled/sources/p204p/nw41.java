package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class nw41 {

    /* JADX INFO: renamed from: a */
    public static final nw41 f159017a;

    /* JADX INFO: renamed from: b */
    public static final nw41 f159018b;

    /* JADX INFO: renamed from: c */
    public static final nw41 f159019c;

    /* JADX INFO: renamed from: d */
    public static final nw41 f159020d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nw41[] f159021e;

    static {
        nw41 nw41Var = new nw41("PAGE_MATCHED", 0);
        f159017a = nw41Var;
        nw41 nw41Var2 = new nw41("ALMOST_THERE", 1);
        f159018b = nw41Var2;
        nw41 nw41Var3 = new nw41("FLIP_FORWARD", 2);
        f159019c = nw41Var3;
        nw41 nw41Var4 = new nw41("FLIP_BACK", 3);
        f159020d = nw41Var4;
        f159021e = new nw41[]{nw41Var, nw41Var2, nw41Var3, nw41Var4};
    }

    public static nw41 valueOf(String str) {
        return (nw41) Enum.valueOf(nw41.class, str);
    }

    public static nw41[] values() {
        return (nw41[]) f159021e.clone();
    }
}
