package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class jcj0 {

    /* JADX INFO: renamed from: a */
    public static final jcj0 f111135a;

    /* JADX INFO: renamed from: b */
    public static final jcj0 f111136b;

    /* JADX INFO: renamed from: c */
    public static final jcj0 f111137c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jcj0[] f111138d;

    static {
        jcj0 jcj0Var = new jcj0("Granted", 0);
        f111135a = jcj0Var;
        jcj0 jcj0Var2 = new jcj0("Denied", 1);
        f111136b = jcj0Var2;
        jcj0 jcj0Var3 = new jcj0("Dismissed", 2);
        f111137c = jcj0Var3;
        f111138d = new jcj0[]{jcj0Var, jcj0Var2, jcj0Var3};
    }

    public static jcj0 valueOf(String str) {
        return (jcj0) Enum.valueOf(jcj0.class, str);
    }

    public static jcj0[] values() {
        return (jcj0[]) f111138d.clone();
    }
}
