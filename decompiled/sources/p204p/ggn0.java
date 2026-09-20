package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ggn0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ggn0 f79706a;
    private static final ktz0 descriptor;

    static {
        ggn0 ggn0Var = new ggn0();
        f79706a = ggn0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.payment.paymentimpl.view.field.PciBridgeTranslations", ggn0Var, 12);
        vwp0Var.m86594k("cardNumberLabel", false);
        vwp0Var.m86594k("securityCodeLabel", false);
        vwp0Var.m86594k("expirationDateLabel", false);
        vwp0Var.m86594k("expirationDatePlaceholder", false);
        vwp0Var.m86594k("personalCardLabel", false);
        vwp0Var.m86594k("corporateCardLabel", false);
        vwp0Var.m86594k("birthDateLabel", false);
        vwp0Var.m86594k("birthDatePlaceholder", false);
        vwp0Var.m86594k("corporateRegistrationNumberLabel", false);
        vwp0Var.m86594k("corporateRegistrationNumberPlaceholder", false);
        vwp0Var.m86594k("twoDigitPinLabel", false);
        vwp0Var.m86594k("twoDigitPinPlaceholder", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var};
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
        String strMo39226f8 = null;
        String strMo39226f9 = null;
        String strMo39226f10 = null;
        String strMo39226f11 = null;
        String strMo39226f12 = null;
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
                case 7:
                    strMo39226f8 = frhVarMo29814b.mo39226f(ktz0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    strMo39226f9 = frhVarMo29814b.mo39226f(ktz0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strMo39226f10 = frhVarMo29814b.mo39226f(ktz0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strMo39226f11 = frhVarMo29814b.mo39226f(ktz0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    strMo39226f12 = frhVarMo29814b.mo39226f(ktz0Var, 11);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ign0(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, strMo39226f6, strMo39226f7, strMo39226f8, strMo39226f9, strMo39226f10, strMo39226f11, strMo39226f12);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ign0 ign0Var = (ign0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, ign0Var.f102014a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, ign0Var.f102015b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, ign0Var.f102016c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, ign0Var.f102017d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, ign0Var.f102018e);
        hrhVarMo35820b.mo44931G(ktz0Var, 5, ign0Var.f102019f);
        hrhVarMo35820b.mo44931G(ktz0Var, 6, ign0Var.f102020g);
        hrhVarMo35820b.mo44931G(ktz0Var, 7, ign0Var.f102021h);
        hrhVarMo35820b.mo44931G(ktz0Var, 8, ign0Var.f102022i);
        hrhVarMo35820b.mo44931G(ktz0Var, 9, ign0Var.f102023j);
        hrhVarMo35820b.mo44931G(ktz0Var, 10, ign0Var.f102024k);
        hrhVarMo35820b.mo44931G(ktz0Var, 11, ign0Var.f102025l);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
