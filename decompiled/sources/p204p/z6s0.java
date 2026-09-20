package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class z6s0 {

    /* JADX INFO: renamed from: a */
    public static final z6s0 f279987a;

    /* JADX INFO: renamed from: b */
    public static final z6s0 f279988b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z6s0[] f279989c;

    static {
        z6s0 z6s0Var = new z6s0("PAUSED", 0);
        f279987a = z6s0Var;
        z6s0 z6s0Var2 = new z6s0("RESUMED", 1);
        f279988b = z6s0Var2;
        f279989c = new z6s0[]{z6s0Var, z6s0Var2};
    }

    public static z6s0 valueOf(String str) {
        return (z6s0) Enum.valueOf(z6s0.class, str);
    }

    public static z6s0[] values() {
        return (z6s0[]) f279989c.clone();
    }
}
