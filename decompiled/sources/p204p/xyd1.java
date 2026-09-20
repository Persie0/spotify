package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class xyd1 {

    /* JADX INFO: renamed from: c */
    public static final lyd1 f267299c;

    /* JADX INFO: renamed from: d */
    public static final oyd1 f267300d;

    /* JADX INFO: renamed from: e */
    public static final ryd1 f267301e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ xyd1[] f267302f;

    /* JADX INFO: renamed from: a */
    public final azd1 f267303a;

    /* JADX INFO: renamed from: b */
    public final int f267304b;

    /* JADX INFO: Fake field, exist only in values array */
    xyd1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    xyd1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    xyd1 EF2;

    static {
        xyd1 xyd1Var = new xyd1("DOUBLE", 0, azd1.f21490d, 1);
        xyd1 xyd1Var2 = new xyd1("FLOAT", 1, azd1.f21489c, 5);
        azd1 azd1Var = azd1.f21488b;
        xyd1 xyd1Var3 = new xyd1("INT64", 2, azd1Var, 0);
        xyd1 xyd1Var4 = new xyd1("UINT64", 3, azd1Var, 0);
        azd1 azd1Var2 = azd1.f21487a;
        xyd1 xyd1Var5 = new xyd1("INT32", 4, azd1Var2, 0);
        xyd1 xyd1Var6 = new xyd1("FIXED64", 5, azd1Var, 1);
        xyd1 xyd1Var7 = new xyd1("FIXED32", 6, azd1Var2, 5);
        xyd1 xyd1Var8 = new xyd1("BOOL", 7, azd1.f21491e, 0);
        lyd1 lyd1Var = new lyd1("STRING", 8, azd1.f21492f, 2);
        f267299c = lyd1Var;
        azd1 azd1Var3 = azd1.f21495i;
        oyd1 oyd1Var = new oyd1("GROUP", 9, azd1Var3, 3);
        f267300d = oyd1Var;
        ryd1 ryd1Var = new ryd1("MESSAGE", 10, azd1Var3, 2);
        f267301e = ryd1Var;
        f267302f = new xyd1[]{xyd1Var, xyd1Var2, xyd1Var3, xyd1Var4, xyd1Var5, xyd1Var6, xyd1Var7, xyd1Var8, lyd1Var, oyd1Var, ryd1Var, new uyd1("BYTES", 11, azd1.f21493g, 2), new xyd1("UINT32", 12, azd1Var2, 0), new xyd1("ENUM", 13, azd1.f21494h, 0), new xyd1("SFIXED32", 14, azd1Var2, 5), new xyd1("SFIXED64", 15, azd1Var, 1), new xyd1("SINT32", 16, azd1Var2, 0), new xyd1("SINT64", 17, azd1Var, 0)};
    }

    public xyd1(String str, int i, azd1 azd1Var, int i2) {
        super(str, i);
        this.f267303a = azd1Var;
        this.f267304b = i2;
    }

    public static xyd1 valueOf(String str) {
        return (xyd1) Enum.valueOf(xyd1.class, str);
    }

    public static xyd1[] values() {
        return (xyd1[]) f267302f.clone();
    }
}
