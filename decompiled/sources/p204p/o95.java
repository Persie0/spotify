package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o95 {

    /* JADX INFO: renamed from: a */
    public static final o95 f162945a;

    /* JADX INFO: renamed from: b */
    public static final o95 f162946b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ o95[] f162947c;

    static {
        o95 o95Var = new o95("MOBILE_INSTALL_EVENT", 0);
        f162945a = o95Var;
        o95 o95Var2 = new o95("CUSTOM_APP_EVENTS", 1);
        f162946b = o95Var2;
        f162947c = new o95[]{o95Var, o95Var2};
    }

    public static o95 valueOf(String str) {
        return (o95) Enum.valueOf(o95.class, str);
    }

    public static o95[] values() {
        return (o95[]) f162947c.clone();
    }
}
