package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class zma0 {

    /* JADX INFO: renamed from: a */
    public static final zma0 f284204a;

    /* JADX INFO: renamed from: b */
    public static final zma0 f284205b;

    /* JADX INFO: renamed from: c */
    public static final zma0 f284206c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zma0[] f284207d;

    static {
        zma0 zma0Var = new zma0("NOT_COMPUTED", 0);
        f284204a = zma0Var;
        zma0 zma0Var2 = new zma0("COMPUTING", 1);
        f284205b = zma0Var2;
        zma0 zma0Var3 = new zma0("RECURSION_WAS_DETECTED", 2);
        f284206c = zma0Var3;
        f284207d = new zma0[]{zma0Var, zma0Var2, zma0Var3};
    }

    public static zma0 valueOf(String str) {
        return (zma0) Enum.valueOf(zma0.class, str);
    }

    public static zma0[] values() {
        return (zma0[]) f284207d.clone();
    }
}
