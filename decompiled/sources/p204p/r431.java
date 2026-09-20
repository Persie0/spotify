package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r431 {

    /* JADX INFO: renamed from: a */
    public static final r431 f195645a;

    /* JADX INFO: renamed from: b */
    public static final r431 f195646b;

    /* JADX INFO: renamed from: c */
    public static final r431 f195647c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ r431[] f195648d;

    static {
        r431 r431Var = new r431("LINEAR", 0);
        f195645a = r431Var;
        r431 r431Var2 = new r431("SHUFFLE", 1);
        f195646b = r431Var2;
        r431 r431Var3 = new r431("SMART_SHUFFLE", 2);
        f195647c = r431Var3;
        f195648d = new r431[]{r431Var, r431Var2, r431Var3};
    }

    public static r431 valueOf(String str) {
        return (r431) Enum.valueOf(r431.class, str);
    }

    public static r431[] values() {
        return (r431[]) f195648d.clone();
    }
}
