package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pn6 {

    /* JADX INFO: renamed from: a */
    public static final pn6 f179316a;

    /* JADX INFO: renamed from: b */
    public static final pn6 f179317b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ pn6[] f179318c;

    static {
        pn6 pn6Var = new pn6("AUTOMATIC", 0);
        f179316a = pn6Var;
        pn6 pn6Var2 = new pn6("ENABLED", 1);
        f179317b = pn6Var2;
        f179318c = new pn6[]{pn6Var, pn6Var2, new pn6("DISABLED", 2)};
    }

    public static pn6 valueOf(String str) {
        return (pn6) Enum.valueOf(pn6.class, str);
    }

    public static pn6[] values() {
        return (pn6[]) f179318c.clone();
    }
}
