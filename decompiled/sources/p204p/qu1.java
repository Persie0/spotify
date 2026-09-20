package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class qu1 implements su1 {

    /* JADX INFO: renamed from: a */
    public static final qu1 f192536a;

    /* JADX INFO: renamed from: b */
    public static final qu1 f192537b;

    /* JADX INFO: renamed from: c */
    public static final qu1 f192538c;

    /* JADX INFO: renamed from: d */
    public static final qu1 f192539d;

    /* JADX INFO: renamed from: e */
    public static final qu1 f192540e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qu1[] f192541f;

    static {
        qu1 qu1Var = new qu1("MftDisallowReason", 0);
        f192536a = qu1Var;
        qu1 qu1Var2 = new qu1("NotPlayingContextReason", 1);
        f192537b = qu1Var2;
        qu1 qu1Var3 = new qu1("MftUpsellReason", 2);
        f192538c = qu1Var3;
        qu1 qu1Var4 = new qu1("UnsupportedUriType", 3);
        f192539d = qu1Var4;
        qu1 qu1Var5 = new qu1("GeneralError", 4);
        f192540e = qu1Var5;
        f192541f = new qu1[]{qu1Var, qu1Var2, qu1Var3, qu1Var4, qu1Var5};
    }

    public static qu1 valueOf(String str) {
        return (qu1) Enum.valueOf(qu1.class, str);
    }

    public static qu1[] values() {
        return (qu1[]) f192541f.clone();
    }
}
