package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kob1 {

    /* JADX INFO: renamed from: a */
    public static final kob1 f124750a;

    /* JADX INFO: renamed from: b */
    public static final kob1 f124751b;

    /* JADX INFO: renamed from: c */
    public static final kob1 f124752c;

    /* JADX INFO: renamed from: d */
    public static final kob1 f124753d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ kob1[] f124754e;

    static {
        kob1 kob1Var = new kob1("TitleRowClicked", 0);
        f124750a = kob1Var;
        kob1 kob1Var2 = new kob1("MainImageClicked", 1);
        f124751b = kob1Var2;
        kob1 kob1Var3 = new kob1("PlayButtonClicked", 2);
        f124752c = kob1Var3;
        kob1 kob1Var4 = new kob1("LockButtonClicked", 3);
        f124753d = kob1Var4;
        f124754e = new kob1[]{kob1Var, kob1Var2, kob1Var3, kob1Var4};
    }

    public static kob1 valueOf(String str) {
        return (kob1) Enum.valueOf(kob1.class, str);
    }

    public static kob1[] values() {
        return (kob1[]) f124754e.clone();
    }
}
