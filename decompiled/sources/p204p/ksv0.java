package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ksv0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ksv0 f126053a;
    private static final ktz0 descriptor;

    static {
        ksv0 ksv0Var = new ksv0();
        f126053a = ksv0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.RegistrationResponseJson", ksv0Var, 4);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("rawId", false);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("response", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, hsv0.f94810a};
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
        jsv0 jsv0Var = null;
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
            } else if (iMo29816p == 2) {
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                jsv0Var = (jsv0) frhVarMo29814b.mo39210A(ktz0Var, 3, hsv0.f94810a, jsv0Var);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new msv0(i, strMo39226f, strMo39226f2, strMo39226f3, jsv0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        msv0 msv0Var = (msv0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, msv0Var.f146866a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, msv0Var.f146867b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, msv0Var.f146868c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, hsv0.f94810a, msv0Var.f146869d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
