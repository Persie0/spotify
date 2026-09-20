package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zm0 {

    /* JADX INFO: renamed from: a */
    public static final zm0 f284112a;

    /* JADX INFO: renamed from: b */
    public static final zm0 f284113b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zm0[] f284114c;

    static {
        zm0 zm0Var = new zm0("MENU_BACK_BUTTON", 0);
        f284112a = zm0Var;
        zm0 zm0Var2 = new zm0("SYSTEM_BACK_BUTTON", 1);
        f284113b = zm0Var2;
        f284114c = new zm0[]{zm0Var, zm0Var2};
    }

    public static zm0 valueOf(String str) {
        return (zm0) Enum.valueOf(zm0.class, str);
    }

    public static zm0[] values() {
        return (zm0[]) f284114c.clone();
    }
}
