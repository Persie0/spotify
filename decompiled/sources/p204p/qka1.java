package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qka1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final qka1 f189515a;
    private static final ktz0 descriptor;

    static {
        qka1 qka1Var = new qka1();
        f189515a = qka1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.payment.paymentimpl.UrlEntry", qka1Var, 3);
        vwp0Var.m86594k("sessionId", false);
        vwp0Var.m86594k("url", false);
        vwp0Var.m86594k("timestamp", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, u2b0.f226058a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        long jMo39227i0 = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ska1(i, strMo39226f, strMo39226f2, jMo39227i0);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ska1 ska1Var = (ska1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, ska1Var.f210068a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, ska1Var.f210069b);
        hrhVarMo35820b.mo44942l(ktz0Var, 2, ska1Var.f210070c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
