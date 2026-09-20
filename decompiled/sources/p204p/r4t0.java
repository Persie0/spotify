package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class r4t0 {

    /* JADX INFO: renamed from: a */
    public static final r4t0 f195844a;

    /* JADX INFO: renamed from: b */
    public static final r4t0 f195845b;

    /* JADX INFO: renamed from: c */
    public static final r4t0 f195846c;

    /* JADX INFO: renamed from: d */
    public static final r4t0 f195847d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ r4t0[] f195848e;

    static {
        r4t0 r4t0Var = new r4t0("Connect", 0);
        f195844a = r4t0Var;
        r4t0 r4t0Var2 = new r4t0("Jam", 1);
        f195845b = r4t0Var2;
        r4t0 r4t0Var3 = new r4t0("Bluetooth", 2);
        f195846c = r4t0Var3;
        r4t0 r4t0Var4 = new r4t0("AppleTv", 3);
        f195847d = r4t0Var4;
        f195848e = new r4t0[]{r4t0Var, r4t0Var2, r4t0Var3, r4t0Var4};
    }

    public static r4t0 valueOf(String str) {
        return (r4t0) Enum.valueOf(r4t0.class, str);
    }

    public static r4t0[] values() {
        return (r4t0[]) f195848e.clone();
    }
}
