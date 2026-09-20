package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class z1f0 {

    /* JADX INFO: renamed from: a */
    public static final z1f0 f278303a;

    /* JADX INFO: renamed from: b */
    public static final z1f0 f278304b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z1f0[] f278305c;

    static {
        z1f0 z1f0Var = new z1f0("OnShuffleAnywayClicked", 0);
        f278303a = z1f0Var;
        z1f0 z1f0Var2 = new z1f0("OnTurnOffShuffleClicked", 1);
        f278304b = z1f0Var2;
        f278305c = new z1f0[]{z1f0Var, z1f0Var2};
    }

    public static z1f0 valueOf(String str) {
        return (z1f0) Enum.valueOf(z1f0.class, str);
    }

    public static z1f0[] values() {
        return (z1f0[]) f278305c.clone();
    }
}
