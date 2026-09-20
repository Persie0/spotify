package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class noi0 {

    /* JADX INFO: renamed from: a */
    public static final noi0 f156705a;

    /* JADX INFO: renamed from: b */
    public static final noi0 f156706b;

    /* JADX INFO: renamed from: c */
    public static final noi0 f156707c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ noi0[] f156708d;

    static {
        noi0 noi0Var = new noi0("RESET_EVENT_SCHEDULER", 0);
        f156705a = noi0Var;
        noi0 noi0Var2 = new noi0("RESET_EVENT_MONITOR", 1);
        f156706b = noi0Var2;
        noi0 noi0Var3 = new noi0("UPDATE_RATE_LIMITER", 2);
        f156707c = noi0Var3;
        f156708d = new noi0[]{noi0Var, noi0Var2, noi0Var3};
    }

    public static noi0 valueOf(String str) {
        return (noi0) Enum.valueOf(noi0.class, str);
    }

    public static noi0[] values() {
        return (noi0[]) f156708d.clone();
    }
}
