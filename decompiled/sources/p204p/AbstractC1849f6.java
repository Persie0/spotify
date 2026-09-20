package p204p;

/* JADX INFO: renamed from: p.f6 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1849f6 extends AbstractC1734ca {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1849f6(y751 y751Var) {
        super(y751Var);
        if (y751Var != null) {
        } else {
            m40790j(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m40790j(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.AbstractC1734ca
    /* JADX INFO: renamed from: b */
    public final gd70 mo31979b() {
        if (ib70.m50140H(mo25169G())) {
            return null;
        }
        return mo25173g().m50153f();
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: g */
    public final ib70 mo25173g() {
        ib70 ib70VarM81932e = txq.m81932e(mo25169G());
        if (ib70VarM81932e != null) {
            return ib70VarM81932e;
        }
        m40790j(1);
        throw null;
    }

    @Override // p204p.AbstractC1734ca
    /* JADX INFO: renamed from: h */
    public final boolean mo31982h(qge qgeVar) {
        boolean z;
        if (qgeVar instanceof nfe) {
            nfe nfeVarMo25169G = mo25169G();
            if (!wj50.m88271j(nfeVarMo25169G.getName(), qgeVar.getName())) {
                z = false;
                break;
            }
            oqo oqoVarMo27379o = nfeVarMo25169G.mo27379o();
            oqo oqoVarMo27379o2 = qgeVar.mo27379o();
            while (true) {
                if (oqoVarMo27379o != null && oqoVarMo27379o2 != null) {
                    if (!(oqoVarMo27379o instanceof mxh0)) {
                        if (!(oqoVarMo27379o2 instanceof mxh0)) {
                            if (oqoVarMo27379o instanceof m3m0) {
                                if (!(oqoVarMo27379o2 instanceof m3m0) || !wj50.m88271j(((n3m0) ((m3m0) oqoVarMo27379o)).f150085f, ((n3m0) ((m3m0) oqoVarMo27379o2)).f150085f)) {
                                    break;
                                }
                            } else if (!(oqoVarMo27379o2 instanceof m3m0) && wj50.m88271j(oqoVarMo27379o.getName(), oqoVarMo27379o2.getName())) {
                                oqoVarMo27379o = oqoVarMo27379o.mo27379o();
                                oqoVarMo27379o2 = oqoVarMo27379o2.mo27379o();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = oqoVarMo27379o2 instanceof mxh0;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract nfe mo25169G();
}
