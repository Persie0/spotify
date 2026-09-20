package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m301 {

    /* JADX INFO: renamed from: a */
    public static final m301 f139496a;

    /* JADX INFO: renamed from: b */
    public static final m301 f139497b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ m301[] f139498c;

    static {
        m301 m301Var = new m301("CRASHLYTICS", 0);
        f139496a = m301Var;
        m301 m301Var2 = new m301("PERFORMANCE", 1);
        f139497b = m301Var2;
        f139498c = new m301[]{m301Var, m301Var2, new m301("MATT_SAYS_HI", 2)};
    }

    public static m301 valueOf(String str) {
        return (m301) Enum.valueOf(m301.class, str);
    }

    public static m301[] values() {
        return (m301[]) f139498c.clone();
    }
}
