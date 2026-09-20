package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class pwr0 {

    /* JADX INFO: renamed from: a */
    public static final pwr0 f182101a;

    /* JADX INFO: renamed from: b */
    public static final pwr0 f182102b;

    /* JADX INFO: renamed from: c */
    public static final pwr0 f182103c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pwr0[] f182104d;

    static {
        pwr0 pwr0Var = new pwr0("FOLLOW", 0);
        f182101a = pwr0Var;
        pwr0 pwr0Var2 = new pwr0("UNFOLLOW", 1);
        f182102b = pwr0Var2;
        pwr0 pwr0Var3 = new pwr0("FOLLOW_BACK", 2);
        f182103c = pwr0Var3;
        f182104d = new pwr0[]{pwr0Var, pwr0Var2, pwr0Var3};
    }

    public static pwr0 valueOf(String str) {
        return (pwr0) Enum.valueOf(pwr0.class, str);
    }

    public static pwr0[] values() {
        return (pwr0[]) f182104d.clone();
    }
}
