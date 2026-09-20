package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z3i0 {

    /* JADX INFO: renamed from: a */
    public static final z3i0 f278964a;

    /* JADX INFO: renamed from: b */
    public static final z3i0 f278965b;

    /* JADX INFO: renamed from: c */
    public static final z3i0 f278966c;

    /* JADX INFO: renamed from: d */
    public static final z3i0 f278967d;

    /* JADX INFO: renamed from: e */
    public static final z3i0 f278968e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ z3i0[] f278969f;

    static {
        z3i0 z3i0Var = new z3i0("IDLE", 0);
        f278964a = z3i0Var;
        z3i0 z3i0Var2 = new z3i0("SYNCING", 1);
        f278965b = z3i0Var2;
        z3i0 z3i0Var3 = new z3i0("SYNCED", 2);
        f278966c = z3i0Var3;
        z3i0 z3i0Var4 = new z3i0("PRUNING", 3);
        f278967d = z3i0Var4;
        z3i0 z3i0Var5 = new z3i0("CANCELLED", 4);
        f278968e = z3i0Var5;
        f278969f = new z3i0[]{z3i0Var, z3i0Var2, z3i0Var3, z3i0Var4, z3i0Var5};
    }

    public static z3i0 valueOf(String str) {
        return (z3i0) Enum.valueOf(z3i0.class, str);
    }

    public static z3i0[] values() {
        return (z3i0[]) f278969f.clone();
    }
}
