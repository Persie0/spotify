package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s5n0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final s5n0 f205866a;
    private static final ktz0 descriptor;

    static {
        s5n0 s5n0Var = new s5n0();
        f205866a = s5n0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.partnerapps.domain.api.PartnerIntegrationsEntry", s5n0Var, 3);
        vwp0Var.m86594k("connectionStatus", false);
        vwp0Var.m86594k(kyx.f127931b, true);
        vwp0Var.m86594k("partnerIntegrationId", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{v5n0.f237536d[0].getValue(), epv0.m39700t(ql51Var), ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = v5n0.f237536d;
        frhVarMo29814b.getClass();
        u5n0 u5n0Var = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String strMo39226f = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                u5n0Var = (u5n0) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), u5n0Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new v5n0(i, u5n0Var, str, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        v5n0 v5n0Var = (v5n0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        rr60 rr60Var = (rr60) v5n0.f237536d[0].getValue();
        u5n0 u5n0Var = v5n0Var.f237537a;
        String str = v5n0Var.f237538b;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, rr60Var, u5n0Var);
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 2, v5n0Var.f237539c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
