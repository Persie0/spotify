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
public final class wuy {

    /* JADX INFO: renamed from: b */
    public static final wuy f255295b;

    /* JADX INFO: renamed from: c */
    public static final wuy f255296c;

    /* JADX INFO: renamed from: d */
    public static final wuy[] f255297d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ wuy[] f255298e;

    /* JADX INFO: renamed from: a */
    public final int f255299a;

    /* JADX INFO: Fake field, exist only in values array */
    wuy EF0;

    static {
        xd60 xd60Var = xd60.f260386e;
        wuy wuyVar = new wuy("DOUBLE", 0, 0, 1, xd60Var);
        xd60 xd60Var2 = xd60.f260385d;
        wuy wuyVar2 = new wuy("FLOAT", 1, 1, 1, xd60Var2);
        xd60 xd60Var3 = xd60.f260384c;
        wuy wuyVar3 = new wuy("INT64", 2, 2, 1, xd60Var3);
        wuy wuyVar4 = new wuy("UINT64", 3, 3, 1, xd60Var3);
        xd60 xd60Var4 = xd60.f260383b;
        wuy wuyVar5 = new wuy("INT32", 4, 4, 1, xd60Var4);
        wuy wuyVar6 = new wuy("FIXED64", 5, 5, 1, xd60Var3);
        wuy wuyVar7 = new wuy("FIXED32", 6, 6, 1, xd60Var4);
        xd60 xd60Var5 = xd60.f260387f;
        wuy wuyVar8 = new wuy("BOOL", 7, 7, 1, xd60Var5);
        xd60 xd60Var6 = xd60.f260388g;
        wuy wuyVar9 = new wuy("STRING", 8, 8, 1, xd60Var6);
        xd60 xd60Var7 = xd60.f260391t;
        wuy wuyVar10 = new wuy("MESSAGE", 9, 9, 1, xd60Var7);
        xd60 xd60Var8 = xd60.f260389h;
        wuy wuyVar11 = new wuy("BYTES", 10, 10, 1, xd60Var8);
        wuy wuyVar12 = new wuy("UINT32", 11, 11, 1, xd60Var4);
        xd60 xd60Var9 = xd60.f260390i;
        wuy wuyVar13 = new wuy("ENUM", 12, 12, 1, xd60Var9);
        wuy wuyVar14 = new wuy("SFIXED32", 13, 13, 1, xd60Var4);
        wuy wuyVar15 = new wuy("SFIXED64", 14, 14, 1, xd60Var3);
        wuy wuyVar16 = new wuy("SINT32", 15, 15, 1, xd60Var4);
        wuy wuyVar17 = new wuy("SINT64", 16, 16, 1, xd60Var3);
        wuy wuyVar18 = new wuy("GROUP", 17, 17, 1, xd60Var7);
        wuy wuyVar19 = new wuy("DOUBLE_LIST", 18, 18, 2, xd60Var);
        wuy wuyVar20 = new wuy("FLOAT_LIST", 19, 19, 2, xd60Var2);
        wuy wuyVar21 = new wuy("INT64_LIST", 20, 20, 2, xd60Var3);
        wuy wuyVar22 = new wuy("UINT64_LIST", 21, 21, 2, xd60Var3);
        wuy wuyVar23 = new wuy("INT32_LIST", 22, 22, 2, xd60Var4);
        wuy wuyVar24 = new wuy("FIXED64_LIST", 23, 23, 2, xd60Var3);
        wuy wuyVar25 = new wuy("FIXED32_LIST", 24, 24, 2, xd60Var4);
        wuy wuyVar26 = new wuy("BOOL_LIST", 25, 25, 2, xd60Var5);
        wuy wuyVar27 = new wuy("STRING_LIST", 26, 26, 2, xd60Var6);
        wuy wuyVar28 = new wuy("MESSAGE_LIST", 27, 27, 2, xd60Var7);
        wuy wuyVar29 = new wuy("BYTES_LIST", 28, 28, 2, xd60Var8);
        wuy wuyVar30 = new wuy("UINT32_LIST", 29, 29, 2, xd60Var4);
        wuy wuyVar31 = new wuy("ENUM_LIST", 30, 30, 2, xd60Var9);
        wuy wuyVar32 = new wuy("SFIXED32_LIST", 31, 31, 2, xd60Var4);
        wuy wuyVar33 = new wuy("SFIXED64_LIST", 32, 32, 2, xd60Var3);
        wuy wuyVar34 = new wuy("SINT32_LIST", 33, 33, 2, xd60Var4);
        wuy wuyVar35 = new wuy("SINT64_LIST", 34, 34, 2, xd60Var3);
        wuy wuyVar36 = new wuy("DOUBLE_LIST_PACKED", 35, 35, 3, xd60Var);
        f255295b = wuyVar36;
        wuy wuyVar37 = new wuy("FLOAT_LIST_PACKED", 36, 36, 3, xd60Var2);
        wuy wuyVar38 = new wuy("INT64_LIST_PACKED", 37, 37, 3, xd60Var3);
        wuy wuyVar39 = new wuy("UINT64_LIST_PACKED", 38, 38, 3, xd60Var3);
        wuy wuyVar40 = new wuy("INT32_LIST_PACKED", 39, 39, 3, xd60Var4);
        wuy wuyVar41 = new wuy("FIXED64_LIST_PACKED", 40, 40, 3, xd60Var3);
        wuy wuyVar42 = new wuy("FIXED32_LIST_PACKED", 41, 41, 3, xd60Var4);
        wuy wuyVar43 = new wuy("BOOL_LIST_PACKED", 42, 42, 3, xd60Var5);
        wuy wuyVar44 = new wuy("UINT32_LIST_PACKED", 43, 43, 3, xd60Var4);
        wuy wuyVar45 = new wuy("ENUM_LIST_PACKED", 44, 44, 3, xd60Var9);
        wuy wuyVar46 = new wuy("SFIXED32_LIST_PACKED", 45, 45, 3, xd60Var4);
        wuy wuyVar47 = new wuy("SFIXED64_LIST_PACKED", 46, 46, 3, xd60Var3);
        wuy wuyVar48 = new wuy("SINT32_LIST_PACKED", 47, 47, 3, xd60Var4);
        wuy wuyVar49 = new wuy("SINT64_LIST_PACKED", 48, 48, 3, xd60Var3);
        f255296c = wuyVar49;
        f255298e = new wuy[]{wuyVar, wuyVar2, wuyVar3, wuyVar4, wuyVar5, wuyVar6, wuyVar7, wuyVar8, wuyVar9, wuyVar10, wuyVar11, wuyVar12, wuyVar13, wuyVar14, wuyVar15, wuyVar16, wuyVar17, wuyVar18, wuyVar19, wuyVar20, wuyVar21, wuyVar22, wuyVar23, wuyVar24, wuyVar25, wuyVar26, wuyVar27, wuyVar28, wuyVar29, wuyVar30, wuyVar31, wuyVar32, wuyVar33, wuyVar34, wuyVar35, wuyVar36, wuyVar37, wuyVar38, wuyVar39, wuyVar40, wuyVar41, wuyVar42, wuyVar43, wuyVar44, wuyVar45, wuyVar46, wuyVar47, wuyVar48, wuyVar49, new wuy("GROUP_LIST", 49, 49, 2, xd60Var7), new wuy("MAP", 50, 50, 4, xd60.f260382a)};
        wuy[] wuyVarArrValues = values();
        f255297d = new wuy[wuyVarArrValues.length];
        for (wuy wuyVar50 : wuyVarArrValues) {
            f255297d[wuyVar50.f255299a] = wuyVar50;
        }
    }

    public wuy(String str, int i, int i2, int i3, xd60 xd60Var) {
        super(str, i);
        this.f255299a = i2;
        int iM38547C = edb.m38547C(i3);
        if (iM38547C == 1 || iM38547C == 3) {
            xd60Var.getClass();
        }
        if (i3 == 1) {
            xd60Var.ordinal();
        }
    }

    public static wuy valueOf(String str) {
        return (wuy) Enum.valueOf(wuy.class, str);
    }

    public static wuy[] values() {
        return (wuy[]) f255298e.clone();
    }
}
