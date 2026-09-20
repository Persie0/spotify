package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lzu0 {

    /* JADX INFO: renamed from: a */
    public static final lzu0 f138454a;

    /* JADX INFO: renamed from: b */
    public static final lzu0 f138455b;

    /* JADX INFO: renamed from: c */
    public static final lzu0 f138456c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ lzu0[] f138457d;

    static {
        lzu0 lzu0Var = new lzu0("Played", 0);
        f138454a = lzu0Var;
        lzu0 lzu0Var2 = new lzu0("Saved", 1);
        f138455b = lzu0Var2;
        lzu0 lzu0Var3 = new lzu0("Seen", 2);
        f138456c = lzu0Var3;
        f138457d = new lzu0[]{lzu0Var, lzu0Var2, lzu0Var3};
    }

    public static lzu0 valueOf(String str) {
        return (lzu0) Enum.valueOf(lzu0.class, str);
    }

    public static lzu0[] values() {
        return (lzu0[]) f138457d.clone();
    }
}
