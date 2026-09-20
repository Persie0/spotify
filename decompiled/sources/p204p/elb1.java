package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class elb1 {

    /* JADX INFO: renamed from: a */
    public static final elb1 f60679a;

    /* JADX INFO: renamed from: b */
    public static final elb1 f60680b;

    /* JADX INFO: renamed from: c */
    public static final elb1 f60681c;

    /* JADX INFO: renamed from: d */
    public static final elb1 f60682d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ elb1[] f60683e;

    static {
        elb1 elb1Var = new elb1("COMPACT_FILL", 0);
        f60679a = elb1Var;
        elb1 elb1Var2 = new elb1("COMPACT_FIXED", 1);
        f60680b = elb1Var2;
        elb1 elb1Var3 = new elb1("EXPANDED", 2);
        f60681c = elb1Var3;
        elb1 elb1Var4 = new elb1("OVERLAY", 3);
        f60682d = elb1Var4;
        f60683e = new elb1[]{elb1Var, elb1Var2, elb1Var3, elb1Var4};
    }

    public static elb1 valueOf(String str) {
        return (elb1) Enum.valueOf(elb1.class, str);
    }

    public static elb1[] values() {
        return (elb1[]) f60683e.clone();
    }
}
