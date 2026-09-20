package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class so91 {

    /* JADX INFO: renamed from: a */
    public static final zgw f211151a = ehw.m39006b(chw.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final zgw f211152b = ehw.m39006b(chw.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c */
    public static final ro91 f211153c = new ro91("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final ro91 f211154d = new ro91("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m78630a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m78631b(gd70 gd70Var) {
        if (gd70Var == null) {
            m78630a(28);
            throw null;
        }
        if (gd70Var.mo36064D0()) {
            return true;
        }
        return (gd70Var.mo35108F0() instanceof dhz) && m78631b(((dhz) gd70Var.mo35108F0()).f49190c);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m78632c(gd70 gd70Var, gh00 gh00Var, zw21 zw21Var) {
        if (gd70Var == null) {
            return false;
        }
        d6a1 d6a1VarMo35108F0 = gd70Var.mo35108F0();
        if (m78641l(gd70Var)) {
            return ((Boolean) gh00Var.invoke(d6a1VarMo35108F0)).booleanValue();
        }
        if (zw21Var != null && zw21Var.contains(gd70Var)) {
            return false;
        }
        if (((Boolean) gh00Var.invoke(d6a1VarMo35108F0)).booleanValue()) {
            return true;
        }
        if (zw21Var == null) {
            int i = zw21.f286894c;
            zw21Var = pwb.m71231p();
        }
        zw21Var.add(gd70Var);
        dhz dhzVar = d6a1VarMo35108F0 instanceof dhz ? (dhz) d6a1VarMo35108F0 : null;
        if (dhzVar != null && (m78632c(dhzVar.f49189b, gh00Var, zw21Var) || m78632c(dhzVar.f49190c, gh00Var, zw21Var))) {
            return true;
        }
        if ((d6a1VarMo35108F0 instanceof pkq) && m78632c(((pkq) d6a1VarMo35108F0).f178510b, gh00Var, zw21Var)) {
            return true;
        }
        jn91 jn91VarMo36063C0 = gd70Var.mo36063C0();
        if (jn91VarMo36063C0 instanceof jj50) {
            Iterator it = ((jj50) jn91VarMo36063C0).f112923b.iterator();
            while (it.hasNext()) {
                if (m78632c((gd70) it.next(), gh00Var, zw21Var)) {
                    return true;
                }
            }
            return false;
        }
        for (ho91 ho91Var : gd70Var.mo36061A0()) {
            if (!ho91Var.mo48024c() && m78632c(ho91Var.mo48023b(), gh00Var, zw21Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static List m78633d(List list) {
        if (list == null) {
            m78630a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new io91(((bo91) it.next()).mo27380q()));
        }
        return g6f.m43728j1(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m78634e(gd70 gd70Var) {
        if (gd70Var == null) {
            m78630a(27);
            throw null;
        }
        if (!gd70Var.mo36064D0() && (!(gd70Var.mo35108F0() instanceof dhz) || !m78634e(((dhz) gd70Var.mo35108F0()).f49190c))) {
            if (!(gd70Var.mo35108F0() instanceof pkq)) {
                if (m78635f(gd70Var)) {
                    if (!(gd70Var.mo36063C0().mo25169G() instanceof nfe)) {
                        oo91 oo91VarM67458d = oo91.m67458d(gd70Var);
                        Collection<gd70> collectionMo25172f = gd70Var.mo36063C0().mo25172f();
                        ArrayList arrayList = new ArrayList(collectionMo25172f.size());
                        for (gd70 gd70Var2 : collectionMo25172f) {
                            if (gd70Var2 == null) {
                                m78630a(21);
                                throw null;
                            }
                            gd70 gd70VarM67463i = oo91VarM67458d.m67463i(1, gd70Var2);
                            gd70 gd70VarM78637h = gd70VarM67463i != null ? m78637h(gd70VarM67463i, gd70Var.mo36064D0()) : null;
                            if (gd70VarM78637h != null) {
                                arrayList.add(gd70VarM78637h);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (m78634e((gd70) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                jn91 jn91VarMo36063C0 = gd70Var.mo36063C0();
                if (jn91VarMo36063C0 instanceof jj50) {
                    Iterator it2 = ((jj50) jn91VarMo36063C0).f112923b.iterator();
                    while (it2.hasNext()) {
                        if (m78634e((gd70) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m78635f(gd70 gd70Var) {
        if (gd70Var == null) {
            m78630a(60);
            throw null;
        }
        if ((gd70Var.mo36063C0().mo25169G() instanceof bo91 ? (bo91) gd70Var.mo36063C0().mo25169G() : null) != null) {
            return true;
        }
        gd70Var.mo36063C0();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static d6a1 m78636g(gd70 gd70Var, boolean z) {
        if (gd70Var == null) {
            m78630a(3);
            throw null;
        }
        d6a1 d6a1VarMo35109G0 = gd70Var.mo35108F0().mo35109G0(z);
        if (d6a1VarMo35109G0 != null) {
            return d6a1VarMo35109G0;
        }
        m78630a(4);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static gd70 m78637h(gd70 gd70Var, boolean z) {
        if (gd70Var != null) {
            return z ? m78636g(gd70Var, true) : gd70Var;
        }
        m78630a(8);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static jd21 m78638i(jd21 jd21Var, boolean z) {
        if (jd21Var == null) {
            m78630a(5);
            throw null;
        }
        if (!z) {
            return jd21Var;
        }
        jd21 jd21VarMo35109G0 = jd21Var.mo35109G0(true);
        if (jd21VarMo35109G0 != null) {
            return jd21VarMo35109G0;
        }
        m78630a(6);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static to41 m78639j(bo91 bo91Var) {
        if (bo91Var != null) {
            return new to41(bo91Var);
        }
        m78630a(45);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static ho91 m78640k(bo91 bo91Var, be60 be60Var) {
        if (bo91Var != null) {
            return be60Var.f26285a == 1 ? new io91(1, qkf1.m73075C(bo91Var)) : new to41(bo91Var);
        }
        m78630a(46);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m78641l(gd70 gd70Var) {
        if (gd70Var != null) {
            return gd70Var == f211153c || gd70Var == f211154d;
        }
        m78630a(0);
        throw null;
    }
}
