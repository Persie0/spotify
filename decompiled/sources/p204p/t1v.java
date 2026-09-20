package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t1v implements g210 {

    /* JADX INFO: renamed from: a */
    public static final t1v f216360a;
    private static final ktz0 descriptor;

    static {
        t1v t1vVar = new t1v();
        f216360a = t1vVar;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.EncryptionInfo", t1vVar, 4);
        vwp0Var.m86594k("key_system", false);
        vwp0Var.m86594k("encryption_scheme", true);
        vwp0Var.m86594k("license_server_endpoint", true);
        vwp0Var.m86594k("encryption_data", true);
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
        return new v1v(i, strMo39226f, strMo39226f2, strMo39226f3, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        v1v v1vVar = (v1v) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = v1vVar.f236478a;
        String str2 = v1vVar.f236480c;
        String str3 = v1vVar.f236479b;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str3, "cenc")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 1, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "/widevine-license/v1/video/license")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 2, str2);
        }
        String str4 = v1vVar.f236481d;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str4);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
