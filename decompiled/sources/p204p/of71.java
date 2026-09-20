package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class of71 {

    /* JADX INFO: renamed from: a */
    public static final of71 f164661a;

    /* JADX INFO: renamed from: b */
    public static final of71 f164662b;

    /* JADX INFO: renamed from: c */
    public static final of71 f164663c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ of71[] f164664d;

    static {
        of71 of71Var = new of71("None", 0);
        f164661a = of71Var;
        of71 of71Var2 = new of71("Cursor", 1);
        f164662b = of71Var2;
        of71 of71Var3 = new of71("Selection", 2);
        f164663c = of71Var3;
        f164664d = new of71[]{of71Var, of71Var2, of71Var3};
    }

    public static of71 valueOf(String str) {
        return (of71) Enum.valueOf(of71.class, str);
    }

    public static of71[] values() {
        return (of71[]) f164664d.clone();
    }
}
