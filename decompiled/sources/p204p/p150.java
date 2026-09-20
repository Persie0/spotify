package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p150 {

    /* JADX INFO: renamed from: a */
    public static final p150 f172949a;

    /* JADX INFO: renamed from: b */
    public static final p150 f172950b;

    /* JADX INFO: renamed from: c */
    public static final p150 f172951c;

    /* JADX INFO: renamed from: d */
    public static final p150 f172952d;

    /* JADX INFO: renamed from: e */
    public static final p150 f172953e;

    /* JADX INFO: renamed from: f */
    public static final p150 f172954f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ p150[] f172955g;

    static {
        p150 p150Var = new p150("Unknown", 0);
        f172949a = p150Var;
        p150 p150Var2 = new p150("Analysis", 1);
        f172950b = p150Var2;
        p150 p150Var3 = new p150("AnrReport", 2);
        f172951c = p150Var3;
        p150 p150Var4 = new p150("CrashReport", 3);
        f172952d = p150Var4;
        p150 p150Var5 = new p150("CrashShield", 4);
        f172953e = p150Var5;
        p150 p150Var6 = new p150("ThreadCheck", 5);
        f172954f = p150Var6;
        f172955g = new p150[]{p150Var, p150Var2, p150Var3, p150Var4, p150Var5, p150Var6};
    }

    public static p150 valueOf(String str) {
        return (p150) Enum.valueOf(p150.class, str);
    }

    public static p150[] values() {
        return (p150[]) f172955g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return "Analysis";
        }
        if (iOrdinal == 2) {
            return "AnrReport";
        }
        if (iOrdinal == 3) {
            return "CrashReport";
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? "Unknown" : "ThreadCheck";
        }
        return "CrashShield";
    }
}
