package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cbz0 {

    /* JADX INFO: renamed from: a */
    public static final cbz0 f36270a;

    /* JADX INFO: renamed from: b */
    public static final cbz0 f36271b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cbz0[] f36272c;

    static {
        cbz0 cbz0Var = new cbz0("Collapsed", 0);
        f36270a = cbz0Var;
        cbz0 cbz0Var2 = new cbz0("Expanded", 1);
        f36271b = cbz0Var2;
        f36272c = new cbz0[]{cbz0Var, cbz0Var2};
    }

    public static cbz0 valueOf(String str) {
        return (cbz0) Enum.valueOf(cbz0.class, str);
    }

    public static cbz0[] values() {
        return (cbz0[]) f36272c.clone();
    }
}
