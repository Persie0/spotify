package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class iaf1 {

    /* JADX INFO: renamed from: b */
    public static final iaf1 f100246b;

    /* JADX INFO: renamed from: c */
    public static final iaf1 f100247c;

    /* JADX INFO: renamed from: d */
    public static final iaf1[] f100248d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ iaf1[] f100249e;

    /* JADX INFO: renamed from: a */
    public final int f100250a;

    /* JADX INFO: Fake field, exist only in values array */
    iaf1 EF0;

    static {
        cbf1 cbf1Var = cbf1.f36113e;
        iaf1 iaf1Var = new iaf1("DOUBLE", 0, 0, 1, cbf1Var);
        cbf1 cbf1Var2 = cbf1.f36112d;
        iaf1 iaf1Var2 = new iaf1("FLOAT", 1, 1, 1, cbf1Var2);
        cbf1 cbf1Var3 = cbf1.f36111c;
        iaf1 iaf1Var3 = new iaf1("INT64", 2, 2, 1, cbf1Var3);
        iaf1 iaf1Var4 = new iaf1("UINT64", 3, 3, 1, cbf1Var3);
        cbf1 cbf1Var4 = cbf1.f36110b;
        iaf1 iaf1Var5 = new iaf1("INT32", 4, 4, 1, cbf1Var4);
        iaf1 iaf1Var6 = new iaf1("FIXED64", 5, 5, 1, cbf1Var3);
        iaf1 iaf1Var7 = new iaf1("FIXED32", 6, 6, 1, cbf1Var4);
        cbf1 cbf1Var5 = cbf1.f36114f;
        iaf1 iaf1Var8 = new iaf1("BOOL", 7, 7, 1, cbf1Var5);
        cbf1 cbf1Var6 = cbf1.f36115g;
        iaf1 iaf1Var9 = new iaf1("STRING", 8, 8, 1, cbf1Var6);
        cbf1 cbf1Var7 = cbf1.f36118t;
        iaf1 iaf1Var10 = new iaf1("MESSAGE", 9, 9, 1, cbf1Var7);
        cbf1 cbf1Var8 = cbf1.f36116h;
        iaf1 iaf1Var11 = new iaf1("BYTES", 10, 10, 1, cbf1Var8);
        iaf1 iaf1Var12 = new iaf1("UINT32", 11, 11, 1, cbf1Var4);
        cbf1 cbf1Var9 = cbf1.f36117i;
        iaf1 iaf1Var13 = new iaf1("ENUM", 12, 12, 1, cbf1Var9);
        iaf1 iaf1Var14 = new iaf1("SFIXED32", 13, 13, 1, cbf1Var4);
        iaf1 iaf1Var15 = new iaf1("SFIXED64", 14, 14, 1, cbf1Var3);
        iaf1 iaf1Var16 = new iaf1("SINT32", 15, 15, 1, cbf1Var4);
        iaf1 iaf1Var17 = new iaf1("SINT64", 16, 16, 1, cbf1Var3);
        iaf1 iaf1Var18 = new iaf1("GROUP", 17, 17, 1, cbf1Var7);
        iaf1 iaf1Var19 = new iaf1("DOUBLE_LIST", 18, 18, 2, cbf1Var);
        iaf1 iaf1Var20 = new iaf1("FLOAT_LIST", 19, 19, 2, cbf1Var2);
        iaf1 iaf1Var21 = new iaf1("INT64_LIST", 20, 20, 2, cbf1Var3);
        iaf1 iaf1Var22 = new iaf1("UINT64_LIST", 21, 21, 2, cbf1Var3);
        iaf1 iaf1Var23 = new iaf1("INT32_LIST", 22, 22, 2, cbf1Var4);
        iaf1 iaf1Var24 = new iaf1("FIXED64_LIST", 23, 23, 2, cbf1Var3);
        iaf1 iaf1Var25 = new iaf1("FIXED32_LIST", 24, 24, 2, cbf1Var4);
        iaf1 iaf1Var26 = new iaf1("BOOL_LIST", 25, 25, 2, cbf1Var5);
        iaf1 iaf1Var27 = new iaf1("STRING_LIST", 26, 26, 2, cbf1Var6);
        iaf1 iaf1Var28 = new iaf1("MESSAGE_LIST", 27, 27, 2, cbf1Var7);
        iaf1 iaf1Var29 = new iaf1("BYTES_LIST", 28, 28, 2, cbf1Var8);
        iaf1 iaf1Var30 = new iaf1("UINT32_LIST", 29, 29, 2, cbf1Var4);
        iaf1 iaf1Var31 = new iaf1("ENUM_LIST", 30, 30, 2, cbf1Var9);
        iaf1 iaf1Var32 = new iaf1("SFIXED32_LIST", 31, 31, 2, cbf1Var4);
        iaf1 iaf1Var33 = new iaf1("SFIXED64_LIST", 32, 32, 2, cbf1Var3);
        iaf1 iaf1Var34 = new iaf1("SINT32_LIST", 33, 33, 2, cbf1Var4);
        iaf1 iaf1Var35 = new iaf1("SINT64_LIST", 34, 34, 2, cbf1Var3);
        iaf1 iaf1Var36 = new iaf1("DOUBLE_LIST_PACKED", 35, 35, 3, cbf1Var);
        f100246b = iaf1Var36;
        iaf1 iaf1Var37 = new iaf1("FLOAT_LIST_PACKED", 36, 36, 3, cbf1Var2);
        iaf1 iaf1Var38 = new iaf1("INT64_LIST_PACKED", 37, 37, 3, cbf1Var3);
        iaf1 iaf1Var39 = new iaf1("UINT64_LIST_PACKED", 38, 38, 3, cbf1Var3);
        iaf1 iaf1Var40 = new iaf1("INT32_LIST_PACKED", 39, 39, 3, cbf1Var4);
        iaf1 iaf1Var41 = new iaf1("FIXED64_LIST_PACKED", 40, 40, 3, cbf1Var3);
        iaf1 iaf1Var42 = new iaf1("FIXED32_LIST_PACKED", 41, 41, 3, cbf1Var4);
        iaf1 iaf1Var43 = new iaf1("BOOL_LIST_PACKED", 42, 42, 3, cbf1Var5);
        iaf1 iaf1Var44 = new iaf1("UINT32_LIST_PACKED", 43, 43, 3, cbf1Var4);
        iaf1 iaf1Var45 = new iaf1("ENUM_LIST_PACKED", 44, 44, 3, cbf1Var9);
        iaf1 iaf1Var46 = new iaf1("SFIXED32_LIST_PACKED", 45, 45, 3, cbf1Var4);
        iaf1 iaf1Var47 = new iaf1("SFIXED64_LIST_PACKED", 46, 46, 3, cbf1Var3);
        iaf1 iaf1Var48 = new iaf1("SINT32_LIST_PACKED", 47, 47, 3, cbf1Var4);
        iaf1 iaf1Var49 = new iaf1("SINT64_LIST_PACKED", 48, 48, 3, cbf1Var3);
        f100247c = iaf1Var49;
        f100249e = new iaf1[]{iaf1Var, iaf1Var2, iaf1Var3, iaf1Var4, iaf1Var5, iaf1Var6, iaf1Var7, iaf1Var8, iaf1Var9, iaf1Var10, iaf1Var11, iaf1Var12, iaf1Var13, iaf1Var14, iaf1Var15, iaf1Var16, iaf1Var17, iaf1Var18, iaf1Var19, iaf1Var20, iaf1Var21, iaf1Var22, iaf1Var23, iaf1Var24, iaf1Var25, iaf1Var26, iaf1Var27, iaf1Var28, iaf1Var29, iaf1Var30, iaf1Var31, iaf1Var32, iaf1Var33, iaf1Var34, iaf1Var35, iaf1Var36, iaf1Var37, iaf1Var38, iaf1Var39, iaf1Var40, iaf1Var41, iaf1Var42, iaf1Var43, iaf1Var44, iaf1Var45, iaf1Var46, iaf1Var47, iaf1Var48, iaf1Var49, new iaf1("GROUP_LIST", 49, 49, 2, cbf1Var7), new iaf1("MAP", 50, 50, 4, cbf1.f36109a)};
        iaf1[] iaf1VarArrValues = values();
        f100248d = new iaf1[iaf1VarArrValues.length];
        for (iaf1 iaf1Var50 : iaf1VarArrValues) {
            f100248d[iaf1Var50.f100250a] = iaf1Var50;
        }
    }

    public iaf1(String str, int i, int i2, int i3, cbf1 cbf1Var) {
        super(str, i);
        this.f100250a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            cbf1Var.getClass();
        }
        if (i3 == 1) {
            cbf1 cbf1Var2 = cbf1.f36109a;
            cbf1Var.ordinal();
        }
    }

    public static iaf1[] values() {
        return (iaf1[]) f100249e.clone();
    }
}
