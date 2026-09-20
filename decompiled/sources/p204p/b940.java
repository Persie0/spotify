package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b940 {

    /* JADX INFO: renamed from: a */
    public static final b940 f24765a;

    /* JADX INFO: renamed from: b */
    public static final b940 f24766b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ b940[] f24767c;

    static {
        b940 b940Var = new b940("LOADED", 0);
        f24765a = b940Var;
        b940 b940Var2 = new b940("FAILED", 1);
        f24766b = b940Var2;
        f24767c = new b940[]{b940Var, b940Var2};
    }

    public static b940 valueOf(String str) {
        return (b940) Enum.valueOf(b940.class, str);
    }

    public static b940[] values() {
        return (b940[]) f24767c.clone();
    }
}
