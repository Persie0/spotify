package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class fob1 {

    /* JADX INFO: renamed from: a */
    public static final fob1 f71498a;

    /* JADX INFO: renamed from: b */
    public static final fob1 f71499b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fob1[] f71500c;

    static {
        fob1 fob1Var = new fob1("OPEN_NOW_PLAYING_VIEW", 0);
        f71498a = fob1Var;
        fob1 fob1Var2 = new fob1("SHOW_ERROR", 1);
        f71499b = fob1Var2;
        f71500c = new fob1[]{fob1Var, fob1Var2};
    }

    public static fob1 valueOf(String str) {
        return (fob1) Enum.valueOf(fob1.class, str);
    }

    public static fob1[] values() {
        return (fob1[]) f71500c.clone();
    }
}
