package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b5x0 {

    /* JADX INFO: renamed from: a */
    public static final b5x0 f23780a;

    /* JADX INFO: renamed from: b */
    public static final b5x0 f23781b;

    /* JADX INFO: renamed from: c */
    public static final b5x0 f23782c;

    /* JADX INFO: renamed from: d */
    public static final b5x0 f23783d;

    /* JADX INFO: renamed from: e */
    public static final b5x0 f23784e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ b5x0[] f23785f;

    static {
        b5x0 b5x0Var = new b5x0("RESTRICTION_REASON_AGE_ASSURANCE", 0);
        f23780a = b5x0Var;
        b5x0 b5x0Var2 = new b5x0("RESTRICTION_REASON_EXPLICIT_CONTENT", 1);
        f23781b = b5x0Var2;
        b5x0 b5x0Var3 = new b5x0("RESTRICTION_REASON_AGE_ASSURANCE_19_PLUS", 2);
        f23782c = b5x0Var3;
        b5x0 b5x0Var4 = new b5x0("RESTRICTION_REASON_UNAVAILABLE_CONTENT", 3);
        f23783d = b5x0Var4;
        b5x0 b5x0Var5 = new b5x0("RESTRICTION_REASON_OFFLINE_UNAVAILABLE_CONTENT", 4);
        f23784e = b5x0Var5;
        f23785f = new b5x0[]{b5x0Var, b5x0Var2, b5x0Var3, b5x0Var4, b5x0Var5};
    }

    public static b5x0 valueOf(String str) {
        return (b5x0) Enum.valueOf(b5x0.class, str);
    }

    public static b5x0[] values() {
        return (b5x0[]) f23785f.clone();
    }
}
