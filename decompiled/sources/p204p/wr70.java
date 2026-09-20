package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class wr70 extends pqo implements dtm0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f254285d = 0;

    /* JADX INFO: renamed from: e */
    public final oqo f254286e;

    /* JADX INFO: renamed from: f */
    public final rzu0 f254287f;

    public wr70(nfe nfeVar) {
        super(e370.f55667h, qx31.f193471d);
        this.f254286e = nfeVar;
        this.f254287f = new kg40(nfeVar);
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m88805A0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m88806B0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m88807G1(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final rzu0 m88808H1() {
        switch (this.f254285d) {
            case 0:
                kg40 kg40Var = (kg40) this.f254287f;
                if (kg40Var != null) {
                    return kg40Var;
                }
                m88805A0(1);
                throw null;
            default:
                AbstractC1806e9 abstractC1806e9 = (AbstractC1806e9) this.f254287f;
                if (abstractC1806e9 != null) {
                    return abstractC1806e9;
                }
                m88806B0(7);
                throw null;
        }
    }

    @Override // p204p.yu51
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public final wr70 mo29932f(oo91 oo91Var) {
        if (oo91Var == null) {
            m88807G1(3);
            throw null;
        }
        if (!oo91Var.f167518a.mo26562e()) {
            gd70 gd70VarM67463i = mo27379o() instanceof nfe ? oo91Var.m67463i(3, getType()) : oo91Var.m67463i(1, getType());
            if (gd70VarM67463i == null) {
                return null;
            }
            if (gd70VarM67463i != getType()) {
                return new wr70(mo27379o(), new k691(gd70VarM67463i), getAnnotations());
            }
        }
        return this;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: K */
    public final List mo32015K() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m88807G1(7);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: Q */
    public final wr70 mo32017Q() {
        return null;
    }

    @Override // p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final cab mo27377a() {
        return this;
    }

    @Override // p204p.tqo
    /* JADX INFO: renamed from: e */
    public final uxq mo28470e() {
        return vxq.f245811f;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: f0 */
    public final boolean mo28800f0() {
        return false;
    }

    @Override // p204p.qqo
    public final du31 getSource() {
        return du31.f52959o0;
    }

    @Override // p204p.AbstractC1806e9, p204p.rzu0
    public final gd70 getType() {
        gd70 type = m88808H1().getType();
        if (type != null) {
            return type;
        }
        m88807G1(6);
        throw null;
    }

    @Override // p204p.cab
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m88807G1(5);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: i */
    public final gd70 mo29933i() {
        return getType();
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: o */
    public final oqo mo27379o() {
        switch (this.f254285d) {
            case 0:
                nfe nfeVar = (nfe) this.f254286e;
                if (nfeVar != null) {
                    return nfeVar;
                }
                m88805A0(2);
                throw null;
            default:
                oqo oqoVar = this.f254286e;
                if (oqoVar != null) {
                    return oqoVar;
                }
                m88806B0(8);
                throw null;
        }
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: p */
    public final Collection mo32019p() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m88807G1(8);
        throw null;
    }

    @Override // p204p.pqo, p204p.AbstractC1806e9
    public String toString() {
        switch (this.f254285d) {
            case 0:
                return "class " + ((nfe) this.f254286e).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28184h(this, obj);
    }

    @Override // p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final oqo mo27377a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wr70(oqo oqoVar, AbstractC1806e9 abstractC1806e9, l25 l25Var) {
        this(oqoVar, abstractC1806e9, l25Var, qx31.f193471d);
        if (oqoVar == null) {
            m88806B0(0);
            throw null;
        }
        if (l25Var != null) {
        } else {
            m88806B0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr70(oqo oqoVar, AbstractC1806e9 abstractC1806e9, l25 l25Var, qti0 qti0Var) {
        super(l25Var, qti0Var);
        if (oqoVar == null) {
            m88806B0(3);
            throw null;
        }
        if (l25Var == null) {
            m88806B0(5);
            throw null;
        }
        if (qti0Var != null) {
            this.f254286e = oqoVar;
            this.f254287f = abstractC1806e9;
            return;
        }
        m88806B0(6);
        throw null;
    }
}
