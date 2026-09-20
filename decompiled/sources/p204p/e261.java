package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e261 {

    /* JADX INFO: renamed from: a */
    public static final e261 f55370a;

    /* JADX INFO: renamed from: b */
    public static final e261 f55371b;

    /* JADX INFO: renamed from: c */
    public static final e261 f55372c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ e261[] f55373d;

    static {
        e261 e261Var = new e261("WHERE_TO_PLAY", 0);
        f55370a = e261Var;
        e261 e261Var2 = new e261("GOOGLE_INTENT_ENGINE", 1);
        f55371b = e261Var2;
        e261 e261Var3 = new e261("BLE_PROXIMITY", 2);
        f55372c = e261Var3;
        f55373d = new e261[]{e261Var, e261Var2, e261Var3};
    }

    public static e261 valueOf(String str) {
        return (e261) Enum.valueOf(e261.class, str);
    }

    public static e261[] values() {
        return (e261[]) f55373d.clone();
    }
}
