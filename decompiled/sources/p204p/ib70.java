package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ib70 {

    /* JADX INFO: renamed from: e */
    public static final qti0 f100456e = qti0.m73843g("<built-ins module>");

    /* JADX INFO: renamed from: a */
    public nxh0 f100457a;

    /* JADX INFO: renamed from: b */
    public final yma0 f100458b;

    /* JADX INFO: renamed from: c */
    public final vma0 f100459c;

    /* JADX INFO: renamed from: d */
    public final bna0 f100460d;

    public ib70(bna0 bna0Var) {
        this.f100460d = bna0Var;
        bna0Var.m29936a(new gb70(this, 0));
        this.f100458b = new yma0(bna0Var, new gb70(this, 1));
        this.f100459c = bna0Var.m29937b(new h25(this, 1));
    }

    /* JADX INFO: renamed from: A */
    public static boolean m50133A(oqo oqoVar) {
        if (oqoVar != null) {
            return rxq.m76670h(oqoVar, wqa.class, false) != null;
        }
        m50144a(9);
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m50134B(gd70 gd70Var, z400 z400Var) {
        if (gd70Var == null) {
            m50144a(97);
            throw null;
        }
        if (z400Var != null) {
            return m50142J(gd70Var.mo36063C0(), z400Var);
        }
        m50144a(98);
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m50135C(gd70 gd70Var, z400 z400Var) {
        if (z400Var != null) {
            return m50134B(gd70Var, z400Var) && !gd70Var.mo36064D0();
        }
        m50144a(135);
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m50136D(mi00 mi00Var) {
        if (mi00Var.mo27377a().getAnnotations().mo55149r0(qm41.f190112m)) {
            return true;
        }
        if (!(mi00Var instanceof nys0)) {
            return false;
        }
        nys0 nys0Var = (nys0) mi00Var;
        boolean zMo40725P = nys0Var.mo40725P();
        tys0 tys0VarMo65908b = nys0Var.mo65908b();
        zys0 zys0VarMo65909c = nys0Var.mo65909c();
        if (tys0VarMo65908b == null || !m50136D(tys0VarMo65908b)) {
            return false;
        }
        if (zMo40725P) {
            return zys0VarMo65909c != null && m50136D(zys0VarMo65909c);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m50137E(gd70 gd70Var, z400 z400Var) {
        if (gd70Var == null) {
            m50144a(105);
            throw null;
        }
        if (z400Var != null) {
            return !gd70Var.mo36064D0() && m50134B(gd70Var, z400Var);
        }
        m50144a(Error.INVALID_COUNTRY_FIELD_NUMBER);
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m50138F(gd70 gd70Var) {
        if (gd70Var != null) {
            return m50134B(gd70Var, qm41.f190095b) && !so91.m78634e(gd70Var);
        }
        m50144a(136);
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m50139G(gd70 gd70Var) {
        if (gd70Var == null) {
            m50144a(94);
            throw null;
        }
        if (gd70Var.mo36064D0()) {
            return false;
        }
        qge qgeVarMo25169G = gd70Var.mo36063C0().mo25169G();
        return (qgeVarMo25169G instanceof nfe) && m50147u((nfe) qgeVarMo25169G) != null;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m50140H(nfe nfeVar) {
        if (nfeVar != null) {
            return m50145b(nfeVar, qm41.f190093a) || m50145b(nfeVar, qm41.f190095b);
        }
        m50144a(Error.TOO_YOUNG_FIELD_NUMBER);
        throw null;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m50141I(gd70 gd70Var) {
        return m50137E(gd70Var, qm41.f190103f);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m50142J(jn91 jn91Var, z400 z400Var) {
        if (jn91Var == null) {
            m50144a(101);
            throw null;
        }
        if (z400Var != null) {
            qge qgeVarMo25169G = jn91Var.mo25169G();
            return (qgeVarMo25169G instanceof nfe) && m50145b((nfe) qgeVarMo25169G, z400Var);
        }
        m50144a(102);
        throw null;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m50143K(qge qgeVar) {
        if (qgeVar == null) {
            m50144a(10);
            throw null;
        }
        for (oqo oqoVarMo27379o = qgeVar; oqoVarMo27379o != null; oqoVarMo27379o = oqoVarMo27379o.mo27379o()) {
            if (oqoVarMo27379o instanceof m3m0) {
                y400 y400Var = ((n3m0) ((m3m0) oqoVarMo27379o)).f150085f;
                return y400Var.f269048a.m95307h(rm41.f200444k);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50144a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
            case 99:
            case 105:
            case 109:
            case 110:
            case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
            case ContentType.LIVE /* 113 */:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
            case ContentType.USER_GENERATED_LIVE /* 123 */:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                objArr[2] = "isBoolean";
                break;
            case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case ContentType.LIVE /* 113 */:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                objArr[2] = "isFloat";
                break;
            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case ContentType.USER_GENERATED_LIVE /* 123 */:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m50145b(nfe nfeVar, z400 z400Var) {
        if (nfeVar == null) {
            m50144a(103);
            throw null;
        }
        if (z400Var != null) {
            return nfeVar.getName().equals(z400Var.m95306g()) && z400Var.equals(rxq.m76668f(nfeVar));
        }
        m50144a(104);
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static her0 m50146s(qge qgeVar) {
        if (qgeVar == null) {
            m50144a(77);
            throw null;
        }
        if (qm41.f190102e0.contains(qgeVar.getName())) {
            return (her0) qm41.f190106g0.get(rxq.m76668f(qgeVar));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static her0 m50147u(nfe nfeVar) {
        if (qm41.f190100d0.contains(nfeVar.getName())) {
            return (her0) qm41.f190104f0.get(rxq.m76668f(nfeVar));
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m50148y(gd70 gd70Var) {
        if (gd70Var != null) {
            return m50134B(gd70Var, qm41.f190093a);
        }
        m50144a(139);
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m50149z(gd70 gd70Var) {
        if (gd70Var != null) {
            return m50134B(gd70Var, qm41.f190105g);
        }
        m50144a(88);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: c */
    public final void m50150c(boolean z) {
        qti0 qti0Var = f100456e;
        bna0 bna0Var = this.f100460d;
        nxh0 nxh0Var = new nxh0(qti0Var, bna0Var, this, 48);
        this.f100457a = nxh0Var;
        BuiltInsLoader.f10911a.getClass();
        nxh0Var.f159480i = ((BuiltInsLoader) vqa.f243906b.getValue()).createPackageFragmentProvider(bna0Var, this.f100457a, mo50161n(), mo50164q(), mo50151d(), z);
        nxh0 nxh0Var2 = this.f100457a;
        nxh0Var2.getClass();
        nxh0Var2.f159479h = new q06(bk5.m29620k1(new nxh0[]{nxh0Var2}));
    }

    /* JADX INFO: renamed from: d */
    public jv1 mo50151d() {
        return oet.f164551e;
    }

    /* JADX INFO: renamed from: e */
    public final nfe m50152e() {
        return m50159l("Any");
    }

    /* JADX INFO: renamed from: f */
    public final jd21 m50153f() {
        jd21 jd21VarMo27380q = m50159l("Any").mo27380q();
        if (jd21VarMo27380q != null) {
            return jd21VarMo27380q;
        }
        m50144a(51);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final gd70 m50154g(gd70 gd70Var) {
        if (gd70Var == null) {
            m50144a(68);
            throw null;
        }
        gd70 gd70VarM50155h = m50155h(gd70Var);
        if (gd70VarM50155h != null) {
            return gd70VarM50155h;
        }
        throw new IllegalStateException("not array: " + gd70Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX INFO: renamed from: h */
    public final gd70 m50155h(gd70 gd70Var) {
        vfe vfeVarM81933f;
        vfe vfeVar;
        nfe nfeVarM65521g;
        jd21 jd21VarMo27380q;
        if (gd70Var == null) {
            m50144a(70);
            throw null;
        }
        if (!m50149z(gd70Var)) {
            d6a1 d6a1VarM78636g = so91.m78636g(gd70Var, false);
            gd70 gd70Var2 = (gd70) ((hb70) this.f100458b.invoke()).f89419b.get(d6a1VarM78636g);
            if (gd70Var2 != null) {
                return gd70Var2;
            }
            int i = rxq.f203658a;
            qge qgeVarMo25169G = d6a1VarM78636g.mo36063C0().mo25169G();
            mxh0 mxh0VarM76666d = qgeVarMo25169G == null ? null : rxq.m76666d(qgeVarMo25169G);
            if (mxh0VarM76666d != null) {
                qge qgeVarMo25169G2 = d6a1VarM78636g.mo36063C0().mo25169G();
                if (qgeVarMo25169G2 == null) {
                    jd21VarMo27380q = null;
                } else {
                    Set set = n5a1.f150510a;
                    if (!n5a1.f150513d.contains(qgeVarMo25169G2.getName()) || (vfeVarM81933f = txq.m81933f(qgeVarMo25169G2)) == null || (vfeVar = (vfe) n5a1.f150511b.get(vfeVarM81933f)) == null || (nfeVarM65521g = nsf1.m65521g(mxh0VarM76666d, vfeVar)) == null) {
                        jd21VarMo27380q = null;
                    } else {
                        jd21VarMo27380q = nfeVarM65521g.mo27380q();
                    }
                }
                if (jd21VarMo27380q != null) {
                    return jd21VarMo27380q;
                }
            }
        } else if (gd70Var.mo36061A0().size() == 1) {
            return ((ho91) gd70Var.mo36061A0().get(0)).mo48023b();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final jd21 m50156i(int i, gd70 gd70Var, l25 l25Var) {
        if (i == 0) {
            m50144a(78);
            throw null;
        }
        if (gd70Var != null) {
            return pug1.m71084p(Collections.singletonList(new io91(i, gd70Var)), mjx0.m62019W(l25Var), m50159l("Array").mo27378k(), false);
        }
        m50144a(79);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final jd21 m50157j(gd70 gd70Var) {
        if (gd70Var != null) {
            return m50156i(1, gd70Var, e370.f55667h);
        }
        m50144a(83);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final nfe m50158k(y400 y400Var) {
        if (y400Var == null) {
            m50144a(12);
            throw null;
        }
        nfe nfeVarM70362u = pmg1.m70362u(m50160m(), y400Var);
        if (nfeVarM70362u != null) {
            return nfeVarM70362u;
        }
        m50144a(13);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final nfe m50159l(String str) {
        if (str != null) {
            return (nfe) this.f100459c.invoke(qti0.m73841e(str));
        }
        m50144a(14);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final nxh0 m50160m() {
        this.f100457a.getClass();
        nxh0 nxh0Var = this.f100457a;
        if (nxh0Var != null) {
            return nxh0Var;
        }
        m50144a(7);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public Iterable mo50161n() {
        List listSingletonList = Collections.singletonList(new sqa(this.f100460d, m50160m()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m50144a(5);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final jd21 m50162o() {
        jd21 jd21VarMo27380q = m50159l("Nothing").mo27380q();
        if (jd21VarMo27380q != null) {
            return jd21VarMo27380q;
        }
        m50144a(49);
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public final jd21 m50163p() {
        jd21 jd21VarMo48289J0 = m50153f().mo35109G0(true);
        if (jd21VarMo48289J0 != null) {
            return jd21VarMo48289J0;
        }
        m50144a(52);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public yco0 mo50164q() {
        return kaz.f120991V0;
    }

    /* JADX INFO: renamed from: r */
    public final jd21 m50165r(her0 her0Var) {
        if (her0Var == null) {
            m50144a(73);
            throw null;
        }
        jd21 jd21Var = (jd21) ((hb70) this.f100458b.invoke()).f89418a.get(her0Var);
        if (jd21Var != null) {
            return jd21Var;
        }
        m50144a(74);
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public final jd21 m50166t(her0 her0Var) {
        if (her0Var == null) {
            m50144a(54);
            throw null;
        }
        jd21 jd21VarMo27380q = m50159l(her0Var.f90500a.m73844b()).mo27380q();
        if (jd21VarMo27380q != null) {
            return jd21VarMo27380q;
        }
        m50144a(55);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final jd21 m50167v() {
        jd21 jd21VarMo27380q = m50159l("String").mo27380q();
        if (jd21VarMo27380q != null) {
            return jd21VarMo27380q;
        }
        m50144a(66);
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public final nfe m50168w(int i) {
        return m50158k(rm41.f200439f.m92785a(qti0.m73841e(vi00.f241575d.f251468b + i)));
    }

    /* JADX INFO: renamed from: x */
    public final jd21 m50169x() {
        jd21 jd21VarMo27380q = m50159l("Unit").mo27380q();
        if (jd21VarMo27380q != null) {
            return jd21VarMo27380q;
        }
        m50144a(65);
        throw null;
    }
}
