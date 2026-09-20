package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class h4b1 {

    /* JADX INFO: renamed from: c */
    public static final h4b1 f87496c;

    /* JADX INFO: renamed from: d */
    public static final h4b1 f87497d;

    /* JADX INFO: renamed from: e */
    public static final h4b1 f87498e;

    /* JADX INFO: renamed from: f */
    public static final h4b1 f87499f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ h4b1[] f87500g;

    /* JADX INFO: renamed from: a */
    public final wju f87501a;

    /* JADX INFO: renamed from: b */
    public final float f87502b;

    static {
        tju tjuVar = tju.f221017e;
        float f = 2;
        h4b1 h4b1Var = new h4b1("Base", 0, tjuVar, f);
        f87496c = h4b1Var;
        h4b1 h4b1Var2 = new h4b1("Flush", 1, tjuVar, f);
        f87497d = h4b1Var2;
        h4b1 h4b1Var3 = new h4b1("OverMedia", 2, vju.f242057e, 0);
        f87498e = h4b1Var3;
        h4b1 h4b1Var4 = new h4b1("OverNpvCard", 3, tjuVar, f);
        f87499f = h4b1Var4;
        f87500g = new h4b1[]{h4b1Var, h4b1Var2, h4b1Var3, h4b1Var4};
    }

    public h4b1(String str, int i, wju wjuVar, float f) {
        super(str, i);
        this.f87501a = wjuVar;
        this.f87502b = f;
    }

    public static h4b1 valueOf(String str) {
        return (h4b1) Enum.valueOf(h4b1.class, str);
    }

    public static h4b1[] values() {
        return (h4b1[]) f87500g.clone();
    }
}
