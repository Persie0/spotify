package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ejy0 {

    /* JADX INFO: renamed from: a */
    public static final ejy0 f60319a;

    /* JADX INFO: renamed from: b */
    public static final ejy0 f60320b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ejy0[] f60321c;

    static {
        ejy0 ejy0Var = new ejy0("PROMPT_TITLE_SCREEN", 0);
        f60319a = ejy0Var;
        ejy0 ejy0Var2 = new ejy0("PROMPT_DETAIL_SCREEN", 1);
        f60320b = ejy0Var2;
        f60321c = new ejy0[]{ejy0Var, ejy0Var2};
    }

    public static ejy0 valueOf(String str) {
        return (ejy0) Enum.valueOf(ejy0.class, str);
    }

    public static ejy0[] values() {
        return (ejy0[]) f60321c.clone();
    }
}
