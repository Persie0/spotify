package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fb80 {

    /* JADX INFO: renamed from: a */
    public static final fb80 f67750a;

    /* JADX INFO: renamed from: b */
    public static final fb80 f67751b;

    /* JADX INFO: renamed from: c */
    public static final fb80 f67752c;

    /* JADX INFO: renamed from: d */
    public static final fb80 f67753d;

    /* JADX INFO: renamed from: e */
    public static final fb80 f67754e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ fb80[] f67755f;

    static {
        fb80 fb80Var = new fb80("DESTROYED", 0);
        f67750a = fb80Var;
        fb80 fb80Var2 = new fb80("INITIALIZED", 1);
        f67751b = fb80Var2;
        fb80 fb80Var3 = new fb80("CREATED", 2);
        f67752c = fb80Var3;
        fb80 fb80Var4 = new fb80("STARTED", 3);
        f67753d = fb80Var4;
        fb80 fb80Var5 = new fb80("RESUMED", 4);
        f67754e = fb80Var5;
        f67755f = new fb80[]{fb80Var, fb80Var2, fb80Var3, fb80Var4, fb80Var5};
    }

    public static fb80 valueOf(String str) {
        return (fb80) Enum.valueOf(fb80.class, str);
    }

    public static fb80[] values() {
        return (fb80[]) f67755f.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41223a(fb80 fb80Var) {
        return compareTo(fb80Var) >= 0;
    }
}
