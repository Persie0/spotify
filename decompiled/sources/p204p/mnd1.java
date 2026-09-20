package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class mnd1 {

    /* JADX INFO: renamed from: a */
    public static final mnd1 f145411a;

    /* JADX INFO: renamed from: b */
    public static final mnd1 f145412b;

    /* JADX INFO: renamed from: c */
    public static final mnd1 f145413c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ mnd1[] f145414d;

    static {
        mnd1 mnd1Var = new mnd1("Loading", 0);
        f145411a = mnd1Var;
        mnd1 mnd1Var2 = new mnd1("Content", 1);
        f145412b = mnd1Var2;
        mnd1 mnd1Var3 = new mnd1("Error", 2);
        f145413c = mnd1Var3;
        f145414d = new mnd1[]{mnd1Var, mnd1Var2, mnd1Var3};
    }

    public static mnd1 valueOf(String str) {
        return (mnd1) Enum.valueOf(mnd1.class, str);
    }

    public static mnd1[] values() {
        return (mnd1[]) f145414d.clone();
    }
}
