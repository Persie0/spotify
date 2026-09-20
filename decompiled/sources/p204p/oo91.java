package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class oo91 implements po91 {

    /* JADX INFO: renamed from: b */
    public static final oo91 f167517b = new oo91(mo91.f145632a);

    /* JADX INFO: renamed from: a */
    public final mo91 f167518a;

    public oo91(mo91 mo91Var) {
        this.f167518a = mo91Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m67455a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
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
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
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
    public static int m67456b(int i, int i2) {
        if (i == 0) {
            m67455a(38);
            throw null;
        }
        if (i2 == 0) {
            m67455a(39);
            throw null;
        }
        if (i == 1) {
            if (i2 == 0) {
                m67455a(40);
                throw null;
            }
        } else {
            if (i2 == 1) {
                if (i != 0) {
                    return i;
                }
                m67455a(41);
                throw null;
            }
            if (i != i2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + xl81.m91412u(i) + "' and projection kind '" + xl81.m91412u(i2) + "' cannot be combined");
            }
            if (i2 == 0) {
                m67455a(42);
                throw null;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m67457c(int i, int i2) {
        if (i == 2 && i2 == 3) {
            return 3;
        }
        return (i == 3 && i2 == 2) ? 2 : 1;
    }

    /* JADX INFO: renamed from: d */
    public static oo91 m67458d(gd70 gd70Var) {
        if (gd70Var == null) {
            m67455a(6);
            throw null;
        }
        return new oo91(ln91.f135123b.m82747m(gd70Var.mo36063C0(), gd70Var.mo36061A0()));
    }

    /* JADX INFO: renamed from: e */
    public static oo91 m67459e(mo91 mo91Var, mo91 mo91Var2) {
        if (mo91Var == null) {
            m67455a(3);
            throw null;
        }
        if (mo91Var2 == null) {
            m67455a(4);
            throw null;
        }
        if (mo91Var.mo26562e()) {
            mo91Var = mo91Var2;
        } else if (!mo91Var2.mo26562e()) {
            mo91Var = new gqr(mo91Var, mo91Var2);
        }
        return new oo91(mo91Var);
    }

    /* JADX INFO: renamed from: h */
    public static String m67460h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (o2h1.m66117k(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* JADX INFO: renamed from: f */
    public final mo91 m67461f() {
        mo91 mo91Var = this.f167518a;
        if (mo91Var != null) {
            return mo91Var;
        }
        m67455a(8);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final gd70 m67462g(int i, gd70 gd70Var) {
        if (gd70Var == null) {
            m67455a(9);
            throw null;
        }
        if (i == 0) {
            m67455a(10);
            throw null;
        }
        if (this.f167518a.mo26562e()) {
            return gd70Var;
        }
        try {
            gd70 gd70VarMo48023b = m67464j(new io91(i, gd70Var), null, 0).mo48023b();
            if (gd70VarMo48023b != null) {
                return gd70VarMo48023b;
            }
            m67455a(12);
            throw null;
        } catch (no91 e) {
            return ehw.m39006b(chw.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public final gd70 m67463i(int i, gd70 gd70Var) {
        if (gd70Var == null) {
            m67455a(14);
            throw null;
        }
        if (i == 0) {
            m67455a(15);
            throw null;
        }
        ho91 io91Var = new io91(i, m67461f().mo45447f(i, gd70Var));
        mo91 mo91Var = this.f167518a;
        if (!mo91Var.mo26562e()) {
            try {
                io91Var = m67464j(io91Var, null, 0);
            } catch (no91 unused) {
                io91Var = null;
            }
        }
        if (mo91Var.mo45445a() || mo91Var.mo26560b()) {
            boolean zMo26560b = mo91Var.mo26560b();
            if (io91Var == null) {
                io91Var = null;
            } else if (!io91Var.mo48024c()) {
                gd70 gd70VarMo48023b = io91Var.mo48023b();
                if (so91.m78632c(gd70VarMo48023b, a53.f12397Z, null)) {
                    int iMo48022a = io91Var.mo48022a();
                    if (iMo48022a == 3) {
                        io91Var = new io91(iMo48022a, (gd70) rkk.m75760l(gd70VarMo48023b).f220332b);
                    } else if (zMo26560b) {
                        io91Var = new io91(iMo48022a, (gd70) rkk.m75760l(gd70VarMo48023b).f220331a);
                    } else {
                        uwb uwbVar = new uwb();
                        oo91 oo91Var = new oo91(uwbVar);
                        if (!uwbVar.mo26562e()) {
                            try {
                                io91Var = oo91Var.m67464j(io91Var, null, 0);
                            } catch (no91 unused2) {
                                io91Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (io91Var == null) {
            return null;
        }
        return io91Var.mo48023b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:105:0x020e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0216  */
    /* JADX WARN: Code duplicated, block: B:108:0x0219  */
    /* JADX WARN: Code duplicated, block: B:110:0x021c  */
    /* JADX WARN: Code duplicated, block: B:111:0x021f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0222  */
    /* JADX WARN: Code duplicated, block: B:115:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x022e  */
    /* JADX WARN: Code duplicated, block: B:119:0x023d  */
    /* JADX WARN: Code duplicated, block: B:124:0x025e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0282  */
    /* JADX WARN: Code duplicated, block: B:128:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0289  */
    /* JADX WARN: Code duplicated, block: B:134:0x0290  */
    /* JADX WARN: Code duplicated, block: B:140:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:89:0x01af  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public final ho91 m67464j(ho91 ho91Var, bo91 bo91Var, int i) throws no91 {
        gd70 gd70VarMo48023b;
        int iMo48022a;
        d6a1 d6a1VarMo35108F0;
        C2554x c2554x;
        jd21 jd21Var;
        List listMo25171e;
        List listMo36061A0;
        ArrayList arrayList;
        boolean z;
        gd70 gd70VarM53282u;
        bo91 bo91Var2;
        ho91 ho91Var2;
        ho91 ho91VarM67464j;
        int iM38547C;
        char c;
        int iMo27374C;
        boolean z2;
        oo91 oo91Var;
        ao40 ao40Var;
        int iM67457c;
        kd70 kd70VarMo35108F0;
        ccm ccmVar;
        gd70 gd70VarM78637h;
        l25 l25VarMo45446c;
        int iM38547C2;
        gd70 gd70VarM67463i = null;
        if (ho91Var == null) {
            m67455a(18);
            throw null;
        }
        mo91 mo91Var = this.f167518a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m67460h(ho91Var) + "; substitution: " + m67460h(mo91Var));
        }
        if (!ho91Var.mo48024c()) {
            gd70 gd70VarMo48023b2 = ho91Var.mo48023b();
            if (gd70VarMo48023b2 instanceof to91) {
                to91 to91Var = (to91) gd70VarMo48023b2;
                d6a1 d6a1VarMo47616x0 = to91Var.mo47616x0();
                gd70 gd70VarMo47615j = to91Var.mo47615j();
                ho91 ho91VarM67464j2 = m67464j(new io91(ho91Var.mo48022a(), d6a1VarMo47616x0), bo91Var, i + 1);
                return ho91VarM67464j2.mo48024c() ? ho91VarM67464j2 : new io91(ho91VarM67464j2.mo48022a(), el51.m39348r(ho91VarM67464j2.mo48023b().mo35108F0(), m67463i(ho91Var.mo48022a(), gd70VarMo47615j)));
            }
            gd70VarMo48023b2.mo35108F0();
            if (!(gd70VarMo48023b2.mo35108F0() instanceof tbu0)) {
                ho91 ho91VarMo26561d = mo91Var.mo26561d(gd70VarMo48023b2);
                if (ho91VarMo26561d == null) {
                    ho91VarMo26561d = null;
                } else if (gd70VarMo48023b2.getAnnotations().mo55149r0(qm41.f190124y)) {
                    jn91 jn91VarMo36063C0 = ho91VarMo26561d.mo48023b().mo36063C0();
                    if (jn91VarMo36063C0 instanceof lij0) {
                        ho91 ho91Var3 = ((lij0) jn91VarMo36063C0).f133804a;
                        int iMo48022a2 = ho91Var3.mo48022a();
                        if (m67457c(ho91Var.mo48022a(), iMo48022a2) == 3) {
                            ho91VarMo26561d = new io91(ho91Var3.mo48023b());
                        } else if (bo91Var != null && m67457c(bo91Var.mo27374C(), iMo48022a2) == 3) {
                            ho91VarMo26561d = new io91(ho91Var3.mo48023b());
                        }
                    }
                }
                int iMo48022a3 = ho91Var.mo48022a();
                if (ho91VarMo26561d == null && (gd70VarMo48023b2.mo35108F0() instanceof dhz)) {
                    kd70 kd70VarMo35108F1 = gd70VarMo48023b2.mo35108F0();
                    ccm ccmVar2 = kd70VarMo35108F1 instanceof ccm ? (ccm) kd70VarMo35108F1 : null;
                    if (!(ccmVar2 != null ? ccmVar2.mo32277u0() : false)) {
                        dhz dhzVar = (dhz) gd70VarMo48023b2.mo35108F0();
                        jd21 jd21Var2 = dhzVar.f49190c;
                        jd21 jd21Var3 = dhzVar.f49189b;
                        int i2 = i + 1;
                        ho91 ho91VarM67464j3 = m67464j(new io91(iMo48022a3, jd21Var3), bo91Var, i2);
                        ho91 ho91VarM67464j4 = m67464j(new io91(iMo48022a3, jd21Var2), bo91Var, i2);
                        int iMo48022a4 = ho91VarM67464j3.mo48022a();
                        if (ho91VarM67464j3.mo48023b() != jd21Var3 || ho91VarM67464j4.mo48023b() != jd21Var2) {
                            return new io91(iMo48022a4, pug1.m71080k(jg31.m53267e(ho91VarM67464j3.mo48023b()), jg31.m53267e(ho91VarM67464j4.mo48023b())));
                        }
                    } else if (!ib70.m50138F(gd70VarMo48023b2)) {
                        if (ho91VarMo26561d != null) {
                            iM67457c = m67457c(iMo48022a3, ho91VarMo26561d.mo48022a());
                            if (!(gd70VarMo48023b2.mo36063C0() instanceof vwb)) {
                                iM38547C2 = edb.m38547C(iM67457c);
                                if (iM38547C2 != 1) {
                                    return new io91(3, gd70VarMo48023b2.mo36063C0().mo25173g().m50163p());
                                }
                                if (iM38547C2 == 2) {
                                    throw new no91("Out-projection in in-position");
                                }
                            }
                            kd70VarMo35108F0 = gd70VarMo48023b2.mo35108F0();
                            if (kd70VarMo35108F0 instanceof ccm) {
                                ccmVar = (ccm) kd70VarMo35108F0;
                            } else {
                                ccmVar = null;
                            }
                            if (ccmVar != null) {
                                ccmVar = null;
                            } else {
                                ccmVar = null;
                            }
                            if (ho91VarMo26561d.mo48024c()) {
                                return ho91VarMo26561d;
                            }
                            if (ccmVar != null) {
                                gd70VarM78637h = ccmVar.mo32276j0(ho91VarMo26561d.mo48023b());
                            } else {
                                gd70VarM78637h = so91.m78637h(ho91VarMo26561d.mo48023b(), gd70VarMo48023b2.mo36064D0());
                            }
                            if (!gd70VarMo48023b2.getAnnotations().isEmpty()) {
                                l25VarMo45446c = mo91Var.mo45446c(gd70VarMo48023b2.getAnnotations());
                                if (l25VarMo45446c != null) {
                                    m67455a(33);
                                    throw null;
                                }
                                if (l25VarMo45446c.mo55149r0(qm41.f190124y)) {
                                    l25VarMo45446c = new y6z(l25VarMo45446c, new b321(5));
                                }
                                gd70VarM78637h = tw41.m81643q(gd70VarM78637h, new n25(new l25[]{gd70VarM78637h.getAnnotations(), l25VarMo45446c}));
                            }
                            if (iM67457c == 1) {
                                iMo48022a3 = m67456b(iMo48022a3, ho91VarMo26561d.mo48022a());
                            }
                            return new io91(iMo48022a3, gd70VarM78637h);
                        }
                        gd70VarMo48023b = ho91Var.mo48023b();
                        iMo48022a = ho91Var.mo48022a();
                        if (!(gd70VarMo48023b.mo36063C0().mo25169G() instanceof bo91)) {
                            d6a1VarMo35108F0 = gd70VarMo48023b.mo35108F0();
                            if (d6a1VarMo35108F0 instanceof C2554x) {
                                c2554x = (C2554x) d6a1VarMo35108F0;
                            } else {
                                c2554x = null;
                            }
                            if (c2554x != null) {
                                jd21Var = c2554x.f256713c;
                            } else {
                                jd21Var = null;
                            }
                            if (jd21Var != null) {
                                if (mo91Var instanceof ao40) {
                                    ao40Var = (ao40) mo91Var;
                                    if (ao40Var.f17562d) {
                                        oo91Var = new oo91(new ao40(ao40Var.f17560b, ao40Var.f17561c, false));
                                    } else {
                                        oo91Var = this;
                                    }
                                } else {
                                    oo91Var = this;
                                }
                                gd70VarM67463i = oo91Var.m67463i(1, jd21Var);
                            }
                            listMo25171e = gd70VarMo48023b.mo36063C0().mo25171e();
                            listMo36061A0 = gd70VarMo48023b.mo36061A0();
                            arrayList = new ArrayList(listMo25171e.size());
                            z = false;
                            for (int i3 = 0; i3 < listMo25171e.size(); i3++) {
                                bo91Var2 = (bo91) listMo25171e.get(i3);
                                ho91Var2 = (ho91) listMo36061A0.get(i3);
                                ho91VarM67464j = m67464j(ho91Var2, bo91Var2, i + 1);
                                iM38547C = edb.m38547C(m67457c(bo91Var2.mo27374C(), ho91VarM67464j.mo48022a()));
                                if (iM38547C != 0) {
                                    if (iM38547C != 1) {
                                        c = 2;
                                        if (iM38547C == 2) {
                                        }
                                        z2 = true;
                                    } else {
                                        c = 2;
                                    }
                                    ho91VarM67464j = so91.m78639j(bo91Var2);
                                    z2 = true;
                                } else {
                                    c = 2;
                                    iMo27374C = bo91Var2.mo27374C();
                                    z2 = true;
                                    if (iMo27374C != 1) {
                                        ho91VarM67464j = new io91(1, ho91VarM67464j.mo48023b());
                                    }
                                }
                                if (ho91VarM67464j != ho91Var2) {
                                    z = z2;
                                }
                                arrayList.add(ho91VarM67464j);
                            }
                            if (z) {
                                listMo36061A0 = arrayList;
                            }
                            gd70VarM53282u = jg31.m53282u(gd70VarMo48023b, listMo36061A0, mo91Var.mo45446c(gd70VarMo48023b.getAnnotations()), 4);
                            if (gd70VarM53282u instanceof jd21) {
                                gd70VarM53282u = frz0.m42536u((jd21) gd70VarM53282u, (jd21) gd70VarM67463i);
                            }
                            return new io91(iMo48022a, gd70VarM53282u);
                        }
                    }
                } else if (!ib70.m50138F(gd70VarMo48023b2) && !qug1.m73946p(gd70VarMo48023b2)) {
                    if (ho91VarMo26561d != null) {
                        iM67457c = m67457c(iMo48022a3, ho91VarMo26561d.mo48022a());
                        if (!(gd70VarMo48023b2.mo36063C0() instanceof vwb)) {
                            iM38547C2 = edb.m38547C(iM67457c);
                            if (iM38547C2 != 1) {
                                return new io91(3, gd70VarMo48023b2.mo36063C0().mo25173g().m50163p());
                            }
                            if (iM38547C2 == 2) {
                                throw new no91("Out-projection in in-position");
                            }
                        }
                        kd70VarMo35108F0 = gd70VarMo48023b2.mo35108F0();
                        if (kd70VarMo35108F0 instanceof ccm) {
                            ccmVar = (ccm) kd70VarMo35108F0;
                        } else {
                            ccmVar = null;
                        }
                        if (ccmVar != null || !ccmVar.mo32277u0()) {
                            ccmVar = null;
                        }
                        if (ho91VarMo26561d.mo48024c()) {
                            return ho91VarMo26561d;
                        }
                        if (ccmVar != null) {
                            gd70VarM78637h = ccmVar.mo32276j0(ho91VarMo26561d.mo48023b());
                        } else {
                            gd70VarM78637h = so91.m78637h(ho91VarMo26561d.mo48023b(), gd70VarMo48023b2.mo36064D0());
                        }
                        if (!gd70VarMo48023b2.getAnnotations().isEmpty()) {
                            l25VarMo45446c = mo91Var.mo45446c(gd70VarMo48023b2.getAnnotations());
                            if (l25VarMo45446c != null) {
                                m67455a(33);
                                throw null;
                            }
                            if (l25VarMo45446c.mo55149r0(qm41.f190124y)) {
                                l25VarMo45446c = new y6z(l25VarMo45446c, new b321(5));
                            }
                            gd70VarM78637h = tw41.m81643q(gd70VarM78637h, new n25(new l25[]{gd70VarM78637h.getAnnotations(), l25VarMo45446c}));
                        }
                        if (iM67457c == 1) {
                            iMo48022a3 = m67456b(iMo48022a3, ho91VarMo26561d.mo48022a());
                        }
                        return new io91(iMo48022a3, gd70VarM78637h);
                    }
                    gd70VarMo48023b = ho91Var.mo48023b();
                    iMo48022a = ho91Var.mo48022a();
                    if (!(gd70VarMo48023b.mo36063C0().mo25169G() instanceof bo91)) {
                        d6a1VarMo35108F0 = gd70VarMo48023b.mo35108F0();
                        if (d6a1VarMo35108F0 instanceof C2554x) {
                            c2554x = (C2554x) d6a1VarMo35108F0;
                        } else {
                            c2554x = null;
                        }
                        if (c2554x != null) {
                            jd21Var = c2554x.f256713c;
                        } else {
                            jd21Var = null;
                        }
                        if (jd21Var != null) {
                            if (mo91Var instanceof ao40) {
                                ao40Var = (ao40) mo91Var;
                                if (ao40Var.f17562d) {
                                    oo91Var = this;
                                } else {
                                    oo91Var = new oo91(new ao40(ao40Var.f17560b, ao40Var.f17561c, false));
                                }
                            } else {
                                oo91Var = this;
                            }
                            gd70VarM67463i = oo91Var.m67463i(1, jd21Var);
                        }
                        listMo25171e = gd70VarMo48023b.mo36063C0().mo25171e();
                        listMo36061A0 = gd70VarMo48023b.mo36061A0();
                        arrayList = new ArrayList(listMo25171e.size());
                        z = false;
                        while (i3 < listMo25171e.size()) {
                            bo91Var2 = (bo91) listMo25171e.get(i3);
                            ho91Var2 = (ho91) listMo36061A0.get(i3);
                            ho91VarM67464j = m67464j(ho91Var2, bo91Var2, i + 1);
                            iM38547C = edb.m38547C(m67457c(bo91Var2.mo27374C(), ho91VarM67464j.mo48022a()));
                            if (iM38547C != 0) {
                                if (iM38547C != 1) {
                                    c = 2;
                                    if (iM38547C == 2) {
                                    }
                                    z2 = true;
                                } else {
                                    c = 2;
                                }
                                ho91VarM67464j = so91.m78639j(bo91Var2);
                                z2 = true;
                            } else {
                                c = 2;
                                iMo27374C = bo91Var2.mo27374C();
                                z2 = true;
                                if (iMo27374C != 1 && !ho91VarM67464j.mo48024c()) {
                                    ho91VarM67464j = new io91(1, ho91VarM67464j.mo48023b());
                                }
                            }
                            if (ho91VarM67464j != ho91Var2) {
                                z = z2;
                            }
                            arrayList.add(ho91VarM67464j);
                        }
                        if (z) {
                            listMo36061A0 = arrayList;
                        }
                        gd70VarM53282u = jg31.m53282u(gd70VarMo48023b, listMo36061A0, mo91Var.mo45446c(gd70VarMo48023b.getAnnotations()), 4);
                        if ((gd70VarM53282u instanceof jd21) && (gd70VarM67463i instanceof jd21)) {
                            gd70VarM53282u = frz0.m42536u((jd21) gd70VarM53282u, (jd21) gd70VarM67463i);
                        }
                        return new io91(iMo48022a, gd70VarM53282u);
                    }
                }
            }
        }
        return ho91Var;
    }
}
