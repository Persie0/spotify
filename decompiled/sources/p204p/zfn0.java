package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zfn0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final zfn0 f282352a;
    private static final ktz0 descriptor;

    static {
        zfn0 zfn0Var = new zfn0();
        f282352a = zfn0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.payment.paymentimpl.view.field.PciBridgeErrorMessages", zfn0Var, 7);
        vwp0Var.m86594k("invalidCardNumber", false);
        vwp0Var.m86594k("invalidCvc", false);
        vwp0Var.m86594k("invalidExpiryDate", false);
        vwp0Var.m86594k("expiredExpiryDate", false);
        vwp0Var.m86594k("invalidBirthDate", false);
        vwp0Var.m86594k("invalidCorporateRegistrationNumber", false);
        vwp0Var.m86594k("invalidTwoDigitPin", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        String strMo39226f6 = null;
        String strMo39226f7 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f5 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo39226f6 = frhVarMo29814b.mo39226f(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo39226f7 = frhVarMo29814b.mo39226f(ktz0Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new bgn0(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, strMo39226f6, strMo39226f7);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        bgn0 bgn0Var = (bgn0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, bgn0Var.f26973a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, bgn0Var.f26974b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, bgn0Var.f26975c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, bgn0Var.f26976d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, bgn0Var.f26977e);
        hrhVarMo35820b.mo44931G(ktz0Var, 5, bgn0Var.f26978f);
        hrhVarMo35820b.mo44931G(ktz0Var, 6, bgn0Var.f26979g);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
