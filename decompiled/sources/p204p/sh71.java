package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sh71 {

    /* JADX INFO: renamed from: a */
    public static final sh71 f209137a;

    /* JADX INFO: renamed from: b */
    public static final sh71 f209138b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ sh71[] f209139c;

    static {
        sh71 sh71Var = new sh71("ACTIVATED", 0);
        f209137a = sh71Var;
        sh71 sh71Var2 = new sh71("NOT_ACTIVATED", 1);
        f209138b = sh71Var2;
        f209139c = new sh71[]{sh71Var, sh71Var2};
    }

    public static sh71 valueOf(String str) {
        return (sh71) Enum.valueOf(sh71.class, str);
    }

    public static sh71[] values() {
        return (sh71[]) f209139c.clone();
    }
}
