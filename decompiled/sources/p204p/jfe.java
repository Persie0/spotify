package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class jfe extends pi00 implements k8j {

    /* JADX INFO: renamed from: c1 */
    public final boolean f111881c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfe(nfe nfeVar, k8j k8jVar, l25 l25Var, boolean z, int i, du31 du31Var) {
        super(i, l25Var, nfeVar, k8jVar, qx31.f193472e, du31Var);
        if (nfeVar == null) {
            m53169A0(0);
            throw null;
        }
        if (l25Var == null) {
            m53169A0(1);
            throw null;
        }
        if (i == 0) {
            m53169A0(2);
            throw null;
        }
        if (du31Var == null) {
            m53169A0(3);
            throw null;
        }
        this.f111881c1 = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m53169A0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
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
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.pi00
    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] */
    public jfe mo28795J1(int i, l25 l25Var, oqo oqoVar, mi00 mi00Var, qti0 qti0Var, du31 du31Var) {
        if (oqoVar == null) {
            m53169A0(23);
            throw null;
        }
        if (i == 0) {
            m53169A0(24);
            throw null;
        }
        if (l25Var == null) {
            m53169A0(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new jfe((nfe) oqoVar, this, l25Var, this.f111881c1, 1, du31Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + oqoVar + "\nkind: " + m6b.m61002q(i));
    }

    /* JADX INFO: renamed from: T1 */
    public final nfe m53170T1() {
        nfe nfeVarMo27379o = mo27379o();
        if (nfeVarMo27379o != null) {
            return nfeVarMo27379o;
        }
        m53169A0(18);
        throw null;
    }

    @Override // p204p.rqo, p204p.oqo
    /* JADX INFO: renamed from: U1, reason: merged with bridge method [inline-methods] */
    public final nfe mo27379o() {
        nfe nfeVar = (nfe) super.mo27379o();
        if (nfeVar != null) {
            return nfeVar;
        }
        m53169A0(17);
        throw null;
    }

    @Override // p204p.rqo, p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: V1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final jfe mo27377a() {
        jfe jfeVar = (jfe) super.mo27377a();
        if (jfeVar != null) {
            return jfeVar;
        }
        m53169A0(19);
        throw null;
    }

    /* JADX INFO: renamed from: W1 */
    public final void m53173W1(List list, uxq uxqVar) {
        if (list != null) {
            m53174X1(list, uxqVar, mo27379o().mo30970r());
        } else {
            m53169A0(13);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: X1 */
    public final void m53174X1(List list, uxq uxqVar, List list2) {
        wr70 wr70VarMo30974z0;
        List listMo30960Y;
        if (list == null) {
            m53169A0(10);
            throw null;
        }
        if (list2 == null) {
            m53169A0(12);
            throw null;
        }
        nfe nfeVarMo27379o = mo27379o();
        if (nfeVarMo27379o.mo30968n()) {
            oqo oqoVarMo27379o = nfeVarMo27379o.mo27379o();
            if (oqoVarMo27379o instanceof nfe) {
                wr70VarMo30974z0 = ((nfe) oqoVarMo27379o).mo30974z0();
            } else {
                wr70VarMo30974z0 = null;
            }
        } else {
            wr70VarMo30974z0 = null;
        }
        nfe nfeVarMo27379o2 = mo27379o();
        if (nfeVarMo27379o2.mo30960Y().isEmpty()) {
            listMo30960Y = Collections.EMPTY_LIST;
            if (listMo30960Y == null) {
                m53169A0(16);
                throw null;
            }
        } else {
            listMo30960Y = nfeVarMo27379o2.mo30960Y();
            if (listMo30960Y == null) {
                m53169A0(15);
                throw null;
            }
        }
        mo70062M1(null, wr70VarMo30974z0, listMo30960Y, list2, list, null, 1, uxqVar);
    }

    @Override // p204p.pi00, p204p.yu51
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public final jfe mo29932f(oo91 oo91Var) {
        if (oo91Var != null) {
            return (jfe) super.mo29932f(oo91Var);
        }
        m53169A0(20);
        throw null;
    }

    @Override // p204p.k8j
    /* JADX INFO: renamed from: c0 */
    public final boolean mo29931c0() {
        return this.f111881c1;
    }

    @Override // p204p.pi00, p204p.eab
    /* JADX INFO: renamed from: o0 */
    public final eab mo29934o0(nfe nfeVar, int i, uxq uxqVar) {
        return (jfe) m70059H1(nfeVar, i, uxqVar);
    }

    @Override // p204p.pi00, p204p.eab, p204p.cab
    /* JADX INFO: renamed from: p */
    public final Collection mo32019p() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m53169A0(21);
        throw null;
    }

    @Override // p204p.pi00, p204p.eab
    /* JADX INFO: renamed from: t0 */
    public final void mo38279t0(Collection collection) {
        if (collection != null) {
            return;
        }
        m53169A0(22);
        throw null;
    }

    @Override // p204p.pi00, p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28191o(this, obj);
    }
}
