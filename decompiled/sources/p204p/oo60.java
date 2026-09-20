package p204p;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public enum oo60 {
    BOOLEAN(her0.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(her0.CHAR, "char", "C", "java.lang.Character"),
    BYTE(her0.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(her0.SHORT, "short", "S", "java.lang.Short"),
    INT(her0.INT, "int", "I", "java.lang.Integer"),
    FLOAT(her0.FLOAT, "float", "F", "java.lang.Float"),
    LONG(her0.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(her0.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: a */
    public final her0 f167492a;

    /* JADX INFO: renamed from: b */
    public final String f167493b;

    /* JADX INFO: renamed from: c */
    public final String f167494c;

    /* JADX INFO: renamed from: d */
    public final y400 f167495d;

    /* JADX INFO: renamed from: Z */
    public static final HashMap f167485Z = new HashMap();

    /* JADX INFO: renamed from: L0 */
    public static final EnumMap f167478L0 = new EnumMap(her0.class);

    /* JADX INFO: renamed from: M0 */
    public static final HashMap f167479M0 = new HashMap();

    /* JADX INFO: renamed from: N0 */
    public static final HashSet f167480N0 = new HashSet();

    /* JADX INFO: renamed from: O0 */
    public static final HashMap f167481O0 = new HashMap();

    static {
        for (oo60 oo60Var : values()) {
            f167485Z.put(oo60Var.f167493b, oo60Var);
            f167478L0.put(oo60Var.m67454d(), oo60Var);
            f167479M0.put(oo60Var.m67453c(), oo60Var);
            String strReplace = oo60Var.f167495d.f269048a.f279080a.replace('.', '/');
            f167480N0.add(strReplace);
            f167481O0.put(strReplace, klh.m56837i(new StringBuilder("("), oo60Var.f167494c, ")L", strReplace, ";"));
        }
    }

    oo60(her0 her0Var, String str, String str2, String str3) {
        if (her0Var == null) {
            m67451a(8);
            throw null;
        }
        this.f167492a = her0Var;
        this.f167493b = str;
        this.f167494c = str2;
        this.f167495d = new y400(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m67451a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static oo60 m67452b(String str) {
        oo60 oo60Var = (oo60) f167485Z.get(str);
        if (oo60Var != null) {
            return oo60Var;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public final String m67453c() {
        String str = this.f167494c;
        if (str != null) {
            return str;
        }
        m67451a(14);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final her0 m67454d() {
        her0 her0Var = this.f167492a;
        if (her0Var != null) {
            return her0Var;
        }
        m67451a(12);
        throw null;
    }
}
