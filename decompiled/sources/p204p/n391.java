package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class n391 {

    /* JADX INFO: renamed from: a */
    public static final n391 f149981a;

    /* JADX INFO: renamed from: b */
    public static final n391 f149982b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ n391[] f149983c;

    /* JADX INFO: Fake field, exist only in values array */
    n391 EF0;

    static {
        n391 n391Var = new n391("UNSPECIFIED", 0);
        n391 n391Var2 = new n391("EXPANDED", 1);
        f149981a = n391Var2;
        n391 n391Var3 = new n391("DYNAMIC", 2);
        f149982b = n391Var3;
        f149983c = new n391[]{n391Var, n391Var2, n391Var3};
    }

    public static n391 valueOf(String str) {
        return (n391) Enum.valueOf(n391.class, str);
    }

    public static n391[] values() {
        return (n391[]) f149983c.clone();
    }
}
