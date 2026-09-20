package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ok7 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ok7 f166288a;
    private static final ktz0 descriptor;

    static {
        ok7 ok7Var = new ok7();
        f166288a = ok7Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.AuthenticationInnerResponse", ok7Var, 4);
        vwp0Var.m86594k("clientDataJSON", false);
        vwp0Var.m86594k("authenticatorData", false);
        vwp0Var.m86594k("signature", false);
        vwp0Var.m86594k("userHandle", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, epv0.m39700t(ql51Var)};
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
        String str = null;
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
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new qk7(i, strMo39226f, strMo39226f2, strMo39226f3, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        qk7 qk7Var = (qk7) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = qk7Var.f189481a;
        String str2 = qk7Var.f189484d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, qk7Var.f189482b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, qk7Var.f189483c);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
