package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public abstract class txq {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f224744a = 0;

    static {
        qti0.m73841e("value");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m81928a(s3b1 s3b1Var) {
        return vsf1.m86311A(Collections.singletonList(s3b1Var), new0.f153132X0, sxq.f214985h).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static eab m81929b(eab eabVar, gh00 gh00Var) {
        return (eab) vsf1.m86337w(Collections.singletonList(eabVar), new bx3(9), new qem(new rlv0(), gh00Var));
    }

    /* JADX INFO: renamed from: c */
    public static final y400 m81930c(qqo qqoVar) {
        z400 z400VarM76668f = rxq.m76668f(qqoVar);
        if (!z400VarM76668f.m95304d()) {
            z400VarM76668f = null;
        }
        if (z400VarM76668f != null) {
            return z400VarM76668f.m95308i();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final nfe m81931d(y15 y15Var) {
        qge qgeVarMo25169G = y15Var.getType().mo36063C0().mo25169G();
        if (qgeVarMo25169G instanceof nfe) {
            return (nfe) qgeVarMo25169G;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final ib70 m81932e(oqo oqoVar) {
        return rxq.m76665c(oqoVar).mo53211g();
    }

    /* JADX INFO: renamed from: f */
    public static final vfe m81933f(qge qgeVar) {
        oqo oqoVarMo27379o;
        vfe vfeVarM81933f;
        if (qgeVar == null || (oqoVarMo27379o = qgeVar.mo27379o()) == null) {
            return null;
        }
        if (oqoVarMo27379o instanceof m3m0) {
            return new vfe(((n3m0) ((m3m0) oqoVarMo27379o)).f150085f, qgeVar.getName());
        }
        if (!(oqoVarMo27379o instanceof rge) || (vfeVarM81933f = m81933f((qge) oqoVarMo27379o)) == null) {
            return null;
        }
        return vfeVarM81933f.m85356d(qgeVar.getName());
    }

    /* JADX INFO: renamed from: g */
    public static final y400 m81934g(oqo oqoVar) {
        y400 y400VarM76669g = rxq.m76669g(oqoVar);
        return y400VarM76669g != null ? y400VarM76669g : rxq.m76668f(oqoVar.mo27379o()).m95301a(oqoVar.getName()).m95308i();
    }

    /* JADX INFO: renamed from: h */
    public static final void m81935h(mxh0 mxh0Var) {
        if (mxh0Var.mo53210Z(uqe1.f233000a) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final eab m81936i(eab eabVar) {
        return eabVar instanceof kys0 ? ((lys0) ((kys0) eabVar)).m60266H1() : eabVar;
    }
}
