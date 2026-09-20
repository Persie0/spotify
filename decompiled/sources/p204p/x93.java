package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x93 {

    /* JADX INFO: renamed from: a */
    public static final x93 f259264a;

    /* JADX INFO: renamed from: b */
    public static final x93 f259265b;

    /* JADX INFO: renamed from: c */
    public static final x93 f259266c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ x93[] f259267d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f259268e;

    static {
        x93 x93Var = new x93("Songs", 0);
        f259264a = x93Var;
        x93 x93Var2 = new x93("Episodes", 1);
        f259265b = x93Var2;
        x93 x93Var3 = new x93("Audiobook", 2);
        f259266c = x93Var3;
        x93[] x93VarArr = {x93Var, x93Var2, x93Var3};
        f259267d = x93VarArr;
        f259268e = new nzv(x93VarArr);
    }

    public static x93 valueOf(String str) {
        return (x93) Enum.valueOf(x93.class, str);
    }

    public static x93[] values() {
        return (x93[]) f259267d.clone();
    }
}
