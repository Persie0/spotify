package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tl7 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final tl7 f221349a;
    private static final ktz0 descriptor;

    static {
        tl7 tl7Var = new tl7();
        f221349a = tl7Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.AuthenticationResponseJson", tl7Var, 4);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("rawId", false);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("response", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ok7.f166288a};
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
        qk7 qk7Var = null;
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
                qk7Var = (qk7) frhVarMo29814b.mo39210A(ktz0Var, 3, ok7.f166288a, qk7Var);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new vl7(i, strMo39226f, strMo39226f2, strMo39226f3, qk7Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        vl7 vl7Var = (vl7) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, vl7Var.f242391a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, vl7Var.f242392b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, vl7Var.f242393c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, ok7.f166288a, vl7Var.f242394d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
