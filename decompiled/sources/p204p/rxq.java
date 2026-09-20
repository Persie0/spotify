package p204p;

import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public abstract class rxq {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f203658a = 0;

    static {
        new y400("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76663a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m76664b(cab cabVar, LinkedHashSet linkedHashSet) {
        if (cabVar == null) {
            m76663a(72);
            throw null;
        }
        if (linkedHashSet.contains(cabVar)) {
            return;
        }
        Iterator it = cabVar.mo27377a().mo32019p().iterator();
        while (it.hasNext()) {
            cab cabVarMo27377a = ((cab) it.next()).mo27377a();
            m76664b(cabVarMo27377a, linkedHashSet);
            linkedHashSet.add(cabVarMo27377a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static mxh0 m76665c(oqo oqoVar) {
        if (oqoVar == null) {
            m76663a(21);
            throw null;
        }
        mxh0 mxh0VarM76666d = m76666d(oqoVar);
        if (mxh0VarM76666d != null) {
            return mxh0VarM76666d;
        }
        m76663a(22);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static mxh0 m76666d(oqo oqoVar) {
        if (oqoVar == null) {
            m76663a(23);
            throw null;
        }
        while (oqoVar != null) {
            if (oqoVar instanceof mxh0) {
                return (mxh0) oqoVar;
            }
            if (oqoVar instanceof v3m0) {
                return ((ex70) ((v3m0) oqoVar)).f63691d;
            }
            oqoVar = oqoVar.mo27379o();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static unq0 m76667e(oqo oqoVar) {
        unq0 unq0Var = unq0.f232223Q0;
        if (oqoVar == null) {
            m76663a(81);
            throw null;
        }
        if (oqoVar instanceof zys0) {
            oqoVar = ((zys0) oqoVar).m60266H1();
        }
        if (oqoVar instanceof qqo) {
            ((qqo) oqoVar).getSource().getClass();
        }
        return unq0Var;
    }

    /* JADX INFO: renamed from: f */
    public static z400 m76668f(oqo oqoVar) {
        if (oqoVar != null) {
            y400 y400VarM76669g = m76669g(oqoVar);
            return y400VarM76669g != null ? y400VarM76669g.f269048a : m76668f(oqoVar.mo27379o()).m95301a(oqoVar.getName());
        }
        m76663a(2);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static y400 m76669g(oqo oqoVar) {
        if (oqoVar == null) {
            m76663a(5);
            throw null;
        }
        if ((oqoVar instanceof mxh0) || ehw.m39009e(oqoVar)) {
            return y400.f269047c;
        }
        if (oqoVar instanceof v3m0) {
            return ((ex70) ((v3m0) oqoVar)).f63692e;
        }
        if (oqoVar instanceof m3m0) {
            return ((n3m0) ((m3m0) oqoVar)).f150085f;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static oqo m76670h(oqo oqoVar, Class cls, boolean z) {
        if (oqoVar == null) {
            return null;
        }
        if (z) {
            oqoVar = oqoVar.mo27379o();
        }
        while (oqoVar != null) {
            if (cls.isInstance(oqoVar)) {
                return oqoVar;
            }
            oqoVar = oqoVar.mo27379o();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static nfe m76671i(nfe nfeVar) {
        if (nfeVar == null) {
            m76663a(44);
            throw null;
        }
        for (gd70 gd70Var : nfeVar.mo27378k().mo25172f()) {
            if (gd70Var == null) {
                m76663a(45);
                throw null;
            }
            jn91 jn91VarMo36063C0 = gd70Var.mo36063C0();
            if (jn91VarMo36063C0 == null) {
                m76663a(46);
                throw null;
            }
            nfe nfeVar2 = (nfe) jn91VarMo36063C0.mo25169G();
            if (nfeVar2 == null) {
                m76663a(47);
                throw null;
            }
            if (nfeVar2.mo30969p0() != 2) {
                return nfeVar2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m76672j(oqo oqoVar) {
        return m76674l(oqoVar, 1) && oqoVar.getName().equals(qx31.f193468a);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m76673k(oqo oqoVar) {
        return m76674l(oqoVar, 6) && ((nfe) oqoVar).mo30961a0();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m76674l(oqo oqoVar, int i) {
        if (i != 0) {
            return (oqoVar instanceof nfe) && ((nfe) oqoVar).mo30969p0() == i;
        }
        m76663a(37);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m76675m(oqo oqoVar) {
        if (oqoVar == null) {
            m76663a(1);
            throw null;
        }
        while (oqoVar != null) {
            if (m76672j(oqoVar) || ((oqoVar instanceof tqo) && ((tqo) oqoVar).mo28470e() == vxq.f245811f)) {
                return true;
            }
            oqoVar = oqoVar.mo27379o();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m76676n(gd70 gd70Var, oqo oqoVar) {
        if (gd70Var == null) {
            m76663a(30);
            throw null;
        }
        if (oqoVar == null) {
            m76663a(31);
            throw null;
        }
        qge qgeVarMo25169G = gd70Var.mo36063C0().mo25169G();
        if (qgeVarMo25169G == null) {
            return false;
        }
        oqo oqoVarMo27377a = qgeVarMo25169G.mo27377a();
        return (oqoVarMo27377a instanceof qge) && (oqoVar instanceof qge) && ((qge) oqoVar).mo27378k().equals(((qge) oqoVarMo27377a).mo27378k());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m76677o(oqo oqoVar) {
        return (m76674l(oqoVar, 1) || m76674l(oqoVar, 2)) && ((nfe) oqoVar).mo28473t() == 2;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m76678p(gd70 gd70Var, oqo oqoVar) {
        if (gd70Var == null) {
            m76663a(32);
            throw null;
        }
        if (oqoVar == null) {
            m76663a(33);
            throw null;
        }
        if (m76676n(gd70Var, oqoVar)) {
            return true;
        }
        Iterator it = gd70Var.mo36063C0().mo25172f().iterator();
        while (it.hasNext()) {
            if (m76678p((gd70) it.next(), oqoVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m76679q(oqo oqoVar) {
        return oqoVar != null && (oqoVar.mo27379o() instanceof m3m0);
    }

    /* JADX INFO: renamed from: r */
    public static eab m76680r(eab eabVar) {
        if (eabVar == null) {
            m76663a(58);
            throw null;
        }
        while (eabVar.mo38278l0() == 2) {
            Collection collectionMo32019p = eabVar.mo32019p();
            if (collectionMo32019p.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + eabVar);
            }
            eabVar = (eab) collectionMo32019p.iterator().next();
        }
        return eabVar;
    }
}
