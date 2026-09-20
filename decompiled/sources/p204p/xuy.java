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
/* JADX INFO: loaded from: classes.dex */
public final class xuy {

    /* JADX INFO: renamed from: b */
    public static final xuy f266219b;

    /* JADX INFO: renamed from: c */
    public static final xuy f266220c;

    /* JADX INFO: renamed from: d */
    public static final xuy[] f266221d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ xuy[] f266222e;

    /* JADX INFO: renamed from: a */
    public final int f266223a;

    /* JADX INFO: Fake field, exist only in values array */
    xuy EF0;

    static {
        yd60 yd60Var = yd60.f271696e;
        xuy xuyVar = new xuy("DOUBLE", 0, 0, 1, yd60Var);
        yd60 yd60Var2 = yd60.f271695d;
        xuy xuyVar2 = new xuy("FLOAT", 1, 1, 1, yd60Var2);
        yd60 yd60Var3 = yd60.f271694c;
        xuy xuyVar3 = new xuy("INT64", 2, 2, 1, yd60Var3);
        xuy xuyVar4 = new xuy("UINT64", 3, 3, 1, yd60Var3);
        yd60 yd60Var4 = yd60.f271693b;
        xuy xuyVar5 = new xuy("INT32", 4, 4, 1, yd60Var4);
        xuy xuyVar6 = new xuy("FIXED64", 5, 5, 1, yd60Var3);
        xuy xuyVar7 = new xuy("FIXED32", 6, 6, 1, yd60Var4);
        yd60 yd60Var5 = yd60.f271697f;
        xuy xuyVar8 = new xuy("BOOL", 7, 7, 1, yd60Var5);
        yd60 yd60Var6 = yd60.f271698g;
        xuy xuyVar9 = new xuy("STRING", 8, 8, 1, yd60Var6);
        yd60 yd60Var7 = yd60.f271701t;
        xuy xuyVar10 = new xuy("MESSAGE", 9, 9, 1, yd60Var7);
        yd60 yd60Var8 = yd60.f271699h;
        xuy xuyVar11 = new xuy("BYTES", 10, 10, 1, yd60Var8);
        xuy xuyVar12 = new xuy("UINT32", 11, 11, 1, yd60Var4);
        yd60 yd60Var9 = yd60.f271700i;
        xuy xuyVar13 = new xuy("ENUM", 12, 12, 1, yd60Var9);
        xuy xuyVar14 = new xuy("SFIXED32", 13, 13, 1, yd60Var4);
        xuy xuyVar15 = new xuy("SFIXED64", 14, 14, 1, yd60Var3);
        xuy xuyVar16 = new xuy("SINT32", 15, 15, 1, yd60Var4);
        xuy xuyVar17 = new xuy("SINT64", 16, 16, 1, yd60Var3);
        xuy xuyVar18 = new xuy("GROUP", 17, 17, 1, yd60Var7);
        xuy xuyVar19 = new xuy("DOUBLE_LIST", 18, 18, 2, yd60Var);
        xuy xuyVar20 = new xuy("FLOAT_LIST", 19, 19, 2, yd60Var2);
        xuy xuyVar21 = new xuy("INT64_LIST", 20, 20, 2, yd60Var3);
        xuy xuyVar22 = new xuy("UINT64_LIST", 21, 21, 2, yd60Var3);
        xuy xuyVar23 = new xuy("INT32_LIST", 22, 22, 2, yd60Var4);
        xuy xuyVar24 = new xuy("FIXED64_LIST", 23, 23, 2, yd60Var3);
        xuy xuyVar25 = new xuy("FIXED32_LIST", 24, 24, 2, yd60Var4);
        xuy xuyVar26 = new xuy("BOOL_LIST", 25, 25, 2, yd60Var5);
        xuy xuyVar27 = new xuy("STRING_LIST", 26, 26, 2, yd60Var6);
        xuy xuyVar28 = new xuy("MESSAGE_LIST", 27, 27, 2, yd60Var7);
        xuy xuyVar29 = new xuy("BYTES_LIST", 28, 28, 2, yd60Var8);
        xuy xuyVar30 = new xuy("UINT32_LIST", 29, 29, 2, yd60Var4);
        xuy xuyVar31 = new xuy("ENUM_LIST", 30, 30, 2, yd60Var9);
        xuy xuyVar32 = new xuy("SFIXED32_LIST", 31, 31, 2, yd60Var4);
        xuy xuyVar33 = new xuy("SFIXED64_LIST", 32, 32, 2, yd60Var3);
        xuy xuyVar34 = new xuy("SINT32_LIST", 33, 33, 2, yd60Var4);
        xuy xuyVar35 = new xuy("SINT64_LIST", 34, 34, 2, yd60Var3);
        xuy xuyVar36 = new xuy("DOUBLE_LIST_PACKED", 35, 35, 3, yd60Var);
        f266219b = xuyVar36;
        xuy xuyVar37 = new xuy("FLOAT_LIST_PACKED", 36, 36, 3, yd60Var2);
        xuy xuyVar38 = new xuy("INT64_LIST_PACKED", 37, 37, 3, yd60Var3);
        xuy xuyVar39 = new xuy("UINT64_LIST_PACKED", 38, 38, 3, yd60Var3);
        xuy xuyVar40 = new xuy("INT32_LIST_PACKED", 39, 39, 3, yd60Var4);
        xuy xuyVar41 = new xuy("FIXED64_LIST_PACKED", 40, 40, 3, yd60Var3);
        xuy xuyVar42 = new xuy("FIXED32_LIST_PACKED", 41, 41, 3, yd60Var4);
        xuy xuyVar43 = new xuy("BOOL_LIST_PACKED", 42, 42, 3, yd60Var5);
        xuy xuyVar44 = new xuy("UINT32_LIST_PACKED", 43, 43, 3, yd60Var4);
        xuy xuyVar45 = new xuy("ENUM_LIST_PACKED", 44, 44, 3, yd60Var9);
        xuy xuyVar46 = new xuy("SFIXED32_LIST_PACKED", 45, 45, 3, yd60Var4);
        xuy xuyVar47 = new xuy("SFIXED64_LIST_PACKED", 46, 46, 3, yd60Var3);
        xuy xuyVar48 = new xuy("SINT32_LIST_PACKED", 47, 47, 3, yd60Var4);
        xuy xuyVar49 = new xuy("SINT64_LIST_PACKED", 48, 48, 3, yd60Var3);
        f266220c = xuyVar49;
        f266222e = new xuy[]{xuyVar, xuyVar2, xuyVar3, xuyVar4, xuyVar5, xuyVar6, xuyVar7, xuyVar8, xuyVar9, xuyVar10, xuyVar11, xuyVar12, xuyVar13, xuyVar14, xuyVar15, xuyVar16, xuyVar17, xuyVar18, xuyVar19, xuyVar20, xuyVar21, xuyVar22, xuyVar23, xuyVar24, xuyVar25, xuyVar26, xuyVar27, xuyVar28, xuyVar29, xuyVar30, xuyVar31, xuyVar32, xuyVar33, xuyVar34, xuyVar35, xuyVar36, xuyVar37, xuyVar38, xuyVar39, xuyVar40, xuyVar41, xuyVar42, xuyVar43, xuyVar44, xuyVar45, xuyVar46, xuyVar47, xuyVar48, xuyVar49, new xuy("GROUP_LIST", 49, 49, 2, yd60Var7), new xuy("MAP", 50, 50, 4, yd60.f271692a)};
        xuy[] xuyVarArrValues = values();
        f266221d = new xuy[xuyVarArrValues.length];
        for (xuy xuyVar50 : xuyVarArrValues) {
            f266221d[xuyVar50.f266223a] = xuyVar50;
        }
    }

    public xuy(String str, int i, int i2, int i3, yd60 yd60Var) {
        super(str, i);
        this.f266223a = i2;
        int iM38547C = edb.m38547C(i3);
        if (iM38547C == 1 || iM38547C == 3) {
            yd60Var.getClass();
        }
        if (i3 == 1) {
            yd60Var.ordinal();
        }
    }

    public static xuy valueOf(String str) {
        return (xuy) Enum.valueOf(xuy.class, str);
    }

    public static xuy[] values() {
        return (xuy[]) f266222e.clone();
    }
}
