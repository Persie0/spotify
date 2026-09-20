package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o1i0 {

    /* JADX INFO: renamed from: a */
    public static final o1i0 f160764a;

    /* JADX INFO: renamed from: b */
    public static final o1i0 f160765b;

    /* JADX INFO: renamed from: c */
    public static final o1i0 f160766c;

    /* JADX INFO: renamed from: d */
    public static final o1i0 f160767d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ o1i0[] f160768e;

    static {
        o1i0 o1i0Var = new o1i0("UNDEFINED", 0);
        f160764a = o1i0Var;
        o1i0 o1i0Var2 = new o1i0("SETUP", 1);
        f160765b = o1i0Var2;
        o1i0 o1i0Var3 = new o1i0("MOVING", 2);
        f160766c = o1i0Var3;
        o1i0 o1i0Var4 = new o1i0("FINISHED", 3);
        f160767d = o1i0Var4;
        f160768e = new o1i0[]{o1i0Var, o1i0Var2, o1i0Var3, o1i0Var4};
    }

    public static o1i0 valueOf(String str) {
        return (o1i0) Enum.valueOf(o1i0.class, str);
    }

    public static o1i0[] values() {
        return (o1i0[]) f160768e.clone();
    }
}
