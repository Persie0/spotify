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
public final class yah1 {

    /* JADX INFO: renamed from: b */
    public static final yah1 f270900b;

    /* JADX INFO: renamed from: c */
    public static final yah1 f270901c;

    /* JADX INFO: renamed from: d */
    public static final yah1[] f270902d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ yah1[] f270903e;

    /* JADX INFO: renamed from: a */
    public final int f270904a;

    /* JADX INFO: Fake field, exist only in values array */
    yah1 EF0;

    static {
        ubh1 ubh1Var = ubh1.f228765e;
        yah1 yah1Var = new yah1("DOUBLE", 0, 0, 1, ubh1Var);
        ubh1 ubh1Var2 = ubh1.f228764d;
        yah1 yah1Var2 = new yah1("FLOAT", 1, 1, 1, ubh1Var2);
        ubh1 ubh1Var3 = ubh1.f228763c;
        yah1 yah1Var3 = new yah1("INT64", 2, 2, 1, ubh1Var3);
        yah1 yah1Var4 = new yah1("UINT64", 3, 3, 1, ubh1Var3);
        ubh1 ubh1Var4 = ubh1.f228762b;
        yah1 yah1Var5 = new yah1("INT32", 4, 4, 1, ubh1Var4);
        yah1 yah1Var6 = new yah1("FIXED64", 5, 5, 1, ubh1Var3);
        yah1 yah1Var7 = new yah1("FIXED32", 6, 6, 1, ubh1Var4);
        ubh1 ubh1Var5 = ubh1.f228766f;
        yah1 yah1Var8 = new yah1("BOOL", 7, 7, 1, ubh1Var5);
        ubh1 ubh1Var6 = ubh1.f228767g;
        yah1 yah1Var9 = new yah1("STRING", 8, 8, 1, ubh1Var6);
        ubh1 ubh1Var7 = ubh1.f228770t;
        yah1 yah1Var10 = new yah1("MESSAGE", 9, 9, 1, ubh1Var7);
        ubh1 ubh1Var8 = ubh1.f228768h;
        yah1 yah1Var11 = new yah1("BYTES", 10, 10, 1, ubh1Var8);
        yah1 yah1Var12 = new yah1("UINT32", 11, 11, 1, ubh1Var4);
        ubh1 ubh1Var9 = ubh1.f228769i;
        yah1 yah1Var13 = new yah1("ENUM", 12, 12, 1, ubh1Var9);
        yah1 yah1Var14 = new yah1("SFIXED32", 13, 13, 1, ubh1Var4);
        yah1 yah1Var15 = new yah1("SFIXED64", 14, 14, 1, ubh1Var3);
        yah1 yah1Var16 = new yah1("SINT32", 15, 15, 1, ubh1Var4);
        yah1 yah1Var17 = new yah1("SINT64", 16, 16, 1, ubh1Var3);
        yah1 yah1Var18 = new yah1("GROUP", 17, 17, 1, ubh1Var7);
        yah1 yah1Var19 = new yah1("DOUBLE_LIST", 18, 18, 2, ubh1Var);
        yah1 yah1Var20 = new yah1("FLOAT_LIST", 19, 19, 2, ubh1Var2);
        yah1 yah1Var21 = new yah1("INT64_LIST", 20, 20, 2, ubh1Var3);
        yah1 yah1Var22 = new yah1("UINT64_LIST", 21, 21, 2, ubh1Var3);
        yah1 yah1Var23 = new yah1("INT32_LIST", 22, 22, 2, ubh1Var4);
        yah1 yah1Var24 = new yah1("FIXED64_LIST", 23, 23, 2, ubh1Var3);
        yah1 yah1Var25 = new yah1("FIXED32_LIST", 24, 24, 2, ubh1Var4);
        yah1 yah1Var26 = new yah1("BOOL_LIST", 25, 25, 2, ubh1Var5);
        yah1 yah1Var27 = new yah1("STRING_LIST", 26, 26, 2, ubh1Var6);
        yah1 yah1Var28 = new yah1("MESSAGE_LIST", 27, 27, 2, ubh1Var7);
        yah1 yah1Var29 = new yah1("BYTES_LIST", 28, 28, 2, ubh1Var8);
        yah1 yah1Var30 = new yah1("UINT32_LIST", 29, 29, 2, ubh1Var4);
        yah1 yah1Var31 = new yah1("ENUM_LIST", 30, 30, 2, ubh1Var9);
        yah1 yah1Var32 = new yah1("SFIXED32_LIST", 31, 31, 2, ubh1Var4);
        yah1 yah1Var33 = new yah1("SFIXED64_LIST", 32, 32, 2, ubh1Var3);
        yah1 yah1Var34 = new yah1("SINT32_LIST", 33, 33, 2, ubh1Var4);
        yah1 yah1Var35 = new yah1("SINT64_LIST", 34, 34, 2, ubh1Var3);
        yah1 yah1Var36 = new yah1("DOUBLE_LIST_PACKED", 35, 35, 3, ubh1Var);
        f270900b = yah1Var36;
        yah1 yah1Var37 = new yah1("FLOAT_LIST_PACKED", 36, 36, 3, ubh1Var2);
        yah1 yah1Var38 = new yah1("INT64_LIST_PACKED", 37, 37, 3, ubh1Var3);
        yah1 yah1Var39 = new yah1("UINT64_LIST_PACKED", 38, 38, 3, ubh1Var3);
        yah1 yah1Var40 = new yah1("INT32_LIST_PACKED", 39, 39, 3, ubh1Var4);
        yah1 yah1Var41 = new yah1("FIXED64_LIST_PACKED", 40, 40, 3, ubh1Var3);
        yah1 yah1Var42 = new yah1("FIXED32_LIST_PACKED", 41, 41, 3, ubh1Var4);
        yah1 yah1Var43 = new yah1("BOOL_LIST_PACKED", 42, 42, 3, ubh1Var5);
        yah1 yah1Var44 = new yah1("UINT32_LIST_PACKED", 43, 43, 3, ubh1Var4);
        yah1 yah1Var45 = new yah1("ENUM_LIST_PACKED", 44, 44, 3, ubh1Var9);
        yah1 yah1Var46 = new yah1("SFIXED32_LIST_PACKED", 45, 45, 3, ubh1Var4);
        yah1 yah1Var47 = new yah1("SFIXED64_LIST_PACKED", 46, 46, 3, ubh1Var3);
        yah1 yah1Var48 = new yah1("SINT32_LIST_PACKED", 47, 47, 3, ubh1Var4);
        yah1 yah1Var49 = new yah1("SINT64_LIST_PACKED", 48, 48, 3, ubh1Var3);
        f270901c = yah1Var49;
        f270903e = new yah1[]{yah1Var, yah1Var2, yah1Var3, yah1Var4, yah1Var5, yah1Var6, yah1Var7, yah1Var8, yah1Var9, yah1Var10, yah1Var11, yah1Var12, yah1Var13, yah1Var14, yah1Var15, yah1Var16, yah1Var17, yah1Var18, yah1Var19, yah1Var20, yah1Var21, yah1Var22, yah1Var23, yah1Var24, yah1Var25, yah1Var26, yah1Var27, yah1Var28, yah1Var29, yah1Var30, yah1Var31, yah1Var32, yah1Var33, yah1Var34, yah1Var35, yah1Var36, yah1Var37, yah1Var38, yah1Var39, yah1Var40, yah1Var41, yah1Var42, yah1Var43, yah1Var44, yah1Var45, yah1Var46, yah1Var47, yah1Var48, yah1Var49, new yah1("GROUP_LIST", 49, 49, 2, ubh1Var7), new yah1("MAP", 50, 50, 4, ubh1.f228761a)};
        yah1[] yah1VarArrValues = values();
        f270902d = new yah1[yah1VarArrValues.length];
        for (yah1 yah1Var50 : yah1VarArrValues) {
            f270902d[yah1Var50.f270904a] = yah1Var50;
        }
    }

    public yah1(String str, int i, int i2, int i3, ubh1 ubh1Var) {
        super(str, i);
        this.f270904a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            ubh1Var.getClass();
        }
        if (i3 == 1) {
            ubh1 ubh1Var2 = ubh1.f228761a;
            ubh1Var.ordinal();
        }
    }

    public static yah1[] values() {
        return (yah1[]) f270903e.clone();
    }
}
