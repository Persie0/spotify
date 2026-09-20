package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c3j0 {

    /* JADX INFO: renamed from: a */
    public static final c3j0 f33694a;

    /* JADX INFO: renamed from: b */
    public static final c3j0 f33695b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ c3j0[] f33696c;

    static {
        c3j0 c3j0Var = new c3j0("MANAGE_AUTOMATIC_INVITES_TAPPED", 0);
        f33694a = c3j0Var;
        c3j0 c3j0Var2 = new c3j0("VIEW_ACTIVITY_TAPPED", 1);
        f33695b = c3j0Var2;
        f33696c = new c3j0[]{c3j0Var, c3j0Var2};
    }

    public static c3j0 valueOf(String str) {
        return (c3j0) Enum.valueOf(c3j0.class, str);
    }

    public static c3j0[] values() {
        return (c3j0[]) f33696c.clone();
    }
}
