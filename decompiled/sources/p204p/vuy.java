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
public final class vuy {

    /* JADX INFO: renamed from: b */
    public static final vuy f245091b;

    /* JADX INFO: renamed from: c */
    public static final vuy f245092c;

    /* JADX INFO: renamed from: d */
    public static final vuy[] f245093d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ vuy[] f245094e;

    /* JADX INFO: renamed from: a */
    public final int f245095a;

    /* JADX INFO: Fake field, exist only in values array */
    vuy EF0;

    static {
        wd60 wd60Var = wd60.f250217e;
        vuy vuyVar = new vuy("DOUBLE", 0, 0, 1, wd60Var);
        wd60 wd60Var2 = wd60.f250216d;
        vuy vuyVar2 = new vuy("FLOAT", 1, 1, 1, wd60Var2);
        wd60 wd60Var3 = wd60.f250215c;
        vuy vuyVar3 = new vuy("INT64", 2, 2, 1, wd60Var3);
        vuy vuyVar4 = new vuy("UINT64", 3, 3, 1, wd60Var3);
        wd60 wd60Var4 = wd60.f250214b;
        vuy vuyVar5 = new vuy("INT32", 4, 4, 1, wd60Var4);
        vuy vuyVar6 = new vuy("FIXED64", 5, 5, 1, wd60Var3);
        vuy vuyVar7 = new vuy("FIXED32", 6, 6, 1, wd60Var4);
        wd60 wd60Var5 = wd60.f250218f;
        vuy vuyVar8 = new vuy("BOOL", 7, 7, 1, wd60Var5);
        wd60 wd60Var6 = wd60.f250219g;
        vuy vuyVar9 = new vuy("STRING", 8, 8, 1, wd60Var6);
        wd60 wd60Var7 = wd60.f250222t;
        vuy vuyVar10 = new vuy("MESSAGE", 9, 9, 1, wd60Var7);
        wd60 wd60Var8 = wd60.f250220h;
        vuy vuyVar11 = new vuy("BYTES", 10, 10, 1, wd60Var8);
        vuy vuyVar12 = new vuy("UINT32", 11, 11, 1, wd60Var4);
        wd60 wd60Var9 = wd60.f250221i;
        vuy vuyVar13 = new vuy("ENUM", 12, 12, 1, wd60Var9);
        vuy vuyVar14 = new vuy("SFIXED32", 13, 13, 1, wd60Var4);
        vuy vuyVar15 = new vuy("SFIXED64", 14, 14, 1, wd60Var3);
        vuy vuyVar16 = new vuy("SINT32", 15, 15, 1, wd60Var4);
        vuy vuyVar17 = new vuy("SINT64", 16, 16, 1, wd60Var3);
        vuy vuyVar18 = new vuy("GROUP", 17, 17, 1, wd60Var7);
        vuy vuyVar19 = new vuy("DOUBLE_LIST", 18, 18, 2, wd60Var);
        vuy vuyVar20 = new vuy("FLOAT_LIST", 19, 19, 2, wd60Var2);
        vuy vuyVar21 = new vuy("INT64_LIST", 20, 20, 2, wd60Var3);
        vuy vuyVar22 = new vuy("UINT64_LIST", 21, 21, 2, wd60Var3);
        vuy vuyVar23 = new vuy("INT32_LIST", 22, 22, 2, wd60Var4);
        vuy vuyVar24 = new vuy("FIXED64_LIST", 23, 23, 2, wd60Var3);
        vuy vuyVar25 = new vuy("FIXED32_LIST", 24, 24, 2, wd60Var4);
        vuy vuyVar26 = new vuy("BOOL_LIST", 25, 25, 2, wd60Var5);
        vuy vuyVar27 = new vuy("STRING_LIST", 26, 26, 2, wd60Var6);
        vuy vuyVar28 = new vuy("MESSAGE_LIST", 27, 27, 2, wd60Var7);
        vuy vuyVar29 = new vuy("BYTES_LIST", 28, 28, 2, wd60Var8);
        vuy vuyVar30 = new vuy("UINT32_LIST", 29, 29, 2, wd60Var4);
        vuy vuyVar31 = new vuy("ENUM_LIST", 30, 30, 2, wd60Var9);
        vuy vuyVar32 = new vuy("SFIXED32_LIST", 31, 31, 2, wd60Var4);
        vuy vuyVar33 = new vuy("SFIXED64_LIST", 32, 32, 2, wd60Var3);
        vuy vuyVar34 = new vuy("SINT32_LIST", 33, 33, 2, wd60Var4);
        vuy vuyVar35 = new vuy("SINT64_LIST", 34, 34, 2, wd60Var3);
        vuy vuyVar36 = new vuy("DOUBLE_LIST_PACKED", 35, 35, 3, wd60Var);
        f245091b = vuyVar36;
        vuy vuyVar37 = new vuy("FLOAT_LIST_PACKED", 36, 36, 3, wd60Var2);
        vuy vuyVar38 = new vuy("INT64_LIST_PACKED", 37, 37, 3, wd60Var3);
        vuy vuyVar39 = new vuy("UINT64_LIST_PACKED", 38, 38, 3, wd60Var3);
        vuy vuyVar40 = new vuy("INT32_LIST_PACKED", 39, 39, 3, wd60Var4);
        vuy vuyVar41 = new vuy("FIXED64_LIST_PACKED", 40, 40, 3, wd60Var3);
        vuy vuyVar42 = new vuy("FIXED32_LIST_PACKED", 41, 41, 3, wd60Var4);
        vuy vuyVar43 = new vuy("BOOL_LIST_PACKED", 42, 42, 3, wd60Var5);
        vuy vuyVar44 = new vuy("UINT32_LIST_PACKED", 43, 43, 3, wd60Var4);
        vuy vuyVar45 = new vuy("ENUM_LIST_PACKED", 44, 44, 3, wd60Var9);
        vuy vuyVar46 = new vuy("SFIXED32_LIST_PACKED", 45, 45, 3, wd60Var4);
        vuy vuyVar47 = new vuy("SFIXED64_LIST_PACKED", 46, 46, 3, wd60Var3);
        vuy vuyVar48 = new vuy("SINT32_LIST_PACKED", 47, 47, 3, wd60Var4);
        vuy vuyVar49 = new vuy("SINT64_LIST_PACKED", 48, 48, 3, wd60Var3);
        f245092c = vuyVar49;
        f245094e = new vuy[]{vuyVar, vuyVar2, vuyVar3, vuyVar4, vuyVar5, vuyVar6, vuyVar7, vuyVar8, vuyVar9, vuyVar10, vuyVar11, vuyVar12, vuyVar13, vuyVar14, vuyVar15, vuyVar16, vuyVar17, vuyVar18, vuyVar19, vuyVar20, vuyVar21, vuyVar22, vuyVar23, vuyVar24, vuyVar25, vuyVar26, vuyVar27, vuyVar28, vuyVar29, vuyVar30, vuyVar31, vuyVar32, vuyVar33, vuyVar34, vuyVar35, vuyVar36, vuyVar37, vuyVar38, vuyVar39, vuyVar40, vuyVar41, vuyVar42, vuyVar43, vuyVar44, vuyVar45, vuyVar46, vuyVar47, vuyVar48, vuyVar49, new vuy("GROUP_LIST", 49, 49, 2, wd60Var7), new vuy("MAP", 50, 50, 4, wd60.f250213a)};
        vuy[] vuyVarArrValues = values();
        f245093d = new vuy[vuyVarArrValues.length];
        for (vuy vuyVar50 : vuyVarArrValues) {
            f245093d[vuyVar50.f245095a] = vuyVar50;
        }
    }

    public vuy(String str, int i, int i2, int i3, wd60 wd60Var) {
        super(str, i);
        this.f245095a = i2;
        int iM38547C = edb.m38547C(i3);
        if (iM38547C == 1 || iM38547C == 3) {
            wd60Var.getClass();
        }
        if (i3 == 1) {
            wd60Var.ordinal();
        }
    }

    public static vuy valueOf(String str) {
        return (vuy) Enum.valueOf(vuy.class, str);
    }

    public static vuy[] values() {
        return (vuy[]) f245094e.clone();
    }
}
