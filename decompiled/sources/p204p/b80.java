package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b80 {

    /* JADX INFO: renamed from: a */
    public static final b80 f24442a;

    /* JADX INFO: renamed from: b */
    public static final b80 f24443b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ b80[] f24444c;

    /* JADX INFO: Fake field, exist only in values array */
    b80 EF0;

    static {
        b80 b80Var = new b80("Spanned", 0);
        b80 b80Var2 = new b80("Wrapped", 1);
        f24442a = b80Var2;
        b80 b80Var3 = new b80("SmartSpanned", 2);
        f24443b = b80Var3;
        f24444c = new b80[]{b80Var, b80Var2, b80Var3};
    }

    public static b80 valueOf(String str) {
        return (b80) Enum.valueOf(b80.class, str);
    }

    public static b80[] values() {
        return (b80[]) f24444c.clone();
    }
}
