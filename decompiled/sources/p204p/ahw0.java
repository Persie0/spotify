package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ahw0 {

    /* JADX INFO: renamed from: a */
    public static final ahw0 f15810a;

    /* JADX INFO: renamed from: b */
    public static final ahw0 f15811b;

    /* JADX INFO: renamed from: c */
    public static final ahw0 f15812c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ahw0[] f15813d;

    static {
        ahw0 ahw0Var = new ahw0("NegativeSignalHit", 0);
        f15810a = ahw0Var;
        ahw0 ahw0Var2 = new ahw0("BanHit", 1);
        f15811b = ahw0Var2;
        ahw0 ahw0Var3 = new ahw0("UnbanHit", 2);
        f15812c = ahw0Var3;
        f15813d = new ahw0[]{ahw0Var, ahw0Var2, ahw0Var3};
    }

    public static ahw0 valueOf(String str) {
        return (ahw0) Enum.valueOf(ahw0.class, str);
    }

    public static ahw0[] values() {
        return (ahw0[]) f15813d.clone();
    }
}
