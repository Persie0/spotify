package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class vyd1 {

    /* JADX INFO: renamed from: X */
    public static final vyd1 f246071X;

    /* JADX INFO: renamed from: Y */
    public static final vyd1 f246072Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ vyd1[] f246073Z;

    /* JADX INFO: renamed from: c */
    public static final vyd1 f246074c;

    /* JADX INFO: renamed from: d */
    public static final vyd1 f246075d;

    /* JADX INFO: renamed from: e */
    public static final vyd1 f246076e;

    /* JADX INFO: renamed from: f */
    public static final vyd1 f246077f;

    /* JADX INFO: renamed from: g */
    public static final jyd1 f246078g;

    /* JADX INFO: renamed from: h */
    public static final myd1 f246079h;

    /* JADX INFO: renamed from: i */
    public static final pyd1 f246080i;

    /* JADX INFO: renamed from: t */
    public static final syd1 f246081t;

    /* JADX INFO: renamed from: a */
    public final yyd1 f246082a;

    /* JADX INFO: renamed from: b */
    public final int f246083b;

    /* JADX INFO: Fake field, exist only in values array */
    vyd1 EF1;

    static {
        vyd1 vyd1Var = new vyd1("DOUBLE", 0, yyd1.f277486d, 1);
        f246074c = vyd1Var;
        vyd1 vyd1Var2 = new vyd1("FLOAT", 1, yyd1.f277485c, 5);
        yyd1 yyd1Var = yyd1.f277484b;
        vyd1 vyd1Var3 = new vyd1("INT64", 2, yyd1Var, 0);
        f246075d = vyd1Var3;
        vyd1 vyd1Var4 = new vyd1("UINT64", 3, yyd1Var, 0);
        yyd1 yyd1Var2 = yyd1.f277483a;
        vyd1 vyd1Var5 = new vyd1("INT32", 4, yyd1Var2, 0);
        f246076e = vyd1Var5;
        vyd1 vyd1Var6 = new vyd1("FIXED64", 5, yyd1Var, 1);
        vyd1 vyd1Var7 = new vyd1("FIXED32", 6, yyd1Var2, 5);
        vyd1 vyd1Var8 = new vyd1("BOOL", 7, yyd1.f277487e, 0);
        f246077f = vyd1Var8;
        jyd1 jyd1Var = new jyd1("STRING", 8, yyd1.f277488f, 2);
        f246078g = jyd1Var;
        yyd1 yyd1Var3 = yyd1.f277491i;
        myd1 myd1Var = new myd1("GROUP", 9, yyd1Var3, 3);
        f246079h = myd1Var;
        pyd1 pyd1Var = new pyd1("MESSAGE", 10, yyd1Var3, 2);
        f246080i = pyd1Var;
        syd1 syd1Var = new syd1("BYTES", 11, yyd1.f277489g, 2);
        f246081t = syd1Var;
        vyd1 vyd1Var9 = new vyd1("UINT32", 12, yyd1Var2, 0);
        f246071X = vyd1Var9;
        vyd1 vyd1Var10 = new vyd1("ENUM", 13, yyd1.f277490h, 0);
        f246072Y = vyd1Var10;
        f246073Z = new vyd1[]{vyd1Var, vyd1Var2, vyd1Var3, vyd1Var4, vyd1Var5, vyd1Var6, vyd1Var7, vyd1Var8, jyd1Var, myd1Var, pyd1Var, syd1Var, vyd1Var9, vyd1Var10, new vyd1("SFIXED32", 14, yyd1Var2, 5), new vyd1("SFIXED64", 15, yyd1Var, 1), new vyd1("SINT32", 16, yyd1Var2, 0), new vyd1("SINT64", 17, yyd1Var, 0)};
    }

    public vyd1(String str, int i, yyd1 yyd1Var, int i2) {
        super(str, i);
        this.f246082a = yyd1Var;
        this.f246083b = i2;
    }

    public static vyd1 valueOf(String str) {
        return (vyd1) Enum.valueOf(vyd1.class, str);
    }

    public static vyd1[] values() {
        return (vyd1[]) f246073Z.clone();
    }
}
