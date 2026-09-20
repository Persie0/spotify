package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class xmy0 {

    /* JADX INFO: renamed from: a */
    public static final xmy0 f263467a;

    /* JADX INFO: renamed from: b */
    public static final xmy0 f263468b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xmy0[] f263469c;

    static {
        xmy0 xmy0Var = new xmy0("BACKWARD", 0);
        f263467a = xmy0Var;
        xmy0 xmy0Var2 = new xmy0("FORWARD", 1);
        f263468b = xmy0Var2;
        f263469c = new xmy0[]{xmy0Var, xmy0Var2};
    }

    public static xmy0 valueOf(String str) {
        return (xmy0) Enum.valueOf(xmy0.class, str);
    }

    public static xmy0[] values() {
        return (xmy0[]) f263469c.clone();
    }
}
