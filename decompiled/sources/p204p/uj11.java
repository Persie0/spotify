package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class uj11 {

    /* JADX INFO: renamed from: a */
    public static final uj11 f230860a;

    /* JADX INFO: renamed from: b */
    public static final uj11 f230861b;

    /* JADX INFO: renamed from: c */
    public static final uj11 f230862c;

    /* JADX INFO: renamed from: d */
    public static final uj11 f230863d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ uj11[] f230864e;

    static {
        uj11 uj11Var = new uj11("UNKNOWN", 0);
        f230860a = uj11Var;
        uj11 uj11Var2 = new uj11("EPISODIC", 1);
        f230861b = uj11Var2;
        uj11 uj11Var3 = new uj11("SEQUENTIAL", 2);
        f230862c = uj11Var3;
        uj11 uj11Var4 = new uj11("RECENT", 3);
        f230863d = uj11Var4;
        f230864e = new uj11[]{uj11Var, uj11Var2, uj11Var3, uj11Var4};
        values();
    }

    public static uj11 valueOf(String str) {
        return (uj11) Enum.valueOf(uj11.class, str);
    }

    public static uj11[] values() {
        return (uj11[]) f230864e.clone();
    }
}
