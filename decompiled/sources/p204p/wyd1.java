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
/* JADX INFO: loaded from: classes11.dex */
public class wyd1 {

    /* JADX INFO: renamed from: c */
    public static final wyd1 f256267c;

    /* JADX INFO: renamed from: d */
    public static final wyd1 f256268d;

    /* JADX INFO: renamed from: e */
    public static final nyd1 f256269e;

    /* JADX INFO: renamed from: f */
    public static final qyd1 f256270f;

    /* JADX INFO: renamed from: g */
    public static final wyd1 f256271g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ wyd1[] f256272h;

    /* JADX INFO: renamed from: a */
    public final zyd1 f256273a;

    /* JADX INFO: renamed from: b */
    public final int f256274b;

    /* JADX INFO: Fake field, exist only in values array */
    wyd1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    wyd1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    wyd1 EF2;

    static {
        wyd1 wyd1Var = new wyd1("DOUBLE", 0, zyd1.DOUBLE, 1);
        wyd1 wyd1Var2 = new wyd1("FLOAT", 1, zyd1.FLOAT, 5);
        zyd1 zyd1Var = zyd1.LONG;
        wyd1 wyd1Var3 = new wyd1("INT64", 2, zyd1Var, 0);
        wyd1 wyd1Var4 = new wyd1("UINT64", 3, zyd1Var, 0);
        zyd1 zyd1Var2 = zyd1.INT;
        wyd1 wyd1Var5 = new wyd1("INT32", 4, zyd1Var2, 0);
        f256267c = wyd1Var5;
        wyd1 wyd1Var6 = new wyd1("FIXED64", 5, zyd1Var, 1);
        wyd1 wyd1Var7 = new wyd1("FIXED32", 6, zyd1Var2, 5);
        wyd1 wyd1Var8 = new wyd1("BOOL", 7, zyd1.BOOLEAN, 0);
        f256268d = wyd1Var8;
        kyd1 kyd1Var = new kyd1("STRING", 8, zyd1.STRING, 2);
        zyd1 zyd1Var3 = zyd1.MESSAGE;
        nyd1 nyd1Var = new nyd1("GROUP", 9, zyd1Var3, 3);
        f256269e = nyd1Var;
        qyd1 qyd1Var = new qyd1("MESSAGE", 10, zyd1Var3, 2);
        f256270f = qyd1Var;
        tyd1 tyd1Var = new tyd1("BYTES", 11, zyd1.BYTE_STRING, 2);
        wyd1 wyd1Var9 = new wyd1("UINT32", 12, zyd1Var2, 0);
        wyd1 wyd1Var10 = new wyd1("ENUM", 13, zyd1.ENUM, 0);
        f256271g = wyd1Var10;
        f256272h = new wyd1[]{wyd1Var, wyd1Var2, wyd1Var3, wyd1Var4, wyd1Var5, wyd1Var6, wyd1Var7, wyd1Var8, kyd1Var, nyd1Var, qyd1Var, tyd1Var, wyd1Var9, wyd1Var10, new wyd1("SFIXED32", 14, zyd1Var2, 5), new wyd1("SFIXED64", 15, zyd1Var, 1), new wyd1("SINT32", 16, zyd1Var2, 0), new wyd1("SINT64", 17, zyd1Var, 0)};
    }

    public wyd1(String str, int i, zyd1 zyd1Var, int i2) {
        super(str, i);
        this.f256273a = zyd1Var;
        this.f256274b = i2;
    }

    public static wyd1 valueOf(String str) {
        return (wyd1) Enum.valueOf(wyd1.class, str);
    }

    public static wyd1[] values() {
        return (wyd1[]) f256272h.clone();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo65873a() {
        return !(this instanceof kyd1);
    }
}
