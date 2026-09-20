package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q7f0 {

    /* JADX INFO: renamed from: a */
    public static final q7f0 f186090a;

    /* JADX INFO: renamed from: b */
    public static final q7f0 f186091b;

    /* JADX INFO: renamed from: c */
    public static final q7f0 f186092c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ q7f0[] f186093d;

    static {
        q7f0 q7f0Var = new q7f0("Error", 0);
        f186090a = q7f0Var;
        q7f0 q7f0Var2 = new q7f0("Loaded", 1);
        f186091b = q7f0Var2;
        q7f0 q7f0Var3 = new q7f0("Loading", 2);
        f186092c = q7f0Var3;
        f186093d = new q7f0[]{q7f0Var, q7f0Var2, q7f0Var3};
    }

    public static q7f0 valueOf(String str) {
        return (q7f0) Enum.valueOf(q7f0.class, str);
    }

    public static q7f0[] values() {
        return (q7f0[]) f186093d.clone();
    }
}
