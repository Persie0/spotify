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
/* JADX INFO: loaded from: classes3.dex */
public final class yuy {

    /* JADX INFO: renamed from: b */
    public static final yuy f276503b;

    /* JADX INFO: renamed from: c */
    public static final yuy f276504c;

    /* JADX INFO: renamed from: d */
    public static final yuy[] f276505d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ yuy[] f276506e;

    /* JADX INFO: renamed from: a */
    public final int f276507a;

    /* JADX INFO: Fake field, exist only in values array */
    yuy EF0;

    static {
        ae60 ae60Var = ae60.f14759e;
        yuy yuyVar = new yuy("DOUBLE", 0, 0, 1, ae60Var);
        ae60 ae60Var2 = ae60.f14758d;
        yuy yuyVar2 = new yuy("FLOAT", 1, 1, 1, ae60Var2);
        ae60 ae60Var3 = ae60.f14757c;
        yuy yuyVar3 = new yuy("INT64", 2, 2, 1, ae60Var3);
        yuy yuyVar4 = new yuy("UINT64", 3, 3, 1, ae60Var3);
        ae60 ae60Var4 = ae60.f14756b;
        yuy yuyVar5 = new yuy("INT32", 4, 4, 1, ae60Var4);
        yuy yuyVar6 = new yuy("FIXED64", 5, 5, 1, ae60Var3);
        yuy yuyVar7 = new yuy("FIXED32", 6, 6, 1, ae60Var4);
        ae60 ae60Var5 = ae60.f14760f;
        yuy yuyVar8 = new yuy("BOOL", 7, 7, 1, ae60Var5);
        ae60 ae60Var6 = ae60.f14761g;
        yuy yuyVar9 = new yuy("STRING", 8, 8, 1, ae60Var6);
        ae60 ae60Var7 = ae60.f14764t;
        yuy yuyVar10 = new yuy("MESSAGE", 9, 9, 1, ae60Var7);
        ae60 ae60Var8 = ae60.f14762h;
        yuy yuyVar11 = new yuy("BYTES", 10, 10, 1, ae60Var8);
        yuy yuyVar12 = new yuy("UINT32", 11, 11, 1, ae60Var4);
        ae60 ae60Var9 = ae60.f14763i;
        yuy yuyVar13 = new yuy("ENUM", 12, 12, 1, ae60Var9);
        yuy yuyVar14 = new yuy("SFIXED32", 13, 13, 1, ae60Var4);
        yuy yuyVar15 = new yuy("SFIXED64", 14, 14, 1, ae60Var3);
        yuy yuyVar16 = new yuy("SINT32", 15, 15, 1, ae60Var4);
        yuy yuyVar17 = new yuy("SINT64", 16, 16, 1, ae60Var3);
        yuy yuyVar18 = new yuy("GROUP", 17, 17, 1, ae60Var7);
        yuy yuyVar19 = new yuy("DOUBLE_LIST", 18, 18, 2, ae60Var);
        yuy yuyVar20 = new yuy("FLOAT_LIST", 19, 19, 2, ae60Var2);
        yuy yuyVar21 = new yuy("INT64_LIST", 20, 20, 2, ae60Var3);
        yuy yuyVar22 = new yuy("UINT64_LIST", 21, 21, 2, ae60Var3);
        yuy yuyVar23 = new yuy("INT32_LIST", 22, 22, 2, ae60Var4);
        yuy yuyVar24 = new yuy("FIXED64_LIST", 23, 23, 2, ae60Var3);
        yuy yuyVar25 = new yuy("FIXED32_LIST", 24, 24, 2, ae60Var4);
        yuy yuyVar26 = new yuy("BOOL_LIST", 25, 25, 2, ae60Var5);
        yuy yuyVar27 = new yuy("STRING_LIST", 26, 26, 2, ae60Var6);
        yuy yuyVar28 = new yuy("MESSAGE_LIST", 27, 27, 2, ae60Var7);
        yuy yuyVar29 = new yuy("BYTES_LIST", 28, 28, 2, ae60Var8);
        yuy yuyVar30 = new yuy("UINT32_LIST", 29, 29, 2, ae60Var4);
        yuy yuyVar31 = new yuy("ENUM_LIST", 30, 30, 2, ae60Var9);
        yuy yuyVar32 = new yuy("SFIXED32_LIST", 31, 31, 2, ae60Var4);
        yuy yuyVar33 = new yuy("SFIXED64_LIST", 32, 32, 2, ae60Var3);
        yuy yuyVar34 = new yuy("SINT32_LIST", 33, 33, 2, ae60Var4);
        yuy yuyVar35 = new yuy("SINT64_LIST", 34, 34, 2, ae60Var3);
        yuy yuyVar36 = new yuy("DOUBLE_LIST_PACKED", 35, 35, 3, ae60Var);
        f276503b = yuyVar36;
        yuy yuyVar37 = new yuy("FLOAT_LIST_PACKED", 36, 36, 3, ae60Var2);
        yuy yuyVar38 = new yuy("INT64_LIST_PACKED", 37, 37, 3, ae60Var3);
        yuy yuyVar39 = new yuy("UINT64_LIST_PACKED", 38, 38, 3, ae60Var3);
        yuy yuyVar40 = new yuy("INT32_LIST_PACKED", 39, 39, 3, ae60Var4);
        yuy yuyVar41 = new yuy("FIXED64_LIST_PACKED", 40, 40, 3, ae60Var3);
        yuy yuyVar42 = new yuy("FIXED32_LIST_PACKED", 41, 41, 3, ae60Var4);
        yuy yuyVar43 = new yuy("BOOL_LIST_PACKED", 42, 42, 3, ae60Var5);
        yuy yuyVar44 = new yuy("UINT32_LIST_PACKED", 43, 43, 3, ae60Var4);
        yuy yuyVar45 = new yuy("ENUM_LIST_PACKED", 44, 44, 3, ae60Var9);
        yuy yuyVar46 = new yuy("SFIXED32_LIST_PACKED", 45, 45, 3, ae60Var4);
        yuy yuyVar47 = new yuy("SFIXED64_LIST_PACKED", 46, 46, 3, ae60Var3);
        yuy yuyVar48 = new yuy("SINT32_LIST_PACKED", 47, 47, 3, ae60Var4);
        yuy yuyVar49 = new yuy("SINT64_LIST_PACKED", 48, 48, 3, ae60Var3);
        f276504c = yuyVar49;
        f276506e = new yuy[]{yuyVar, yuyVar2, yuyVar3, yuyVar4, yuyVar5, yuyVar6, yuyVar7, yuyVar8, yuyVar9, yuyVar10, yuyVar11, yuyVar12, yuyVar13, yuyVar14, yuyVar15, yuyVar16, yuyVar17, yuyVar18, yuyVar19, yuyVar20, yuyVar21, yuyVar22, yuyVar23, yuyVar24, yuyVar25, yuyVar26, yuyVar27, yuyVar28, yuyVar29, yuyVar30, yuyVar31, yuyVar32, yuyVar33, yuyVar34, yuyVar35, yuyVar36, yuyVar37, yuyVar38, yuyVar39, yuyVar40, yuyVar41, yuyVar42, yuyVar43, yuyVar44, yuyVar45, yuyVar46, yuyVar47, yuyVar48, yuyVar49, new yuy("GROUP_LIST", 49, 49, 2, ae60Var7), new yuy("MAP", 50, 50, 4, ae60.f14755a)};
        yuy[] yuyVarArrValues = values();
        f276505d = new yuy[yuyVarArrValues.length];
        for (yuy yuyVar50 : yuyVarArrValues) {
            f276505d[yuyVar50.f276507a] = yuyVar50;
        }
    }

    public yuy(String str, int i, int i2, int i3, ae60 ae60Var) {
        super(str, i);
        this.f276507a = i2;
        int iM38547C = edb.m38547C(i3);
        if (iM38547C == 1 || iM38547C == 3) {
            ae60Var.getClass();
        }
        if (i3 == 1) {
            ae60Var.ordinal();
        }
    }

    public static yuy valueOf(String str) {
        return (yuy) Enum.valueOf(yuy.class, str);
    }

    public static yuy[] values() {
        return (yuy[]) f276506e.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m94671a() {
        return this.f276507a;
    }
}
