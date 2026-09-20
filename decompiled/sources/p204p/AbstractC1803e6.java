package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: p.e6 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1803e6 extends kxh0 {

    /* JADX INFO: renamed from: a */
    public final qti0 f56500a;

    /* JADX INFO: renamed from: b */
    public final yma0 f56501b;

    /* JADX INFO: renamed from: c */
    public final yma0 f56502c;

    /* JADX INFO: renamed from: d */
    public final yma0 f56503d;

    public AbstractC1803e6(y751 y751Var, qti0 qti0Var) {
        if (y751Var == null) {
            m37840u0(0);
            throw null;
        }
        if (qti0Var == null) {
            m37840u0(1);
            throw null;
        }
        this.f56500a = qti0Var;
        bna0 bna0Var = (bna0) y751Var;
        this.f56501b = new yma0(bna0Var, new C1767d6(this, 0));
        this.f56502c = new yma0(bna0Var, new C1767d6(this, 1));
        this.f56503d = new yma0(bna0Var, new C1767d6(this, 2));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m37840u0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: D */
    public final bfe0 mo30955D(mo91 mo91Var) {
        txq.m81935h(rxq.m76665c(this));
        bfe0 bfe0VarMo30965j = mo30965j(mo91Var, ld70.f132087c);
        if (bfe0VarMo30965j != null) {
            return bfe0VarMo30965j;
        }
        m37840u0(16);
        throw null;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: T */
    public bfe0 mo30957T() {
        bfe0 bfe0Var = (bfe0) this.f56502c.invoke();
        if (bfe0Var != null) {
            return bfe0Var;
        }
        m37840u0(4);
        throw null;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: W */
    public bfe0 mo30959W() {
        txq.m81935h(rxq.m76665c(this));
        bfe0 bfe0VarMo30966j0 = mo30966j0(ld70.f132087c);
        if (bfe0VarMo30966j0 != null) {
            return bfe0VarMo30966j0;
        }
        m37840u0(17);
        throw null;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: Y */
    public List mo30960Y() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m37840u0(6);
        throw null;
    }

    @Override // p204p.kxh0, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final qge mo27377a() {
        return this;
    }

    @Override // p204p.oqo
    public final qti0 getName() {
        qti0 qti0Var = this.f56500a;
        if (qti0Var != null) {
            return qti0Var;
        }
        m37840u0(2);
        throw null;
    }

    @Override // p204p.kxh0
    /* JADX INFO: renamed from: j */
    public bfe0 mo30965j(mo91 mo91Var, ld70 ld70Var) {
        if (!mo91Var.mo26562e()) {
            return new bv51(mo30966j0(ld70Var), new oo91(mo91Var));
        }
        bfe0 bfe0VarMo30966j0 = mo30966j0(ld70Var);
        if (bfe0VarMo30966j0 != null) {
            return bfe0VarMo30966j0;
        }
        m37840u0(12);
        throw null;
    }

    @Override // p204p.nfe, p204p.qge
    /* JADX INFO: renamed from: q */
    public final jd21 mo27380q() {
        jd21 jd21Var = (jd21) this.f56501b.invoke();
        if (jd21Var != null) {
            return jd21Var;
        }
        m37840u0(20);
        throw null;
    }

    @Override // p204p.yu51
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public nfe mo29932f(oo91 oo91Var) {
        if (oo91Var != null) {
            return oo91Var.f167518a.mo26562e() ? this : new bz70(this, oo91Var);
        }
        m37840u0(18);
        throw null;
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28182e(this, obj);
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: z0 */
    public final wr70 mo30974z0() {
        wr70 wr70Var = (wr70) this.f56503d.invoke();
        if (wr70Var != null) {
            return wr70Var;
        }
        m37840u0(5);
        throw null;
    }

    @Override // p204p.kxh0, p204p.nfe, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final oqo mo27377a() {
        return this;
    }

    @Override // p204p.kxh0, p204p.nfe, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final nfe mo27377a() {
        return this;
    }
}
