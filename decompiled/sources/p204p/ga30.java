package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ga30 {

    /* JADX INFO: renamed from: a */
    public static final ga30 f77961a;

    /* JADX INFO: renamed from: b */
    public static final ga30 f77962b;

    /* JADX INFO: renamed from: c */
    public static final ga30 f77963c;

    /* JADX INFO: renamed from: d */
    public static final ga30 f77964d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ga30[] f77965e;

    static {
        ga30 ga30Var = new ga30("LEARN_MORE_CLICKED", 0);
        f77961a = ga30Var;
        ga30 ga30Var2 = new ga30("DISMISSED", 1);
        f77962b = ga30Var2;
        ga30 ga30Var3 = new ga30("ACCEPT_SINGLE_REQUEST", 2);
        f77963c = ga30Var3;
        ga30 ga30Var4 = new ga30("DECLINE_SINGLE_REQUEST", 3);
        f77964d = ga30Var4;
        f77965e = new ga30[]{ga30Var, ga30Var2, ga30Var3, ga30Var4};
    }

    public static ga30 valueOf(String str) {
        return (ga30) Enum.valueOf(ga30.class, str);
    }

    public static ga30[] values() {
        return (ga30[]) f77965e.clone();
    }
}
