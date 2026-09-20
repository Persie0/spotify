package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s8f1 {

    /* JADX INFO: renamed from: a */
    public static final s8f1 f206636a;

    /* JADX INFO: renamed from: b */
    public static final s8f1 f206637b;

    /* JADX INFO: renamed from: c */
    public static final s8f1 f206638c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ s8f1[] f206639d;

    static {
        s8f1 s8f1Var = new s8f1("NIST_P256", 0);
        f206636a = s8f1Var;
        s8f1 s8f1Var2 = new s8f1("NIST_P384", 1);
        f206637b = s8f1Var2;
        s8f1 s8f1Var3 = new s8f1("NIST_P521", 2);
        f206638c = s8f1Var3;
        f206639d = new s8f1[]{s8f1Var, s8f1Var2, s8f1Var3};
    }

    public static s8f1[] values() {
        return (s8f1[]) f206639d.clone();
    }
}
