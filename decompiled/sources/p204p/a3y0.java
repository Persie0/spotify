package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a3y0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final a3y0 f12082a;
    private static final ktz0 descriptor;

    static {
        a3y0 a3y0Var = new a3y0();
        f12082a = a3y0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.partneraccountlinking.common.samsung.SamsungLinkingRequest", a3y0Var, 4);
        vwp0Var.m86594k("access_token", false);
        vwp0Var.m86594k("auth_code", false);
        vwp0Var.m86594k("auth_server_url", false);
        vwp0Var.m86594k("api_server_url", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else if (iMo29816p == 1) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                i |= 2;
            } else if (iMo29816p == 2) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new c3y0(i, str, str2, strMo39226f, strMo39226f2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        c3y0 c3y0Var = (c3y0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        ql51 ql51Var = ql51.f189738a;
        hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51Var, c3y0Var.f33780a);
        hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51Var, c3y0Var.f33781b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, c3y0Var.f33782c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, c3y0Var.f33783d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
