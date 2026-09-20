package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class syz0 {

    /* JADX INFO: renamed from: a */
    public static final syz0 f215349a;

    /* JADX INFO: renamed from: b */
    public static final syz0 f215350b;

    /* JADX INFO: renamed from: c */
    public static final syz0 f215351c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ syz0[] f215352d;

    static {
        syz0 syz0Var = new syz0("LOADING", 0);
        f215349a = syz0Var;
        syz0 syz0Var2 = new syz0("SELECTED", 1);
        f215350b = syz0Var2;
        syz0 syz0Var3 = new syz0("UNSELECTED", 2);
        f215351c = syz0Var3;
        f215352d = new syz0[]{syz0Var, syz0Var2, syz0Var3};
    }

    public static syz0 valueOf(String str) {
        return (syz0) Enum.valueOf(syz0.class, str);
    }

    public static syz0[] values() {
        return (syz0[]) f215352d.clone();
    }
}
