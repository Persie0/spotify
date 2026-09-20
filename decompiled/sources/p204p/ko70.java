package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ko70 {

    /* JADX INFO: renamed from: a */
    public static final ko70 f124556a;

    /* JADX INFO: renamed from: b */
    public static final ko70 f124557b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ko70[] f124558c;

    static {
        ko70 ko70Var = new ko70("Ltr", 0);
        f124556a = ko70Var;
        ko70 ko70Var2 = new ko70("Rtl", 1);
        f124557b = ko70Var2;
        f124558c = new ko70[]{ko70Var, ko70Var2};
    }

    public static ko70 valueOf(String str) {
        return (ko70) Enum.valueOf(ko70.class, str);
    }

    public static ko70[] values() {
        return (ko70[]) f124558c.clone();
    }
}
