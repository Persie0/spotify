package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class nd60 extends qc21 implements ad60 {

    /* JADX INFO: renamed from: e1 */
    public static final hyq f152689e1 = new hyq();

    /* JADX INFO: renamed from: f1 */
    public static final hyq f152690f1 = new hyq();

    /* JADX INFO: renamed from: c1 */
    public int f152691c1;

    /* JADX INFO: renamed from: d1 */
    public final boolean f152692d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd60(oqo oqoVar, qc21 qc21Var, l25 l25Var, qti0 qti0Var, int i, du31 du31Var, boolean z) {
        super(oqoVar, qc21Var, l25Var, qti0Var, i, du31Var);
        if (oqoVar == null) {
            m64194A0(0);
            throw null;
        }
        if (l25Var == null) {
            m64194A0(1);
            throw null;
        }
        if (qti0Var == null) {
            m64194A0(2);
            throw null;
        }
        if (i == 0) {
            m64194A0(3);
            throw null;
        }
        this.f152691c1 = 0;
        this.f152692d1 = z;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m64194A0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: W1 */
    public static nd60 m64195W1(oqo oqoVar, kt70 kt70Var, qti0 qti0Var, kvx0 kvx0Var, boolean z) {
        if (oqoVar == null) {
            m64194A0(5);
            throw null;
        }
        if (qti0Var != null) {
            return new nd60(oqoVar, null, kt70Var, qti0Var, 1, kvx0Var, z);
        }
        m64194A0(7);
        throw null;
    }

    @Override // p204p.qc21, p204p.pi00
    /* JADX INFO: renamed from: J1 */
    public final pi00 mo28795J1(int i, l25 l25Var, oqo oqoVar, mi00 mi00Var, qti0 qti0Var, du31 du31Var) {
        if (oqoVar == null) {
            m64194A0(14);
            throw null;
        }
        if (i == 0) {
            m64194A0(15);
            throw null;
        }
        if (l25Var == null) {
            m64194A0(16);
            throw null;
        }
        qc21 qc21Var = (qc21) mi00Var;
        if (qti0Var == null) {
            qti0Var = getName();
        }
        nd60 nd60Var = new nd60(oqoVar, qc21Var, l25Var, qti0Var, i, du31Var, this.f152692d1);
        int i2 = this.f152691c1;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        nd60Var.m64197X1(z, oq40.m67587f(i2));
        return nd60Var;
    }

    @Override // p204p.qc21
    /* JADX INFO: renamed from: V1 */
    public final qc21 mo64196V1(wr70 wr70Var, wr70 wr70Var2, List list, List list2, List list3, gd70 gd70Var, int i, uxq uxqVar, Map map) {
        iyd iydVar;
        if (list == null) {
            m64194A0(9);
            throw null;
        }
        if (list2 == null) {
            m64194A0(10);
            throw null;
        }
        if (list3 == null) {
            m64194A0(11);
            throw null;
        }
        if (uxqVar == null) {
            m64194A0(12);
            throw null;
        }
        super.mo64196V1(wr70Var, wr70Var2, list, list2, list3, gd70Var, i, uxqVar, map);
        for (e2e e2eVar : irl0.f105011c) {
            urv0 urv0Var = e2eVar.f55438b;
            qti0 qti0Var = e2eVar.f55437a;
            if (qti0Var == null || wj50.m88271j(getName(), qti0Var)) {
                if (urv0Var == null || urv0Var.m83873e(getName().m73844b())) {
                    Collection collection = e2eVar.f55439c;
                    if (collection == null || collection.contains(getName())) {
                        for (xxd xxdVar : e2eVar.f55441e) {
                            if (xxdVar.mo28861b(this) != null) {
                                iydVar = new iyd(false);
                                this.f177780L0 = iydVar.f117380a;
                                return this;
                            }
                        }
                        iydVar = ((String) e2eVar.f55440d.invoke(this)) != null ? new iyd(false) : iyd.f106955c;
                        this.f177780L0 = iydVar.f117380a;
                        return this;
                    }
                }
            }
        }
        iydVar = iyd.f106954b;
        this.f177780L0 = iydVar.f117380a;
        return this;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m64197X1(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.f152691c1 = i;
    }

    @Override // p204p.pi00, p204p.cab
    /* JADX INFO: renamed from: f0 */
    public final boolean mo28800f0() {
        return oq40.m67587f(this.f152691c1);
    }

    @Override // p204p.ad60
    /* JADX INFO: renamed from: z */
    public final ad60 mo25521z(gd70 gd70Var, ArrayList arrayList, gd70 gd70Var2, pqm0 pqm0Var) {
        ArrayList arrayListM93272i = ybg1.m93272i(arrayList, mo32015K(), this);
        wr70 wr70VarM42119J = gd70Var == null ? null : fmg1.m42119J(this, gd70Var, e370.f55667h);
        oi00 oi00VarM70063N1 = m70063N1(oo91.f167517b);
        oi00VarM70063N1.f165618g = arrayListM93272i;
        oi00VarM70063N1.f165609X = gd70Var2;
        oi00VarM70063N1.f165620i = wr70VarM42119J;
        oi00VarM70063N1.f165600N0 = true;
        oi00VarM70063N1.f165599M0 = true;
        nd60 nd60Var = (nd60) oi00VarM70063N1.f165608V0.mo70061K1(oi00VarM70063N1);
        if (pqm0Var != null) {
            nd60Var.m70064O1((hyq) pqm0Var.f180350a, pqm0Var.f180351b);
        }
        if (nd60Var != null) {
            return nd60Var;
        }
        m64194A0(21);
        throw null;
    }
}
