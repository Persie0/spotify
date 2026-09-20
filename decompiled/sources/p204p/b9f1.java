package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b9f1 {

    /* JADX INFO: renamed from: a */
    public static final b9f1 f24898a;

    /* JADX INFO: renamed from: b */
    public static final b9f1 f24899b;

    /* JADX INFO: renamed from: c */
    public static final b9f1 f24900c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ b9f1[] f24901d;

    /* JADX INFO: Fake field, exist only in values array */
    b9f1 EF0;

    static {
        b9f1 b9f1Var = new b9f1("SHA1", 0);
        b9f1 b9f1Var2 = new b9f1("SHA224", 1);
        b9f1 b9f1Var3 = new b9f1("SHA256", 2);
        f24898a = b9f1Var3;
        b9f1 b9f1Var4 = new b9f1("SHA384", 3);
        f24899b = b9f1Var4;
        b9f1 b9f1Var5 = new b9f1("SHA512", 4);
        f24900c = b9f1Var5;
        f24901d = new b9f1[]{b9f1Var, b9f1Var2, b9f1Var3, b9f1Var4, b9f1Var5};
    }

    public static b9f1[] values() {
        return (b9f1[]) f24901d.clone();
    }
}
