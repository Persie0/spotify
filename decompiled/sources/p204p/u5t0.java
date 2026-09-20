package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u5t0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final u5t0 f227107a;
    private static final ktz0 descriptor;

    static {
        u5t0 u5t0Var = new u5t0();
        f227107a = u5t0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.PublicKeyCredentialParameters", u5t0Var, 2);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("alg", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, e450.f55982a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new w5t0(i, strMo39226f, iMo39229o);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        w5t0 w5t0Var = (w5t0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, w5t0Var.f248196a);
        hrhVarMo35820b.mo44938e(1, w5t0Var.f248197b, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
