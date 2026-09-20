package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class qi60 {

    /* JADX INFO: renamed from: a */
    public static final qi60 f188943a;

    /* JADX INFO: renamed from: b */
    public static final qi60 f188944b;

    /* JADX INFO: renamed from: c */
    public static final qi60 f188945c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qi60[] f188946d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f188947e;

    static {
        qi60 qi60Var = new qi60("UNKNOWN", 0);
        f188943a = qi60Var;
        qi60 qi60Var2 = new qi60("CONTROL", 1);
        f188944b = qi60Var2;
        qi60 qi60Var3 = new qi60("LISTEN_AND_CONTROL", 2);
        f188945c = qi60Var3;
        qi60[] qi60VarArr = {qi60Var, qi60Var2, qi60Var3};
        f188946d = qi60VarArr;
        f188947e = new nzv(qi60VarArr);
    }

    public static qi60 valueOf(String str) {
        return (qi60) Enum.valueOf(qi60.class, str);
    }

    public static qi60[] values() {
        return (qi60[]) f188946d.clone();
    }
}
