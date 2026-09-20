package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ddr0 {

    /* JADX INFO: renamed from: a */
    public static final ddr0 f47855a;

    /* JADX INFO: renamed from: b */
    public static final ddr0 f47856b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ddr0[] f47857c;

    static {
        ddr0 ddr0Var = new ddr0("IDLE", 0);
        f47855a = ddr0Var;
        ddr0 ddr0Var2 = new ddr0("STREAMING", 1);
        f47856b = ddr0Var2;
        f47857c = new ddr0[]{ddr0Var, ddr0Var2};
    }

    public static ddr0 valueOf(String str) {
        return (ddr0) Enum.valueOf(ddr0.class, str);
    }

    public static ddr0[] values() {
        return (ddr0[]) f47857c.clone();
    }
}
