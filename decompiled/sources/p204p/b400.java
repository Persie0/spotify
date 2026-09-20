package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b400 {

    /* JADX INFO: renamed from: a */
    public static final b400 f23156a;

    /* JADX INFO: renamed from: b */
    public static final b400 f23157b;

    /* JADX INFO: renamed from: c */
    public static final b400 f23158c;

    /* JADX INFO: renamed from: d */
    public static final b400 f23159d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ b400[] f23160e;

    static {
        b400 b400Var = new b400("FULL", 0);
        f23156a = b400Var;
        b400 b400Var2 = new b400("LONG", 1);
        f23157b = b400Var2;
        b400 b400Var3 = new b400("MEDIUM", 2);
        f23158c = b400Var3;
        b400 b400Var4 = new b400("SHORT", 3);
        f23159d = b400Var4;
        f23160e = new b400[]{b400Var, b400Var2, b400Var3, b400Var4};
    }

    public static b400 valueOf(String str) {
        return (b400) Enum.valueOf(b400.class, str);
    }

    public static b400[] values() {
        return (b400[]) f23160e.clone();
    }
}
