package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ig4 {

    /* JADX INFO: renamed from: a */
    public static final ig4 f101877a;

    /* JADX INFO: renamed from: b */
    public static final ig4 f101878b;

    /* JADX INFO: renamed from: c */
    public static final ig4 f101879c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ig4[] f101880d;

    static {
        ig4 ig4Var = new ig4("Connecting", 0);
        f101877a = ig4Var;
        ig4 ig4Var2 = new ig4("LoggedIn", 1);
        f101878b = ig4Var2;
        ig4 ig4Var3 = new ig4("LoggedOut", 2);
        f101879c = ig4Var3;
        f101880d = new ig4[]{ig4Var, ig4Var2, ig4Var3};
    }

    public static ig4 valueOf(String str) {
        return (ig4) Enum.valueOf(ig4.class, str);
    }

    public static ig4[] values() {
        return (ig4[]) f101880d.clone();
    }
}
