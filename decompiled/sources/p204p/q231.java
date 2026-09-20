package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q231 {

    /* JADX INFO: renamed from: a */
    public static final q231 f184474a;

    /* JADX INFO: renamed from: b */
    public static final q231 f184475b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ q231[] f184476c;

    static {
        q231 q231Var = new q231("SHUFFLE", 0);
        f184474a = q231Var;
        q231 q231Var2 = new q231("SMART_SHUFFLE", 1);
        f184475b = q231Var2;
        f184476c = new q231[]{q231Var, q231Var2};
    }

    public static q231 valueOf(String str) {
        return (q231) Enum.valueOf(q231.class, str);
    }

    public static q231[] values() {
        return (q231[]) f184476c.clone();
    }
}
