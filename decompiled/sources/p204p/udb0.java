package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class udb0 {

    /* JADX INFO: renamed from: a */
    public static final udb0 f229218a;

    /* JADX INFO: renamed from: b */
    public static final udb0 f229219b;

    /* JADX INFO: renamed from: c */
    public static final udb0 f229220c;

    /* JADX INFO: renamed from: d */
    public static final udb0 f229221d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ udb0[] f229222e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f229223f;

    static {
        udb0 udb0Var = new udb0("CLASSIC", 0);
        f229218a = udb0Var;
        udb0 udb0Var2 = new udb0("WIDE", 1);
        f229219b = udb0Var2;
        udb0 udb0Var3 = new udb0("NARROW", 2);
        f229220c = udb0Var3;
        udb0 udb0Var4 = new udb0("SLANTED", 3);
        f229221d = udb0Var4;
        udb0[] udb0VarArr = {udb0Var, udb0Var2, udb0Var3, udb0Var4};
        f229222e = udb0VarArr;
        f229223f = new nzv(udb0VarArr);
    }

    public static udb0 valueOf(String str) {
        return (udb0) Enum.valueOf(udb0.class, str);
    }

    public static udb0[] values() {
        return (udb0[]) f229222e.clone();
    }
}
