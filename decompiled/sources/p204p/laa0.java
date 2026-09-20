package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class laa0 {

    /* JADX INFO: renamed from: a */
    public static final laa0 f131318a;

    /* JADX INFO: renamed from: b */
    public static final laa0 f131319b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ laa0[] f131320c;

    static {
        laa0 laa0Var = new laa0("CACHE_FIRST", 0);
        f131318a = laa0Var;
        laa0 laa0Var2 = new laa0("REVALIDATE", 1);
        f131319b = laa0Var2;
        f131320c = new laa0[]{laa0Var, laa0Var2};
    }

    public static laa0 valueOf(String str) {
        return (laa0) Enum.valueOf(laa0.class, str);
    }

    public static laa0[] values() {
        return (laa0[]) f131320c.clone();
    }
}
