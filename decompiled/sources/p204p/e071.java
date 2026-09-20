package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e071 {

    /* JADX INFO: renamed from: a */
    public static final e071 f54894a;

    /* JADX INFO: renamed from: b */
    public static final e071 f54895b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ e071[] f54896c;

    /* JADX INFO: Fake field, exist only in values array */
    e071 EF0;

    static {
        e071 e071Var = new e071("GREEN", 0);
        e071 e071Var2 = new e071("WHITE", 1);
        f54894a = e071Var2;
        e071 e071Var3 = new e071("BLACK", 2);
        f54895b = e071Var3;
        f54896c = new e071[]{e071Var, e071Var2, e071Var3};
    }

    public static e071 valueOf(String str) {
        return (e071) Enum.valueOf(e071.class, str);
    }

    public static e071[] values() {
        return (e071[]) f54896c.clone();
    }
}
