package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bgy0 {

    /* JADX INFO: renamed from: a */
    public static final bgy0 f27027a;

    /* JADX INFO: renamed from: b */
    public static final bgy0 f27028b;

    /* JADX INFO: renamed from: c */
    public static final bgy0 f27029c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bgy0[] f27030d;

    static {
        bgy0 bgy0Var = new bgy0("NETWORK_UNMETERED", 0);
        f27027a = bgy0Var;
        bgy0 bgy0Var2 = new bgy0("DEVICE_IDLE", 1);
        f27028b = bgy0Var2;
        bgy0 bgy0Var3 = new bgy0("DEVICE_CHARGING", 2);
        f27029c = bgy0Var3;
        f27030d = new bgy0[]{bgy0Var, bgy0Var2, bgy0Var3};
    }

    public static bgy0 valueOf(String str) {
        return (bgy0) Enum.valueOf(bgy0.class, str);
    }

    public static bgy0[] values() {
        return (bgy0[]) f27030d.clone();
    }
}
