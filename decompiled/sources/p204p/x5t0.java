package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x5t0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final x5t0 f258515a;
    private static final ktz0 descriptor;

    static {
        x5t0 x5t0Var = new x5t0();
        f258515a = x5t0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.PublicKeyCredentialRequestOptions", x5t0Var, 4);
        vwp0Var.m86594k("challenge", false);
        vwp0Var.m86594k("rpId", false);
        vwp0Var.m86594k("timeout", false);
        vwp0Var.m86594k("userVerification", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, u2b0.f226058a, epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
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
            } else if (iMo29816p == 2) {
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new z5t0(i, jMo39227i0, strMo39226f, strMo39226f2, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        z5t0 z5t0Var = (z5t0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = z5t0Var.f279631a;
        String str2 = z5t0Var.f279634d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, z5t0Var.f279632b);
        hrhVarMo35820b.mo44942l(ktz0Var, 2, z5t0Var.f279633c);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
