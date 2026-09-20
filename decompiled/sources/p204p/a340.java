package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a340 {

    /* JADX INFO: renamed from: a */
    public static final a340 f11860a;

    /* JADX INFO: renamed from: b */
    public static final a340 f11861b;

    /* JADX INFO: renamed from: c */
    public static final a340 f11862c;

    /* JADX INFO: renamed from: d */
    public static final a340 f11863d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ a340[] f11864e;

    /* JADX INFO: Fake field, exist only in values array */
    a340 EF0;

    static {
        a340 a340Var = new a340("UNSPECIFIED", 0);
        a340 a340Var2 = new a340("SMALL", 1);
        f11860a = a340Var2;
        a340 a340Var3 = new a340("DEFAULT", 2);
        f11861b = a340Var3;
        a340 a340Var4 = new a340("LARGE", 3);
        f11862c = a340Var4;
        a340 a340Var5 = new a340("XLARGE", 4);
        f11863d = a340Var5;
        f11864e = new a340[]{a340Var, a340Var2, a340Var3, a340Var4, a340Var5};
    }

    public static a340 valueOf(String str) {
        return (a340) Enum.valueOf(a340.class, str);
    }

    public static a340[] values() {
        return (a340[]) f11864e.clone();
    }
}
