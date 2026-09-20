package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class onc0 {

    /* JADX INFO: renamed from: a */
    public static final onc0 f167227a;

    /* JADX INFO: renamed from: b */
    public static final onc0 f167228b;

    /* JADX INFO: renamed from: c */
    public static final onc0 f167229c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ onc0[] f167230d;

    static {
        onc0 onc0Var = new onc0("DEFAULT", 0);
        f167227a = onc0Var;
        onc0 onc0Var2 = new onc0("GBB", 1);
        f167228b = onc0Var2;
        onc0 onc0Var3 = new onc0("UNKNOWN", 2);
        f167229c = onc0Var3;
        f167230d = new onc0[]{onc0Var, onc0Var2, onc0Var3};
    }

    public static onc0 valueOf(String str) {
        return (onc0) Enum.valueOf(onc0.class, str);
    }

    public static onc0[] values() {
        return (onc0[]) f167230d.clone();
    }
}
