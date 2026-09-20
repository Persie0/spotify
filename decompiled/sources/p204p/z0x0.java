package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z0x0 {

    /* JADX INFO: renamed from: a */
    public static final z0x0 f278180a;

    /* JADX INFO: renamed from: b */
    public static final z0x0 f278181b;

    /* JADX INFO: renamed from: c */
    public static final z0x0 f278182c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ z0x0[] f278183d;

    static {
        z0x0 z0x0Var = new z0x0("STRICT", 0);
        f278180a = z0x0Var;
        z0x0 z0x0Var2 = new z0x0("SMART", 1);
        f278181b = z0x0Var2;
        z0x0 z0x0Var3 = new z0x0("LENIENT", 2);
        f278182c = z0x0Var3;
        f278183d = new z0x0[]{z0x0Var, z0x0Var2, z0x0Var3};
    }

    public static z0x0 valueOf(String str) {
        return (z0x0) Enum.valueOf(z0x0.class, str);
    }

    public static z0x0[] values() {
        return (z0x0[]) f278183d.clone();
    }
}
